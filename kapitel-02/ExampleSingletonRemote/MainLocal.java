public class MainLocal {
    public static void main(String[] args) {
        Schalter schalter;

        // Auswahl des Schalters basierend auf einem Kriterium (z.B. Kommandozeilenargument)
        // Hier wählen wir statisch "local" oder "remote"
        String schalterTyp = "local"; // oder "remote"

        schalter = SchalterFactory.getSchalter(schalterTyp);
        schalter.toggleLampe();

        // If Remote 
        // starte skeleton
        // LampenServiceSkeleton sk = new LampenServiceSkeleton();
        // sk.listen();

    }
}
