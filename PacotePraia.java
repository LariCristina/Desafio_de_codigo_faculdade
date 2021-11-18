import javax.swing.JOptionPane;
import java.text.SimpleDateFormat;

public class PacotePraia extends Pacote {
    private double calP = 0;
    private double precoPraia = 100;
    private double taxa = 0.5;

    public PacotePraia(String desc,String origem,int data1,int data2, double calP, double precoPraia, double taxa) {
        super(desc, origem, calP,precoPraia,taxa);
        this.calP = calP;
        this.precoPraia = precoPraia;

        this.taxa = taxa;
    }


    public double getCalP() {
        return calP;
    }

    public void setCalP(double calP) {
        this.calP = calP;
    }

    public double getPrecoPraia() {
        return precoPraia;
    }

    public void setPrecoPraia(double precoPraia) {
        this.precoPraia = precoPraia;
    }

    public double getTaxa() {
        return taxa;
    }

    public void setTaxa(double taxa) {
        this.taxa = taxa;
    }

    public void calclarPraia(){
        this.calP=this.precoPraia*this.taxa;
    }

    public void mostrarPraia(){
        JOptionPane.showMessageDialog(null,"Preço: "+this.calP);
    }
}
