public class LampenServiceSkeleton {
    public void listen() {
        try {
            ServerSocket serverSocket = new ServerSocket(port);
            while (true) {
                Socket client = serverSocket.accept();
                InputStream in = client.getInputStream();
                byte[] data = new byte[1024];
                int length = in.read(data);
                // Unmarshalling der Anfrage
                String request = new String(data, 0, length);
                if ("toggleLampe".equals(request)) {
                    LampenService.getInstance().toggleLampe();
                }
                client.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}