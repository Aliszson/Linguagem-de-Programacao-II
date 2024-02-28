public class Galinha extends Animal{

    Galinha(String nome){
        super(nome);
    }

    public void exibirAnimal() {
        System.out.println(getNome());
    }


    public void falar() {
        System.out.println("Cocó");
    }
}
