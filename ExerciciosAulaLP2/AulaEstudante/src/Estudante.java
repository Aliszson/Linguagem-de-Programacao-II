public class Estudante {

    String nome;
    int idade;
    String matricula;
    String cpf;
    Estudante(String nome, int idade, String matricula, String cpf){
        this.nome=nome;
        this.idade=idade;
        this.matricula=matricula;
        this.cpf=cpf;
    }

    public void setNome(String nome){
        this.nome=nome;
    }
    public void setIdade(int idade){
        this.idade=idade;
    }

    public void setMatricula(String matricula){
        this.matricula=matricula;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getIdade() {
        return idade;
    }

    public String getCpf() {
        return cpf;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public void exibirEstudante(){
        System.out.println("Nome: "+nome);
        System.out.println("Idade: "+idade);
        System.out.println("Matricula: "+matricula);
        System.out.println("CPF: "+cpf);
    }
}
