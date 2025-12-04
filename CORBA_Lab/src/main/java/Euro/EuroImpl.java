package Euro;
public class EuroImpl extends EurPOA {
    private String devise;
    private double taux;
    public EuroImpl() {
        this.devise = "EUR";
        this.taux = 2.5;}
    public double toEuro(double devise) {
        return devise / taux;
    }
    public double toDevise(double euro) {
        return euro * taux;
    }
    public void setTaux(double taux) {
        this.taux = taux;
    }
    public void setDevise(String devise) {
        this.devise = devise;
    }
    public String devise() {
        return this.devise;
    }
    public void devise(String newDevise) {
        this.devise = newDevise;}
    public double taux() {
        return this.taux;
    }
    public void taux(double newTaux) {
        this.taux = newTaux;}
}