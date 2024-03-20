import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        try {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            System.out.println("Check-in: ");
            Date checkin = sdf.parse(sc.nextLine());
            System.out.println("Check-out: ");
            Date checkout = sdf.parse(sc.nextLine());
            System.out.println("Atualizar Datas!");
            Reserva r1 = new Reserva(1, checkin, checkout);
            System.out.println("Check-in: ");
            checkin = sdf.parse(sc.nextLine());
            System.out.println("Check-out: ");
            checkout = sdf.parse(sc.nextLine());
            r1.atualizarDatas(checkin,checkout);
        }catch (ParseException e){
            System.out.println("Formato de data inválido!");

        }catch (DataException e){
            System.out.println(e.getMessage());
        }


    }
}