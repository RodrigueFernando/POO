package Dados;
import modelo.Partido;

import java.sql.SQLException;
import java.util.List;

public interface PartidoDAO {
    void salvar(Partido p) throws SQLException;
    void atualizar(Partido p);
    void apagar(Partido p);
    Partido buscar(int numero);
   List<Partido>buscaTodos();
}
