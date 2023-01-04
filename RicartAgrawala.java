import java.rmi.Remote;
import java.rmi.RemoteException;

public interface RicartAgrawala extends Remote {
  public String Process1() throws RemoteException;

  public String Process2() throws RemoteException;

  public String Process3() throws RemoteException;

  public String Process4() throws RemoteException;

}
