public class Estagiario extends Estudante{

    float salario;
    String empresa;

    Estagiario(String nome, int idade, String matricula, String cpf, float salario, String empresa){
        super(nome, idade, matricula, cpf);
        this.salario=salario;
        this.empresa=empresa;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public float getSalario() {
        return salario;
    }

    public String getEmpresa() {
        return empresa;
    }

    @Override
    public void exibirEstudante() {
        super.exibirEstudante();
        System.out.println("Salário: "+salario);
        System.out.println("Empresa: "+empresa);
    }
}
