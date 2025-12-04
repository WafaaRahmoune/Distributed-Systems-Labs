package exo4.question1;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;


public class Serveur extends UnicastRemoteObject implements InterfaceServeur {

    public Serveur ( ) throws RemoteException { }

    public void replycallBack (InterfaceCallback obj) throws RemoteException {

        Servant servant = new Servant (obj) ; /* Création du thread */

        servant.start ( ) ; /* Démarrage du thread */


    }

    public static void main( String [ ] args ) throws Exception {

        try {
            LocateRegistry.createRegistry(1099);
        }
        catch (RemoteException e1) {
            System.err.println("Ce port est déjà utiliser par rmiregistery");
            System.exit(1);
        }

        Serveur serv = new Serveur ( ) ;
        Naming.rebind ("Server" , serv) ;
        System.out.println (" Le serveur est prêt" ) ;
    }
}
