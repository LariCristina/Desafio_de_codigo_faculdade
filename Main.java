import javax.swing.JOptionPane;
public class Main {
    public void main(String[] args) {
        int opc = Integer.parseInt(JOptionPane.showInputDialog("Opções de Pacotes de viagens" + "\n" +
                "Escolher um numero de 1 a 3 " + "\n" +
                " 1° Praia" + "\n" +
                " 2° Campo" + "\n" +
                " 3° Cruzeiro" + "\n" +
                " 4° Decorator"));
        switch (opc) {
            case 1:
                String destinoP = JOptionPane.showInputDialog(null, " Digite o seu destino");
                String origemP = JOptionPane.showInputDialog(null, "Digite o local de origem");
                int dataida = Integer.parseInt(JOptionPane.showInputDialog(null));
                int datavolta = Integer.parseInt(JOptionPane.showInputDialog(null));
                double precoPP = Double.parseDouble(null);
                double calculoP = Double.parseDouble(null);
                double taxaPP = Double.parseDouble((null));
                PacotePraia pacotePraia=new PacotePraia(destinoP,origemP,dataida,datavolta,calculoP,precoPP,taxaPP);

                pacotePraia.setDesc(destinoP);
                pacotePraia.setOrigem(origemP);
                pacotePraia.setData1(dataida);
                pacotePraia.setData2(datavolta);
                pacotePraia.setPrecoPraia(precoPP);
                pacotePraia.setCalP(calculoP);
                pacotePraia.setTaxa(taxaPP);

                pacotePraia.calclarPraia();
                pacotePraia.mostarPacote();
                pacotePraia.mostrarPraia();



                break;

            case 2:
                String destinoCamp = JOptionPane.showInputDialog(null, " Digite o seu destino");
                String origemCamp= JOptionPane.showInputDialog(null, "Digite o local de origem");
                int dataidaCamp = Integer.parseInt(JOptionPane.showInputDialog(null));
                int datavoltaCamp = Integer.parseInt(JOptionPane.showInputDialog(null));
                double precoCamp = Double.parseDouble(null);
                double calculoCamp = Double.parseDouble(null);
                double taxaCamp = Double.parseDouble((null));
                PacoteCampo pacoteCampo=new PacoteCampo(destinoCamp,origemCamp,dataidaCamp,datavoltaCamp,precoCamp,taxaCamp,calculoCamp);
                pacoteCampo.setDesc(destinoCamp);
                pacoteCampo.setOrigem(origemCamp);
                pacoteCampo.setData1(dataidaCamp);
                pacoteCampo.setData2(datavoltaCamp);
                pacoteCampo.setPrecoCampo(precoCamp);
                pacoteCampo.setCalCamp(calculoCamp);
                pacoteCampo.setTaxaCamp(taxaCamp);
                pacoteCampo.calcularCamp();
                pacoteCampo.mostarPacote();
                pacoteCampo.mostarCampo();


                break;

            case 3:
                String destinoCruz = JOptionPane.showInputDialog(null, " Digite o seu destino");
                String origemCruz = JOptionPane.showInputDialog(null, "Digite o local de origem");
                int dataidaCruz = Integer.parseInt(JOptionPane.showInputDialog(null));
                int datavoltaCruz = Integer.parseInt(JOptionPane.showInputDialog(null));
                double precoCruz = Double.parseDouble(null);
                double calculoCruz = Double.parseDouble(null);
                double taxaCruz = Double.parseDouble((null));
                PacoteCruzeiro pacoteCruzeiro=new PacoteCruzeiro(destinoCruz,origemCruz,dataidaCruz,datavoltaCruz,precoCruz,taxaCruz,calculoCruz);
                pacoteCruzeiro.setDesc(destinoCruz);
                pacoteCruzeiro.setOrigem(origemCruz);
                pacoteCruzeiro.setData1(dataidaCruz);
                pacoteCruzeiro.setData2(datavoltaCruz);
                pacoteCruzeiro.setPrecoCruzeiro(precoCruz);
                pacoteCruzeiro.setTaxaCruzeiro(taxaCruz);
                pacoteCruzeiro.calcularCruzeiro();
                pacoteCruzeiro.mostarPacote();
                pacoteCruzeiro.mostarCruzeiro();

                break;

            case 4:
                String destinoD = JOptionPane.showInputDialog(null, " Digite o seu destino");
                String origemD = JOptionPane.showInputDialog(null, "Digite o local de origem");
                int dataidaD = Integer.parseInt(JOptionPane.showInputDialog(null));
                int datavoltaD = Integer.parseInt(JOptionPane.showInputDialog(null));
                double precoDD = Double.parseDouble(null);
                double calculoD = Double.parseDouble(null);
                double taxaDD = Double.parseDouble((null));


                break;

        }while (opc != 4) ;
    }
}


