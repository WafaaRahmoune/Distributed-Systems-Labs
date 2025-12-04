package exo2;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.Scanner;
public class Client {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        String url = null;
        ServicesInteface s = null;
        try {
            url = "rmi://localhost:1099/Service";
            s = (ServicesInteface)Naming.lookup(url);
            String x;
            System.out.println("choose an operation : soustraction , addition,division,multip or end to exit");
             x= scanner.nextLine();
             int result;
            while (!x.equals("end")){
              if (x.equals("soustraction")){result=s.soustractionint(10,5);}
              else if (x.equals("addition")){ result=s.sommeint(10,5);}
              else if (x.equals("multip")){ result=s.produitint(10,5);}
              else  { result=s.divisionint(10,5);}
                System.out.println("le resultat de "+x +" est: "+result);
                System.out.println("choose an operation : soustraction , addition,division,multip or end to exit");
                x= scanner.nextLine();
            }
        } catch (MalformedURLException e) {
            System.out.println("le lien est incorecte");
            System.exit(1);
        } catch (NotBoundException e) {
            System.out.println("le serveur est lancé?");
            System.exit(3);
        } catch (RemoteException e) {
            System.out.println("le registre est lancé");
            System.exit(2);
        }
    }
}
