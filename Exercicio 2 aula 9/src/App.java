import java.util.Scanner;

public class App {

    public static int somarArray(int[] numeros) {


        int soma = 0;

        for (int i = 0; i < numeros.length; i++) {
            soma = soma + numeros[i];
        }
            return soma;
        }
        public static void main(String[] args) {

            Scanner entrada = new Scanner(System.in);

            int[] valores = new int[5];

            for (int i = 0; i < valores.length; i++) {

            System.out.print("Digite os valores para o array: ");
            valores[i] = entrada.nextInt();

            }
{}
            int resultado = somarArray(valores);

            System.out.println("A soma dos numeros é: " + resultado);

            entrada.close();
        }
        
    }

    

