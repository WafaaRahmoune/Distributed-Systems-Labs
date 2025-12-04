package exo4.question1;
import java.rmi.*;
public class Servant extends Thread {
    private InterfaceCallback obj;
    public Servant (InterfaceCallback obj)  /*Le thread doit avoir un attribut de type InterfaceCallback*/
    {
        this.obj = obj;
    }
    public void run ( ) {

        try {
            obj.doCallback ("Bonjour") ;
            obj.doCallback ("J’utilise Java RMI ");
            try {
                Thread.sleep (5000);
            } catch ( InterruptedException e ) { }
            /* appel de la méthode coté client (le callback) */
            obj.doCallback ("Fin ") ;/* appel de la méthode coté client (le callback) */

        }
        catch (RemoteException e ) {
            System.err.println ("Echec appel en retour : " + e ) ;
        }
    }
}
