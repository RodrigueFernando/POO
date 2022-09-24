public class AlunoGraduacao extends Aluno {
      private double horaAtividadeCompleta;



    public AlunoGraduacao(String cpf, String nome, String prontuario, double ira, Curso curso, double horaAtividadeCompleta) {
        super(cpf, nome, prontuario, ira, curso);
        this.horaAtividadeCompleta = horaAtividadeCompleta;
    }

    public double getHoraAtividadeCompleta() {
        return horaAtividadeCompleta;
    }

    public void setHoraAtividadeCompleta(double horaAtividadeCompleta) {
        this.horaAtividadeCompleta = horaAtividadeCompleta;
    }
    @Override
    public void mostraDados() {
        System.out.println("cpf"+ getCpf() + "Horas atividades " + getHoraAtividadeCompleta());
    }
}
