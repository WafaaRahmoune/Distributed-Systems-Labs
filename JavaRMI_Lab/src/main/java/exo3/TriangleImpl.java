package exo3;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
public class TriangleImpl extends UnicastRemoteObject implements TriangleInterface {
    public TriangleImpl()throws RemoteException{}
    public String trainglefigureA(int a) throws RemoteException {
        StringBuilder result = new StringBuilder();
        for (int i = 1; i <= a; i++) {
            // Ajouter les espaces
            for (int j = 1; j <= a - i; j++) {
                result.append(" ");
            }
            // Ajouter les étoiles avec un espace entre elles
            for (int k = 1; k <= i; k++) {
                result.append("* ");
            }
            result.append("\n");
        }
        return result.toString();
    }
    public String trainglefigureB(int a) throws RemoteException {
        StringBuilder result = new StringBuilder();
        int stars = 2 * a - 1;
        for (int i = 0; i < a; i++) {
            // Ajouter les espaces
            for (int j = 0; j < i; j++) {
                result.append(" ");
            }
            // Ajouter les étoiles
            for (int k = 0; k < stars; k++) {
                result.append("*");
            }
            result.append("\n");
            stars -= 2;
        }
        return result.toString();
    }
}
