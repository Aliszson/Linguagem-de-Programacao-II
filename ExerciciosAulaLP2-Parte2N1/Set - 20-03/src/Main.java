import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<Integer> a = new LinkedHashSet<>();
        Set<Integer> b = new LinkedHashSet<>();
        Set<Integer> c = new LinkedHashSet<>();

        a.add(7842);
        b.add(8318);
        c.add(9393);

        a.add(2311);
        b.add(8318);
        c.add(2321);

        a.add(7842);
        b.add(6763);
        c.add(9393);

        a.add(7842);
        b.add(6763);
        c.add(3123);

        a.add(7842);
        b.add(2321);
        c.add(9393);

        Set<Integer> Alex = new LinkedHashSet<>();
        Alex.addAll(a);
        Alex.addAll(b);
        Alex.addAll(c);

        for (Integer i: Alex){
            System.out.println(i);
        }

        System.out.println(Alex.size());

    }
}



//Scanner sc = new Scanner(System.in);
//
//Set<String> cores = new LinkedHashSet<>();
//        cores.add("Laranja");
//        cores.add("Preto");
//        cores.add("Amarelo");
//        cores.add("Preto");
//        cores.add("Azul");
//
//Set<String> coresPrimarias = new LinkedHashSet<>();
//        coresPrimarias.add("Vermelho");
//        coresPrimarias.add("Verde");
//        coresPrimarias.add("Azul");
//
//        cores.retainAll(coresPrimarias);
////cores.removeIf(x->x.startsWith("A"));
//
//        System.out.println(cores.contains("Vermelho"));
//        for (String c:cores){
//        System.out.println(c);
//        }