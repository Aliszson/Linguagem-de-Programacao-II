import java.util.ArrayList;
import java.util.Scanner;
public class Main {
        static Scanner lerNum = new Scanner(System.in);
        static Scanner lerLetra = new Scanner(System.in);

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        ArrayList<Funcionario> funcionarios = new ArrayList<>();

        System.out.print("Quantidade de funcionários: ");
        int qtd = leitor.nextInt();

        for (int i = 0; i<qtd;i++){
            System.out.print("Id: ");
            int id = leitor.nextInt();
            System.out.print("Nome: ");
            leitor.nextLine();
            String nome = leitor.nextLine();
            System.out.print("Salario: ");
            float salario = leitor.nextFloat();
            funcionarios.add(new Funcionario(id, nome, salario));
        }


        System.out.print("Digite um Id: ");
        int id = leitor.nextInt();
        boolean encontrado=false;
        //aumento
        for (Funcionario f: funcionarios){
            if (id==f.getId()){
                encontrado=true;
                System.out.print("Digte a porcentagem: ");
                float porcentagem = leitor.nextFloat();
                f.efetuarAumento(porcentagem);
                break;
            }
        }

        if (encontrado=false){
            System.out.println("Não encontrado.");
        }

        for (Funcionario f: funcionarios){
            System.out.println(f.toString());
        }
    }
}