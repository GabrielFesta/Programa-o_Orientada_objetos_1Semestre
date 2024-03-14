import static javax.swing.JOptionPane.*;
import static java.lang.Double.parseDouble;


public class Estrutura_De_Repeticao {
    public static void main(String[] args) {
        //while
        //double nota1, nota2;
        // int count= 1;

        // while (count <= 3) {
            
        //     nota1 = parseDouble(showInputDialog("Digite a primeira nota: "));
        //     nota2 = parseDouble(showInputDialog("Digite a segunda nota: "));

        //     double media = (nota1 + nota2)/2;

        //     JOptionPane.showMessageDialog(null,"Media desse aluno é: "+ media);

        //     count = count + 1;
        //}

        //for

            Double nota1;
            Double nota2;
            Double media;
            double mediaTotal = 0;
            int numerosAlunos;
            int i;

            numerosAlunos = (int)parseDouble(showInputDialog("Digite quantos alunos você tem: "));

            for(i = 1; i <= numerosAlunos; i++){
                
                nota1 = parseDouble(showInputDialog("Digite a primeira nota: "));
                nota2 = parseDouble(showInputDialog("Digite a segunda nota: "));

                media = (nota1 + nota2)/2;
                mediaTotal = mediaTotal + media;

                showMessageDialog(null,"Media desse aluno é: "+ media);
            
                mediaTotal = media/numerosAlunos;

            }

            showMessageDialog(null,"Media da turma: " + mediaTotal);

    }
}