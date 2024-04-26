public class LampenService {
    private static LampenService instance;
    private LampenService() {}

    public static LampenService getInstance() {
        if (instance == null) {
            instance = new LampenService();
        }
        return instance;
    }

    public void toggleLampe() {
        System.out.println("toogle");
    }
}