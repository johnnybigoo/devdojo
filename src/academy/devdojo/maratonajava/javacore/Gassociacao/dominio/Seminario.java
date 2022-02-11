package academy.devdojo.maratonajava.javacore.Gassociacao.dominio;

public class Seminario {
    private String titutlo;
    private Aluno[] alunos;
    private Local local;

    public Seminario(String titutlo) {
        this.titutlo = titutlo;
    }

    public Seminario(String titutlo, Aluno[] alunos) {
        this.titutlo = titutlo;
        this.alunos = alunos;
    }

    public Seminario(String titutlo, Aluno[] alunos, Local local) {
        this.titutlo = titutlo;
        this.alunos = alunos;
        this.local = local;
    }

    public String getTitutlo() {
        return titutlo;
    }

    public void setTitutlo(String titutlo) {
        this.titutlo = titutlo;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }
}
