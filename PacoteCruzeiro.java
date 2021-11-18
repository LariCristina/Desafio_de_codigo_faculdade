import javax.swing.JOptionPane;
public class PacoteCruzeiro extends Pacote{
    private double precoCruzeiro = 250;
    private double taxaCruzeiro = 1.6;
    private double calCrzeiro;

    public PacoteCruzeiro(String desc, String origem, int data1, int data2, double precoCruzeiro, double taxaCruzeiro, double calCrzeiro) {
        super(desc, origem, data1, data2,precoCruzeiro,taxaCruzeiro,calCrzeiro);
        this.precoCruzeiro = precoCruzeiro;
        this.taxaCruzeiro = taxaCruzeiro;
        this.calCrzeiro = calCrzeiro;
    }


    public double getPrecoCruzeiro() {
        return precoCruzeiro;
    }

    public void setPrecoCruzeiro(double precoCruzeiro) {
        this.precoCruzeiro = precoCruzeiro;
    }

    public double getTaxaCruzeiro() {
        return taxaCruzeiro;
    }

    public void setTaxaCruzeiro(double taxaCruzeiro) {
        this.taxaCruzeiro = taxaCruzeiro;
    }

    public double getCalCrzeiro() {
        return calCrzeiro;
    }

    public void setCalCrzeiro(double calCrzeiro) {
        this.calCrzeiro = calCrzeiro;
    }

    public void calcularCruzeiro(){
        this.calCrzeiro=this.precoCruzeiro*this.taxaCruzeiro;
    }

    public void mostarCruzeiro(){
        JOptionPane.showMessageDialog(null,"Preço: "+this.calCrzeiro);
    }
}
