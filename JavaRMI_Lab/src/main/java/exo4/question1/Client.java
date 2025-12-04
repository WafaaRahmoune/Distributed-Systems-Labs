package exo4.question1;

import java.rmi.Naming;
public class Client {
    public static void main( String [ ] args ) throws Exception {
        Callback  obj1 = new Callback ( ) ;
        /* création de l’objet callback (de type Remote)*/
        InterfaceServeur serv = (InterfaceServeur) Naming.lookup ("Server");
        System.out.println ("Début de l’appel");
        serv.replycallBack (obj1);

        /* RMI classique */
    }
}
