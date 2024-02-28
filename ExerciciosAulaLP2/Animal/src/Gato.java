public class Gato extends Animal{

    Gato(String nome){
        super(nome);
    }

    public void exibirAnimal() {
        System.out.println(getNome());
    }

    public void falar(){
        System.out.println("Miau");
    }
}
