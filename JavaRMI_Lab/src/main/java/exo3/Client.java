package exo3;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
public class Client {
    public static void main(String []args){
        String url=null;
        TriangleInterface stub=null;
        //appler l'objet avec son nom et recupérer la reference sous forme de stub qui est le representat local de
        //l'objet distant
        try {
            url="rmi://localhost:1099/Triangle";

            stub=(TriangleInterface)Naming.lookup(url);
        }catch (MalformedURLException | NotBoundException | RemoteException e){
            System.out.println("probleme de url ou de conx avec le server");
        }
         //utliser les methode de l'objet distant comme si il sont local dans la machine
        try {
            System.out.println("le triangle comme dans la figure A");
            System.out.println(stub.trainglefigureA(5));
            System.out.println("le triangle comme dans la figure B");
            System.out.println(stub.trainglefigureB(5));
        }catch (RemoteException e){
            System.out.println("probleme d'invocation des methodes");
        }
    }
}
