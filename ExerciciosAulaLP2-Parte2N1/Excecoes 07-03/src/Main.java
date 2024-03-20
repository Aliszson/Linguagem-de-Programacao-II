import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {



        metodo1();
        System.out.println("Programa encerrado!");
    }

    public static void metodo1(){
        System.out.println("*Método 1*");
        Scanner leitor = new Scanner(System.in);
        try {
            System.out.println("Digite nomes: ");
            String[] nomes = leitor.nextLine().split(" ");

            System.out.println("Ímdice: ");
            int i = leitor.nextInt();
            System.out.println(nomes[i]);

        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Você é burro! Índice inválido!");
            e.printStackTrace();
        }catch (InputMismatchException e){
            System.out.println("Eu pedi um número, não letra...");
            e.printStackTrace();
        }
        leitor.close();
    }
}