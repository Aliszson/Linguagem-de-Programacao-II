public class Jogo {
    private String titulo;
    private double preco;

    Jogo(String titulo, double preco){
        this.titulo=titulo;
        this.preco=preco;
    }

    // gets
    public String getTitulo() {
        return titulo;
    }

    public double getPreco() {
        return preco;
    }

    // sets


    public void setTitulo(String titulo){
        this.titulo=titulo;
    }

    public void setPreco(double preco){
        this.preco=preco;
    }

    // gets
    public void exibirJogo(){
        System.out.println("Título: "+titulo);
        System.out.println("Preço: "+preco);
    }
}
