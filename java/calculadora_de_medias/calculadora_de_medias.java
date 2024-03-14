import java.util.Scanner;

public class calculadora_de_medias{

    static Double resultado;
    public static void main(String[] args) {
        
        Scanner valor = new Scanner(System.in);
        System.out.println("quantos numeros você deseja calcular a média?");
        int tamanho = valor.nextInt();
        double [] numero = new double[tamanho];
        
        for (int i= 0; i < tamanho; i++){
            System.out.println("Digite os numeros: ");
             if(valor.hasNextDouble()) {
                 numero [i] = valor.nextDouble();
             }
        }

        double soma = 0;

        for (int i = 0; i < tamanho; i++){
            soma += numero[i];
        }
                    
        double media = soma / tamanho;

        System.out.println("a média dos numeros é: " + media);

    }
}