import javax.swing.JOptionPane;
public class ServicoBebidas extends PacoteDecorator {
    public ServicoBebidas(String desc, String origem, int data1, int data2, double precoDecorator, double taxaDecor, double calDecorator, double precoBebidas) {
        super(desc, origem, data1, data2, precoDecorator, taxaDecor, calDecorator);
        this.precoBebidas = precoBebidas;
    }

    private double taxaBebidas = 0.15;

    public double getPrecoBebidas() {
        return precoBebidas;
    }

    public void setPrecoBebidas(double precoBebidas) {
        this.precoBebidas = precoBebidas;
    }

    private double precoBebidas = 4;
    private double calTBebidas;

    public ServicoBebidas(String desc, String origem, int data1, int data2, double precoDecorator, double taxaDecor, double calDecorator, double taxaBebidas, double calTBebidas) {
        super(desc, origem, data1, data2, precoDecorator, taxaDecor, calDecorator,taxaBebidas,calTBebidas );
        this.taxaBebidas = taxaBebidas;
        this.calTBebidas = calTBebidas;
    }


    public double getTaxaBebidas() {
        return taxaBebidas;
    }

    public void setTaxaBebidas(double taxaBebidas) {
        this.taxaBebidas = taxaBebidas;
    }

    public double getCalTBebidas() {
        return calTBebidas;
    }

    public void setCalTBebidas(double calTBebidas) {
        this.calTBebidas = calTBebidas;
    }
    public void calcularBebidas(){
        this.calTBebidas=this.taxaBebidas*this.precoBebidas;
    }
}
