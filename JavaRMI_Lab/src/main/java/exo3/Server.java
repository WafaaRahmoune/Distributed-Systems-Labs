package exo3;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class Server {
    public static void main(String [] args) {
        //creer le registre
        try {
            LocateRegistry.createRegistry(1099);
        }catch (RemoteException e){
            System.out.println("le registre est deja crée sur ce port");
        }

        // creer l'objet et l'neregistrer dans l'annuaire:
        try {
            TriangleInterface triangle = new TriangleImpl();
            Naming.rebind("rmi://localhost:1099/Triangle",triangle);
        }catch (RemoteException  e){
            System.out.println("probleme de creation d'objet");
        }catch (MalformedURLException e){
            System.out.println("url mal formé");
        }
    }
}
