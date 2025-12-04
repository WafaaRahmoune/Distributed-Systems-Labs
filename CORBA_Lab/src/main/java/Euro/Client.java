package Euro;

import org.omg.CORBA.*;
import org.omg.CosNaming.*;
import Euro.*;

public class Client {
    public static void main(String args[]) {
        try {
            // Initialisation de l'ORB
            ORB orb = ORB.init(args, null);

            // Récupération du service de noms
            org.omg.CORBA.Object objRef = orb.resolve_initial_references("NameService");
            NamingContextExt ncRef = NamingContextExtHelper.narrow(objRef);

            // Recherche de l'objet Euro
            Eur euro = EurHelper.narrow(ncRef.resolve_str("Euro"));

            // Test des méthodes
            System.out.println("conversion de 10 usd en euro : " + euro.toEuro(10));
            System.out.println("conversion de 10 euro en usd : " + euro.toDevise(10));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
