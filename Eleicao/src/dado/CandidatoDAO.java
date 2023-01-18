package dado;
import  modelo.Candidato;

import java.util.List;

public interface CandidatoDAO {
    void salvar(Candidato c);
    void atualizar(Candidato c);
    void apagar(Candidato c);
    Candidato busca (int numero);
    List<Candidato> buscaTodos();
}
