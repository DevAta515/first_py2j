
import py4j.GatewayServer;


public class SimpleApp {

    public int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        SimpleApp app = new SimpleApp();
        GatewayServer server = new GatewayServer(app);
        server.start();
        System.out.println("Gateway Server Started");
    }
}
