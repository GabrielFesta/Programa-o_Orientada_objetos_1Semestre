import javax.swing.JOptionPane;

public class SomaJava{

    public static void main(String[] args) {
    
    double primeiroNumero;
    double segundoNumero;
    double resultado;
    
    //Entrada
    primeiroNumero = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número:"));
    segundoNumero= Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número:"));

    //Processo
    resultado = primeiroNumero + segundoNumero;

    // saida
    JOptionPane.showMessageDialog(null,resultado,"Resultado",1);

    }
}

    // javac <nome do arquivo>
    // java <nome da classe>