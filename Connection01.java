public class Connection01 {
    private String host;
    private int port;
    private boolean secure;

    // Конструктор класу
    public Connection01(String host, int port, boolean secure) {
        this.host = host;
        this.port = port;
        this.secure = secure;
    }

    // Методи доступу
    public String getHost() {
        return host;
    }

    public int getPort() {
        return port;
    }

    public boolean isSecure() {
        return secure;
    }
}
