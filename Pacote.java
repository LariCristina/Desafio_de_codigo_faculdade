import javax.swing.JOptionPane;

public class Pacote {
    private String desc;
    private String origem;
    private int data1 = 20 / 02 / 2022;
    private int data2 = 24 / 02 / 2022;


    public Pacote(String desc,String origem,int data1,int data2) {
        this.desc = desc;
        this.origem = origem;
        this.data1=data1;
        this.data2=data2;
    }

    public Pacote() {

    }

    public Pacote(String desc, String origem, double calP, double precoPraia, int data1, int data2, double taxa) {
    }

    public Pacote(String desc, String origem, int data1, int data2, double calP, double precoPraia, double taxa) {
    }

    public Pacote(String desc, String origem, double calP, double precoPraia, double taxa) {
    }


    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public void mostarPacote(){
        JOptionPane.showMessageDialog(null,"O destino é: "+this.desc+"\n"+
                                                                 "Origem de partida: "+this.origem);
        Integer.parseInt(JOptionPane.showInputDialog("Data ida e volta: "+this.data1+"\n"+this.data2));
    }

    public int getData1() {
        return data1;
    }

    public void setData1(int data1) {
        this.data1 = data1;
    }

    public int getData2() {
        return data2;
    }

    public void setData2(int data2) {
        this.data2 = data2;
    }
}