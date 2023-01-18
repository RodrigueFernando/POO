package dado;

import java.util.List;
import modelo.Cargo;
public interface CargoDAO {
    void salvar(Cargo c);
    void atualizar (Cargo c);
    void apagar(Cargo c);
    Cargo buscar (int idCargo);
    List< Cargo > buscaTodos();
}
