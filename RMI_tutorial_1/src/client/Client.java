package client;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import implementations.AddInterface;

public class Client {
	
	public static void main(String args[]) throws Exception {
		
		Registry registry = LocateRegistry.getRegistry(8090);
		
		AddInterface obj = (AddInterface) registry.lookup("Addition");
		
		int n = obj.add(5, 4);
		
		System.out.println("Sum is: " + n 
				+ "\nIvoking class: " + obj.getClass().getName());
		
	}

}
