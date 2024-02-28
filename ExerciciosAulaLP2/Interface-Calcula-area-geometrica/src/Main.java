public class Main {
    public static void main(String[] args) {

        FormaGeometrica forma1 = new Quadrado(3);
        System.out.println(forma1.area());

        FormaGeometrica forma2 = new Retangulo(67, 70);
        System.out.println(forma2.area());
    }
}