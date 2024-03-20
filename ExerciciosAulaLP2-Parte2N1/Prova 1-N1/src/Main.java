public class Main {
    public static void main(String[] args) {

        Revista r1 = new Revista("Olhe", "Eu mesmo", 2024,"BCC");
        r1.emprestar();
        r1.devolver();
        r1.itemDisponivel();
    }
}