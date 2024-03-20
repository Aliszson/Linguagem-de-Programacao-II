public abstract class Item implements ItemDeBiblioteca{
    private String titulo;
    private String autor;
    private int anoDePublicacao;

    private boolean disponivel=true;

    Item(String titulo, String autor, int anoDePublicacao){
        this.titulo=titulo;
        this.autor=autor;
        this.anoDePublicacao=anoDePublicacao;
    }

    public void setTitulo(String titulo){
        this.titulo=titulo;
    }

    public String getTitulo(){
        return titulo;
    }

    public boolean getDisponivel(){
        return disponivel;
    }

    @Override
    public void emprestar() {
        disponivel=false;
    }


    public void devolver() {
        disponivel=true;
    }

    public abstract boolean itemDisponivel();
}
