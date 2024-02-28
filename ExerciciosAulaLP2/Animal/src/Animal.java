public abstract class Animal {
    private String nome;

    Animal(String nome){
        this.nome=nome;
    }
    public abstract void exibirAnimal();

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome=nome;
    }

    public abstract void falar();

}
