public class Main {
    public static void main(String[] args) {
        // Створення об’єктів класу Connection01
        Connection01 conn1 = new Connection01("localhost", 3306, true);
        Connection01 conn2 = new Connection01("example.com", 8080, false);

        // Вивід інформації в консоль
        System.out.println("Conn1: " + conn1.getHost() + ":" + conn1.getPort() + " secure=" + conn1.isSecure());
        System.out.println("Conn2: " + conn2.getHost() + ":" + conn2.getPort() + " secure=" + conn2.isSecure());
    }
}
