public class Main {
    public static void main(String[] args) {
        try{
            dividir(8,0);
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

    }
    public static float dividir(float a, float b){
        if (b==0){
            throw new IllegalArgumentException("Divisão por zero inválida.");
        }
        return a/b;
    }
}