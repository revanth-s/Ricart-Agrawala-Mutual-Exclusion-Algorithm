import java.rmi.RemoteException;

public class RicartAgrawalaServerImpl implements RicartAgrawala {
  private boolean inCS; // flag to indicate if server is in critical section
  private int numRequests; // number of pending requests

  public RicartAgrawalaServerImpl() {
    inCS = false;
    numRequests = 0;
  }

  public String Process1() {
    numRequests++; // increment number of pending requests
    while (inCS || numRequests > 1) {
      // If server is in critical section or there are pending requests, wait
      try {
        Thread.sleep(10);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
    inCS = true; // enter critical section
    numRequests--; // decrement number of pending requests
    String response = "Process 1 is implemented";
    inCS = false; // exit critical section
    return response;
  }

  @Override
  public String Process2() throws RemoteException {
    numRequests++; // increment number of pending requests
    while (inCS || numRequests > 1) {
      // If server is in critical section or there are pending requests, wait
      try {
        Thread.sleep(10);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
    inCS = true; // enter critical section
    numRequests--; // decrement number of pending requests
    String response = "Process 2 is implemented";
    inCS = false; // exit critical section
    return response;
  }

  @Override
  public String Process3() throws RemoteException {
    numRequests++; // increment number of pending requests
    while (inCS || numRequests > 1) {
      // If server is in critical section or there are pending requests, wait
      try {
        Thread.sleep(10);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
    inCS = true; // enter critical section
    numRequests--; // decrement number of pending requests
    String response = "Process 3 is implemented";
    inCS = false; // exit critical section
    return response;
  }

  @Override
  public String Process4() throws RemoteException {
    numRequests++; // increment number of pending requests
    while (inCS || numRequests > 1) {
      // If server is in critical section or there are pending requests, wait
      try {
        Thread.sleep(10);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
    inCS = true; // enter critical section
    numRequests--; // decrement number of pending requests
    String response = "Process 4 is implemented";
    inCS = false; // exit critical section
    return response;
  }
}