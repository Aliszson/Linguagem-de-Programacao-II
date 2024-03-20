import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Conta {
    int numero;
    String titular;
    double saldo;
    double limiteSaque;

    public Conta(int numero, String titular, double saldo, double limiteSaque) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
        this.limiteSaque = limiteSaque;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setLimiteSaque(double limiteSaque) {
        this.limiteSaque = limiteSaque;
    }

    public int getNumero() {
        return numero;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getLimiteSaque() {
        return limiteSaque;
    }
     public void depositar(double valor) throws DataException{
         Date data = new Date();
         if (data.getHours()>22){
             throw new DataException ("Já são mais de 22h. Não é possível sacar.");
         }
         this.saldo = valor;
     }

     public void sacar(double valor) throws ValueException,DataException {
        Date data = new Date();

        if (data.getHours()>22){
            throw new DataException ("Já são mais de 22h. Não é possível sacar.");
        }
        if (valor>saldo){
            throw new ValueException("Você não possui saldo suficiente.");
        }
        if (valor>getLimiteSaque()){
            throw new ValueException("Você não possui limite suficiente");
        }
        if (getSaldo()<valor && getLimiteSaque()>=valor){
            limiteSaque-=valor;
        }
        this.saldo-=valor;

     }

    @Override
    public String toString() {
        return "Conta{" +
                "numero=" + numero +
                ", titular='" + titular + '\'' +
                ", saldo=" + saldo +
                ", limiteSaque=" + limiteSaque +
                '}';
    }
}
