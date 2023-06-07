import java.util.HashMap;

// Maak een nieuwe class aan en noem deze Translator.
public class Translator {

// Maak in de Translator class een HashMap<Integer,String> variabele met de naam numericAlpha.
    private HashMap<Integer, String> numericAlpha;

// Maak in de Translator class een constructor die de volgende parameters krijgt: (String[] alphabetic, Integer[] numeric).
    public Translator(String[] alphabetic, Integer[] numeric) {
        numericAlpha = new HashMap<>();

// Schrijf in de constructor een for-loop die begint bij 0 en doorgaat tot de lengte van de numeric/alphabetic array (maakt niet uit welke, ze zijn even lang).
// Voeg in de body van de for-loop een nieuwe entry toe aan de HashMap met de correcte waardes uit numeric en alphabetic. Gebruik de i variabele uit je for-loop om de correcte waardes uit de arrays te halen.
        // Controleren of de arrays dezelfde lengte hebben
        if (alphabetic.length != numeric.length) {
            throw new IllegalArgumentException("De lengtes van de arrays komen niet overeen.");
        }
        // Toevoegen van waarden aan de HashMap
        for (int i = 0; i < alphabetic.length; i++) {
            numericAlpha.put(numeric[i], alphabetic[i]);
        }
    }

// Maak in de Translator class een nieuwe methode genaamd translate(Integer number) die een String returnt.
// In de body van de translate methode return je de waarde (value) uit de numericAlpha HashMap die hoort bij de sleutel (key) van number
    public String translate(Integer number) {
        return numericAlpha.get(number);
    }

    public static void main(String[] args) {
        String[] alphabetic = {"een", "twee", "drie", "vier", "vijf", "zes", "zeven", "acht", "negen", "nul"};
        Integer[] numeric = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};

        Translator translator = new Translator(alphabetic, numeric);

        Integer number = 5;
        String translatedValue = translator.translate(number);
        System.out.println("Het nummer " + number + " wordt vertaald naar: " + translatedValue);
    }
}