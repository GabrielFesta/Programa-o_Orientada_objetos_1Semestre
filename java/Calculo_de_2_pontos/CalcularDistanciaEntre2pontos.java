import java.util.Scanner;
public class CalcularDistanciaEntre2pontos {
    static public void main(String args []){
        //indentação
        //declaração de variáveis
        Scanner leitor = new Scanner (System.in);
        float x1,x2,y1,y2;
        float dist;
        //entrada
        System.out.println("Digite x1: ");
        x1 = leitor.nextFloat(); // Anologia, poderia ser o acelerar do carro ou ate mesmo o comer de uma casa veico.acelerar(), casa.comer()
        System.out.println("Digite x2 ");
        x2 = leitor.nextFloat();
        System.out.println("Digite y1 ");
        y1 = leitor.nextFloat();
        System.out.println("Digite y2 ");
        y2 = leitor.nextFloat();

        //processamento 

        dist = (float) Math.sqrt ((x2 - x1) * (x2 - x1) + Math.pow(y2 - y1,2));

        //saida 
        System.out.printf("A distancia entre p1 (%.2f , %.2f) e p2 (%.2f , %.2f) é: %f", x1,y1,x2,y2,dist);
    }
    }