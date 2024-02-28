public class Tutor extends Estudante{

    float bolsa;
    String disciplina;

    Tutor(String nome, int idade, String matricula, String cpf, float bolsa, String disciplina){
        super(nome, idade, matricula, cpf);
        this.bolsa=bolsa;
        this.disciplina=disciplina;
    }

    public float getBolsa() {
        return bolsa;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public void exibirEstudante(){
        super.exibirEstudante();
        System.out.println("Bolsa: "+bolsa);
        System.out.println("Disciplina: "+disciplina);
    }
}
