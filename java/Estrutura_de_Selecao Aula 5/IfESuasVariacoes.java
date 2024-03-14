import javax.swing.JOptionPane;

public class IfESuasVariacoes{

    public static void main(String[] args) {
        //declaração de variaves
        double media;
         Double nota1 = (double) Integer.parseInt(JOptionPane.showInputDialog(null,"digite sua primeira nota:  "));
        Double nota2 = (double) Integer.parseInt(JOptionPane.showInputDialog(null, "digite sua segunda nota: "));
        
        //processo
        media = (nota1 + nota2)/2;

        //saida
        if (media >= 6 && media <=7 ){
            JOptionPane.showMessageDialog(null, "Você passou!", null, 1);
        }
        if (media >= 8 && media <=10) { 
            JOptionPane.showMessageDialog(null, "Parabéns sua nota foi muito boa!", null, 1);
        }
        if (media <=5 && media >= 0) {
            JOptionPane.showMessageDialog(null, "você reprovou!",null,0);   
        }
        
    }
}