public class Main {
    public static void main(String[] args) {

        Animal bicho1 = new Cachorro("Bidu");
        Animal bicho2 = new Gato("Garfield");
        Animal bicho3 = new Galinha("Maji");

        System.out.println(bicho1.getNome());
        bicho1.falar();

        System.out.println(bicho2.getNome());
        bicho2.falar();

        System.out.println(bicho3.getNome());
        bicho3.falar();
    }
}