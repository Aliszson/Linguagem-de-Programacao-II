import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reserva {
    private int numeroQuarto;
    private Date checkin;
    private Date checkout;
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    public Reserva(int numeroQuarto, Date checkIn, Date checkOut) throws DataException{
        Date hoje = new Date();
        if (checkin.before(hoje) || checkout.after(hoje)){
            throw new DataException ("Erro! Datas passadas.");
        }
        this.numeroQuarto = numeroQuarto;
        this.checkin = checkIn;
        this.checkout = checkOut;
    }

    // Gets
    public int getNumeroQuarto() {
        return numeroQuarto;
    }

    public Date getCheckIn() {
        return checkin;
    }

    public Date getCheckOut() {
        return checkout;
    }

    // Sets
    public void setNumeroQuarto(int numeroQuarto) {
        this.numeroQuarto = numeroQuarto;
    }

    public void atualizarDatas(Date checkin, Date checkout) throws DataException{
        Date hoje = new Date();

        if (checkin.after(checkout)){
            throw new DataException ("Erro! Datas inválidas. Check-in maior que Check-out!!");
        }
        if (checkin.before(hoje) || checkout.after(hoje)){
            throw new DataException ("Erro! Datas passadas.");
        }
        this.checkin=checkin;
        this.checkout=checkout;

    }
    public long duracao(){
        long dif = checkout.getTime()-checkin.getTime();
        return TimeUnit.DAYS.convert(dif, TimeUnit.MILLISECONDS);

    }

    @Override
    public String toString() {
        return "Reserva{" +
                "numeroQuarto=" + numeroQuarto +
                ", checkIn=" + sdf.format(checkin) +
                ", checkOut=" + sdf.format(checkout) +
                ", duração=" + duracao() +
                '}';
    }
}
