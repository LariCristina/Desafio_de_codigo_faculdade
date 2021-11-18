import javax.swing.JOptionPane;
public class ServicoPassageirosExtras extends PacoteDecorator {
    private double PasExtras = 50.50;

    public ServicoPassageirosExtras(String desc, String origem, int data1, int data2, double precoDecorator, double taxaDecor, double calDecorator) {
        super(desc, origem, data1, data2, precoDecorator, taxaDecor, calDecorator);
    }

    public double getPasExtras() {
        return PasExtras;
    }

    public void setPasExtras(double pasExtras) {
        PasExtras = pasExtras;
    }
    public void mostrarPassageiroExtra(){
        JOptionPane.showMessageDialog(null,"Preço por pessoa: "+this.PasExtras);
    }
}


