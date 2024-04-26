public class SchalterRemote implements Schalter{
    public void toggleLampe() {
        // Senden der Anfrage über einen Socket
        try {
            LampenServiceClientStub.toggleLampe();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
