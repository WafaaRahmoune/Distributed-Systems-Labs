package Euro;

import org.omg.CORBA.*;
import org.omg.PortableServer.*;
import org.omg.CosNaming.*;
public class Serveur {
    public static void main(String args[]) {
        try {
            // Initialisation de l'ORB
            ORB orb = ORB.init(args, null);

            // Récupération du POA et activation du POA manager
            POA rootpoa = POAHelper.narrow(orb.resolve_initial_references("RootPOA"));
            rootpoa.the_POAManager().activate();

            // Création de l'objet Euro et enregistrement
            EuroImpl euroImpl = new EuroImpl();
            org.omg.CORBA.Object ref = rootpoa.servant_to_reference(euroImpl);
            Eur href = EurHelper.narrow(ref);

            // Liaison avec le service de noms
            org.omg.CORBA.Object objRef = orb.resolve_initial_references("NameService");
            NamingContextExt ncRef = NamingContextExtHelper.narrow(objRef);
            NameComponent path[] = ncRef.to_name("Euro");
            ncRef.rebind(path, href);

            System.out.println("Serveur Euro prêt...");
            orb.run();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}