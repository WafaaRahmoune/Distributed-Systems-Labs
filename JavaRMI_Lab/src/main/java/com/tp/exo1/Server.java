package com.tp.exo1;

import com.tp.exo1.Fib;
import com.tp.exo1.FibImpl;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class Server {
    public static void main (String[]args) {
        try{
            //creer un registre dans le port 1099 qui est par default
            LocateRegistry.createRegistry(1099);

        } catch (RemoteException e) {
            System.out.println("le registe est déja crée sur ce port");
        }

        try{
            //creer un objet de la classe qui contient la methode fib
            Fib fib=new FibImpl();
            //stoquer l'obket dans le registre pour qu'il soit accessible dans le reseau
            Naming.rebind("rmi://localhost:1099/Fib",fib);

        }catch (RemoteException e){
            System.out.println("probleme de creation d'objet");
        }catch (MalformedURLException e) {
            System.out.println("l'URL est incorrecte");

        }

    }
}
