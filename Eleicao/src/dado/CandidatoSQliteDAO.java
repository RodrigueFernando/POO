package dado;
import dado.PartidoSQLiteDAO;
import dado.CandidatoDAO;
import dado.CargoSQliteDAO;
import modelo.Partido;
import modelo.Candidato;
import modelo.Cargo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CandidatoSQliteDAO implements CandidatoDAO {
    @Override
    public void salvar(Candidato c) {
        String sql = "INSERT INTO Candidato values (?,?,?,?)";

        try(PreparedStatement stmt = ConnectionFactory.criaStatement(sql)){
            stmt.setInt(1,c.getNumero());
            stmt.setString(2,c.getNome());
            stmt.setInt(3,c.getCargo().getIdCargo());
            stmt.setInt(4,c.getPartido().getNumero());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
        @Override
    public void atualizar(Candidato c) {
            String sql = "UPDATE candidato set numero = ?, nome =? , cargo = ?, partido = ?where numero=?";
            try ( PreparedStatement stmt =ConnectionFactory.criaStatement(sql)){;
                stmt.setInt(1,c.getNumero());
                stmt.setString(2,c.getNome());
                stmt.setInt(4,c.getCargo().getIdCargo());
                stmt.setInt(3,c.getPartido().getNumero());
                stmt.executeUpdate();

            } catch (SQLException e) {
                e.printStackTrace();
            }

        }

    @Override
    public void apagar(Candidato c) {
        String sql = "DELETE FROM candidato WHERE numero=?";

        try(PreparedStatement stmt = ConnectionFactory.criaStatement(sql)){
            stmt.setInt(1,c.getNumero());
            stmt.executeUpdate();
        }catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Candidato busca(int numero) {
        String sql = "SELECT * FROM candidato WHERE numero=?";
        Candidato c = null;
        try(PreparedStatement stmt =ConnectionFactory.criaStatement(sql)) {
            stmt.setInt(1,numero);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()){
                Partido partido = new PartidoSQLiteDAO().buscar(rs.getInt("partido"));
                Cargo cargo     = new CargoSQliteDAO().buscar(rs.getInt("numero"));
                c = new Candidato(rs.getInt("numero"),
                        rs.getString("nome"),
                        cargo,partido);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return c;
    }

    @Override
    public List<Candidato> buscaTodos() {
        String sql = "SELECT * FROM candidato WHERE numero=?";
         List<Candidato>listaCandidatos = new ArrayList<>();
        try(PreparedStatement stmt =ConnectionFactory.criaStatement(sql)) {
            ResultSet rs = stmt.executeQuery();
            while (rs.next()){
                Partido partido = new PartidoSQLiteDAO().buscar(rs.getInt("partido"));
                Cargo cargo     = new CargoSQliteDAO().buscar(rs.getInt("numero"));
                Candidato  c = new Candidato(rs.getInt("numero"),
                        rs.getString("nome"),
                        cargo,partido);
                        listaCandidatos.add(c);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return listaCandidatos;

    }
}
