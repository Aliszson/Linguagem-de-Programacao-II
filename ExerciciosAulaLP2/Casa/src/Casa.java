public class Casa {
    private String  endereco;
    private int portas;
    private int janelas;

    Casa(String endereco){
        this.endereco=endereco;
    }

    Casa(String endereco, int portas, int janelas){
        this.endereco=endereco;
        this.portas=portas;
        this.janelas=janelas;
    }

    public String toString(){
        return "Endereco: "+endereco+"\n"+"Portas: "+portas+"\n"+"Janelas: : "+janelas+"\n";

    }
    // métodos modificadores
    public void setPortas(int portas){
        this.portas=portas;
    }
    public void setJanelas(int janelas){
        this.janelas=janelas;
    }

    public void setEndereco(String endereco){
        this.endereco=endereco;
    }

    // métodos acessadores

    public int getPortas(){
        return this.portas;
    }

    public int getJanelas(){
        return this.janelas;
    }

    public String getEndereco(){
        return this.endereco;
    }

}
