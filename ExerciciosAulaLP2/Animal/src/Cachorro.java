public class Cachorro extends Animal{


    Cachorro(String nome){
        super(nome);
    }
    public void exibirAnimal() {
        System.out.println(getNome());
    }

    public void falar() {
        System.out.println("Au-Au");
    }
}
