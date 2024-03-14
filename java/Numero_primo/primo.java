import java.util.Scanner;

public class primo {
    public static void main(String[] args) {
        
        var leitor = new Scanner(System.in);
        System.out.println("digite o valor: ");
        var valor = leitor.nextInt();

        int cont = 2;
        for (;cont < valor;cont++){
            if (valor % cont == 0){
                System.out.println("não é primo");
                break;
            }
            
        }
        System.out.println(cont == valor ? "É primo":"");
        leitor.close();
    }
    
}