public class fatorial {
    public static void main(String[] args) {
        //int n = 4;
        //n! = n * (n - 1) * (n - 2) * ... * 2 * 1(n >= 1)
        //0! = 1
        // int i = 1;
        // int resultado = 1;
        // while (i <= n) {
        //     resultado = resultado * i;
        //     i++;
        // }
        // System.out.println(resultado);


        int numero = 3;
        int i = 1;
        int resultado = 1;

        for (i = 1; i <= numero; ++i ){
            resultado = numero * i;
        }
        System.out.println(resultado);
    }
}
