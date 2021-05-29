package implementations;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class AddClass extends UnicastRemoteObject implements AddInterface {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public AddClass() throws RemoteException {
		super();
	}
	
	public int add(int a, int b) {
		return a+b;
	}

}
