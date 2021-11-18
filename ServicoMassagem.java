import javax.swing.JOptionPane;
public class ServicoMassagem extends PacoteDecorator{
    private double taxaMassagem = 0.65;
    private double precoMassagem = 100;
    private double calTMassagem;

    public ServicoMassagem(String desc, String origem, int data1, int data2, double precoDecorator, double taxaDecor, double calDecorator) {
        super(desc, origem, data1, data2, precoDecorator, taxaDecor, calDecorator);
    }


    public double getTaxaMassagem() {
        return taxaMassagem;
    }

    public void setTaxaMassagem(double taxaMassagem) {
        this.taxaMassagem = taxaMassagem;
    }

    public double getPrecoMassagem() {
        return precoMassagem;
    }

    public void setPrecoMassagem(double precoMassagem) {
        this.precoMassagem = precoMassagem;
    }

    public double getCalTMassagem() {
        return calTMassagem;
    }

    public void setCalTMassagem(double calTMassagem) {
        this.calTMassagem = calTMassagem;
    }
    public void calcularMassagem(){
        this.calTMassagem=this.precoMassagem*this.taxaMassagem;
    }
    public void mostarMassagem(){
        JOptionPane.showMessageDialog(null,"Preço: "+this.calTMassagem);
    }

}
