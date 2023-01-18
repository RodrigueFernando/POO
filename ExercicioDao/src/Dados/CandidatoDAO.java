package Dados;
import modelo.Candiddato;

import java.util.List;

public interface CandidatoDAO {
    void salvar(Candiddato c);
    void atualizar(Candiddato c);
    void apagar(Candiddato c);
     Candiddato busca (int numero);
    List<Candiddato>buscaTodos();
}
