import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class RicartAgrawalaClient {

  public static void main(String[] args) throws Exception {
    String ip = "192.168.178.49";
    int port = 1100;
    try {
      Registry registry = LocateRegistry.getRegistry(ip, port);
      RicartAgrawala stub = (RicartAgrawala) registry.lookup("RicartAgrawalaServer");

      String response1 = stub.Process1();
      String response2 = stub.Process2();
      String response3 = stub.Process3();
      String response4 = stub.Process4();

      System.out.println("Response 3: " + response3);
      System.out.println("Response 1: " + response1);
      System.out.println("Response 4: " + response4);
      System.out.println("Response 2: " + response2);

    } catch (Exception e) {
      System.out.println("Error: " + e.toString());
    }
  }
}