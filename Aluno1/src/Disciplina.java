public class Disciplina {
    private String sigla;
    private String nomeDisciplina;
    private int cargaHorari;
    private Matricula[] matricula;

    public Disciplina() {
    }

    public Disciplina(String sigla, String nomeDisciplina, int cargaHorari) {
        this.sigla = sigla;
        this.nomeDisciplina = nomeDisciplina;
        this.cargaHorari = cargaHorari;
        this.matricula = matricula;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getNomeDisciplina() {
        return nomeDisciplina;
    }

    public void setNomeDisciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
    }

    public int getCargaHorari() {
        return cargaHorari;
    }

    public void setCargaHorari(int cargaHorari) {
        this.cargaHorari = cargaHorari;
    }

    public Matricula[] getMatricula() {
        return matricula;
    }

    public void setMatricula(Matricula[] matricula) {
        this.matricula = matricula;
    }
}
