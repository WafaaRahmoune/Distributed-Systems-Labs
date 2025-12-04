package exo2;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;

public class Server  {
    public static void main(String []args){
        try {
            LocateRegistry.createRegistry(1099);
        } catch (RemoteException e) {
            System.out.println("le registre est deja crée sur ce port");
        }
        try {
            ServicesInteface service = new ServiceImpl();
            Naming.rebind("rmi://localhost:1099/Service",service);
        } catch (RemoteException e) {
            e.printStackTrace();
            //System.out.println("probleme de creation d'objet");
        } catch (MalformedURLException e) {
            System.out.println("probleme de url mal formé");
        }
    }
}
