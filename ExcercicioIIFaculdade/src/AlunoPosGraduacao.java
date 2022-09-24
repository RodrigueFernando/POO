public class AlunoPosGraduacao extends Aluno {
    private String tituloMonografia;
    private Professor professor;

    public AlunoPosGraduacao(String cpf, String nome, String prontuario, double ira, Curso curso, Professor professor) {
        super(cpf, nome, prontuario, ira, curso);
        this.professor = professor;
    }


    public String getTituloMonografia() {
        return tituloMonografia;
    }

    public void setTituloMonografia(String tituloMonografia) {
        this.tituloMonografia = tituloMonografia;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    @Override
    public void mostraDados() {
        System.out.println("cpf: " + getCpf() + "\n" +"Titulo monigrafia "  + getProfessor().getTitulacao() + "\n" +
                           "Professor " + getProfessor().getNome()
        );
    }
}

