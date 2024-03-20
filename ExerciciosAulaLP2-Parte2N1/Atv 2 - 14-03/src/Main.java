public class Main {
    public static void main(String[] args) {
        Conta conta1 = new Conta(81,"Didi",10000,1000);

        try{
            conta1.sacar(50);
        }catch (DataException e){
            System.out.println(e.getMessage());
        }catch (ValueException e){
            System.out.println(e.getMessage());
        }

    }
}