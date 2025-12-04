package exo4.question1;
import java.rmi.Remote;
import java.rmi.RemoteException;
    public interface InterfaceServeur extends Remote {
        public void replycallBack (InterfaceCallback  obj) throws RemoteException;
    }
