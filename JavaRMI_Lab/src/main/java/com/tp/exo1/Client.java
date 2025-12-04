package com.tp.exo1;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
public class Client {
public static  void main(String[]args){
    String url;
    Fib s=null;
    try {
        url="rmi://localhost:1099/Fib";
        s=(Fib)Naming.lookup(url);
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
    try {
        String result=s.printFibonacci(20);
        System.out.println(result);

    }catch (RemoteException e){
        System.out.println("le server est inactif");
        System.exit(4);
    }
}
}
