import javax.swing.JOptionPane;
public class PacoteDecorator extends Pacote{
    private double precoDecorator = 100;
    private double taxaDecor =0.3;
    private double calDecorator;

    public PacoteDecorator(String desc, String origem, int data1, int data2, double precoDecorator, double taxaDecor, double calDecorator) {
        super(desc, origem, data1, data2);
        this.precoDecorator = precoDecorator;
        this.taxaDecor = taxaDecor;
        this.calDecorator = calDecorator;
    }

    public PacoteDecorator(String desc, String origem, int data1, int data2, double precoDecorator, double taxaDecor, double calDecorator, double taxaBebidas, double calTBebidas) {
    }

    public double getPrecoDecorator() {
        return precoDecorator;
    }

    public void setPrecoDecorator(double precoDecorator) {
        this.precoDecorator = precoDecorator;
    }

    public double getTaxaDecor() {
        return taxaDecor;
    }

    public void setTaxaDecor(double taxaDecor) {
        this.taxaDecor = taxaDecor;
    }

    public double getCalDecorator() {
        return calDecorator;
    }

    public void setCalDecorator(double calDecorator) {
        this.calDecorator = calDecorator;
    }
    
    public void calcularDecorator(){
        this.calDecorator=this.precoDecorator*this.taxaDecor;
    }
    
    public void mostarDecorator(){
        JOptionPane.showMessageDialog(null,"Preço: "+this.calDecorator);
    }
}
