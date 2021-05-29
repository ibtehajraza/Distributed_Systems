package implementations;

import java.rmi.RemoteException;

public class AddImpl implements AddInterface {

	@Override
	public int add(int a, int b) throws RemoteException {
		return a+b;
	}

}
