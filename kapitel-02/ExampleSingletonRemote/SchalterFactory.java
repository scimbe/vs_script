public class SchalterFactory {
    public static Schalter getSchalter(String type) {
        if (type.equalsIgnoreCase("local")) {
            return new SchalterLocal();
        } else if (type.equalsIgnoreCase("remote")) {
            return new SchalterRemote();
        }
        throw new IllegalArgumentException("Unbekannter Schaltertyp: " + type);
    }
}