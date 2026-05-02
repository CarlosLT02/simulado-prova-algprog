import java.util.Scanner;

public class Simulado {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        System.out.print("Digite o nome do cliente: ");
        String nome = sc.nextLine();

       
        System.out.print("Digite o valor da compra: ");
        double valorCompra = sc.nextDouble();

       
        System.out.print("Digite o valor pago: ");
        double valorPago = sc.nextDouble();

        
        if (valorPago < valorCompra) {
            System.out.println("Valor insuficiente para realizar suas compras!");
        } else {

            
            double troco = valorPago - valorCompra;

            
            int trocoInt = (int) troco;

            
            int n200 = trocoInt / 200;
            trocoInt %= 200;

            int n100 = trocoInt / 100;
            trocoInt %= 100;

            int n50 = trocoInt / 50;
            trocoInt %= 50;

            int n20 = trocoInt / 20;
            trocoInt %= 20;

            int n10 = trocoInt / 10;
            trocoInt %= 10;

            int n5 = trocoInt / 5;
            trocoInt %= 5;

            int n2 = trocoInt / 2;
            trocoInt %= 2;

            int n1 = trocoInt / 1;

          
            System.out.println("\nCliente: " + nome);
            System.out.println("Valor da compra: R$ " + valorCompra);
            System.out.println("Valor pago: R$ " + valorPago);

           
            System.out.println("Troco: R$ " + troco);
            System.out.println("Notas:");

            if (n200 > 0) System.out.println(n200 + "x R$200");
            if (n100 > 0) System.out.println(n100 + "x R$100");
            if (n50 > 0) System.out.println(n50 + "x R$50");
            if (n20 > 0) System.out.println(n20 + "x R$20");
            if (n10 > 0) System.out.println(n10 + "x R$10");
            if (n5 > 0) System.out.println(n5 + "x R$5");
            if (n2 > 0) System.out.println(n2 + "x R$2");
            if (n1 > 0) System.out.println(n1 + "x R$1");
        }

        sc.close();
    }
}