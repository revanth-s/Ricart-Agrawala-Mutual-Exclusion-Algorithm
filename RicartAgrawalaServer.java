import java.rmi.RemoteException;
import java.rmi.registry.*;
import java.rmi.server.*;

public class RicartAgrawalaServer {

  public static void main(String args[]) throws RemoteException {

    // important for the rmi registry location
    System.setProperty("java.rmi.server.hostname", "192.168.178.49");
    Registry reg = null;

    int port = 1100;
    try {
      reg = LocateRegistry.createRegistry(port);
    } catch (Exception ce) {
      System.out.println("Error: " + ce.toString());
    }

    // creating instance of implemented class
    RicartAgrawalaServerImpl ricartAgrawalaImpl = new RicartAgrawalaServerImpl();
    try {
      RicartAgrawala stub = (RicartAgrawala) UnicastRemoteObject.exportObject(ricartAgrawalaImpl, 1100);
      // bind token "Hello" and the created instance
      reg.rebind("RicartAgrawalaServer", stub);
      System.out.println("Server has been started.");
    } catch (Exception e) {
      System.out.println("Error: " + e.toString());
    }
    return;
  }
}
