import java.util.HashMap;
import java.util.Map;

public class Estoque {
    Map<String, Produto> estoque = new HashMap<>();

    public void addProduto(Produto p){
        if (estoque.containsKey(p.getName())){
            p.setQtd(p.getQtd() +10);
        }
        estoque.put(p.getName(),p);
    }
    public static void removerProduto(Map<String,Integer> estoque, String produto, int qtd){
        if (estoque.containsKey(produto)){
            if (estoque.get(produto) >= qtd){
                estoque.put(produto, estoque.get(produto)-qtd);
            }else{
                System.out.println("Voce possui itens insuficientes.");
                System.out.println(estoque.values());
            }
        }else{
            System.out.println("Produto não existe no estoque.");
        }
    }

    public static void verificarEstoque(Map<String,Integer> estoque, String produto){
        if (estoque.containsKey(produto)){
            System.out.println("Quantidade "+estoque.get(produto));
        }else {
            System.out.println("Você não possui esse item em estoque");
        }
    }

    public static void listarTodos(Map<String, Integer> estoque){
        for (String i: estoque.keySet()){
            System.out.print(i+": ");
            System.out.println(estoque.get(i));
        }

    }
}
