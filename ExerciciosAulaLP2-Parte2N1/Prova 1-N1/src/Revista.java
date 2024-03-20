public class Revista extends Item{
    private String editora;

    Revista(String titulo, String autor, int anoDePublicacao, String editora){
        super(titulo, autor, anoDePublicacao);
        this.editora=editora;
    }

    public void emprestar() {
        super.emprestar();
    }

    public void devolver() {
        super.devolver();
    }

    public boolean itemDisponivel(){
        if (getDisponivel()){
            System.out.println("Sim");
            return true;
        }else {
            System.out.println("Não");
            return false;
        }
    }

}
