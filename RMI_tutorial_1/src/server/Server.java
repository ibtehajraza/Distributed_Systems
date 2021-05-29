package server;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import implementations.AddClass;

public class Server {

	public static void main(String args[]) throws Exception {

		Registry registry = LocateRegistry.createRegistry(8090);

		registry.bind("Addition", new AddClass());

		System.out.println("Server is up");

	}

}
