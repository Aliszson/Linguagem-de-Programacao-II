import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ImprimeColecao colecao = new ImprimeColecao();
        Scanner leitor = new Scanner(System.in);

        System.out.print("Valores a serem adicionados: ");
        int itens = leitor.nextInt();
        for (int i=0; i<= itens;i++){
            colecao.addValor(leitor.nextInt());
        }

        System.out.println("Primeiro: "+colecao.primeiro());
        colecao.imprimir();
    }
}