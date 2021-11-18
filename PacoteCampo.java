import javax.swing.JOptionPane;
public class PacoteCampo extends Pacote{
    private double precoCamp = 150;
    private double taxaCam = 0.7;
    private double calCamp;

    public PacoteCampo(String desc, String origem, int data1, int data2, double precoCamp, double taxaCam, double calCamp) {
        super(desc, origem, data1, data2,precoCamp,taxaCam,calCamp);
        this.precoCamp = precoCamp;
        this.taxaCam = taxaCam;
        this.calCamp = calCamp;
    }

    public double getPrecoCampo() {
        return precoCamp;
    }

    public void setPrecoCampo(double precoCampo) {
        this.precoCamp = precoCampo;
    }

    public double getTaxaCamp() {
        return taxaCam;
    }

    public void setTaxaCamp(double taxaCamp) {
        this.taxaCam = taxaCamp;
    }

    public double getCalCamp() {
        return calCamp;
    }

    public void setCalCamp(double calCamp) {
        this.calCamp = calCamp;
    }

    public void calcularCamp(){
        this.calCamp=this.precoCamp*this.taxaCam;
    }

    public void mostarCampo(){
        JOptionPane.showMessageDialog(null,"Preço: "+this.calCamp);

    }
}
