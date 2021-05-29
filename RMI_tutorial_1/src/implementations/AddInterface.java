package implementations;
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface AddInterface extends Remote {

	public int add(int a, int b) throws RemoteException;
	
}
