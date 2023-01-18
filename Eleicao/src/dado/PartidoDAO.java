package dado;
import modelo.Partido;

import java.util.List;

public interface PartidoDAO {
    void salvar(Partido p);
    void  atualizar(Partido p);
    void excluir(Partido p);
    Partido buscar(int numero);
    List<Partido>BuscaTodos();
}
