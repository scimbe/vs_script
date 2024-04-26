public class LampenServiceClientStub implements Schalter{
    public void toggleLampe() {
        try {
            Socket socket = new Socket("localhost", port);
            OutputStream out = socket.getOutputStream();
            // Marshalling der Anfrage
            String request = "toggleLampe";
            out.write(request.getBytes());
            out.flush();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}



