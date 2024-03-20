import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Alunos> lista = new ArrayList<>();

        //Alunos a1 = new Alunos("Mário",123123123);
        //Alunos a2 = new Alunos("Carlos",123127831);
        Alunos a3 = new Alunos("João",323237812);
        Alunos a4 = new Alunos("Alfredo",0323732);
        Alunos a5 = new Alunos("Douglas",78218381);
        //System.out.println(a1.compareTo(a3));

        String a1 = new String("A35c%guaA)");
        String a2 = new String("Maria");

        System.out.println(a1==a2);
        System.out.println(a1.equals(a2));
        System.out.println(a1.hashCode());
        System.out.println(a2.hashCode());
    }
}
