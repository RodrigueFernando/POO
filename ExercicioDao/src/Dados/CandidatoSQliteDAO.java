package Dados;
import modelo.Cargo;
import modelo.Partido;
import modelo.Candiddato;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CandidatoSQliteDAO implements CandidatoDAO{
    @Override
    public void salvar(Candiddato c) {
        String sql = "INSERT INTO candidato values(?,?,?,?)";
        try(PreparedStatement stmt = ConnectionFactory.criaStatement(sql)){
            stmt.setInt(1,c.getNumero());
            stmt.setString(2,c.getNome());
            stmt.setInt(3,c.getPartido().getNumero());
            stmt.setInt(4,c.getCargo().getIdCargo());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void atualizar(Candiddato c) {
        String sql = "UPDATE candidato set numero = ?, nome =? , partido = ?, cargo = ?where numero=?";
        try ( PreparedStatement stmt =ConnectionFactory.criaStatement(sql)){
            stmt.setInt(1,c.getNumero());
            stmt.setString(2,c.getNome());
            stmt.setInt(3,c.getPartido().getNumero());
            stmt.setInt(4,c.getCargo().getIdCargo());
            stmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void apagar(Candiddato c) {
        String sql = "DELETE FROM candidato WHERE numero=?";

        try(PreparedStatement stmt = ConnectionFactory.criaStatement(sql)){
            stmt.setInt(1,c.getNumero());
            stmt.executeUpdate();
        }catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Candiddato busca(int numero) {
        String sql = "SELECT * FROM candidato where numero = ?";
        Candiddato  c = null;
        try(PreparedStatement  stmt =ConnectionFactory.criaStatement(sql)) {
            stmt.setInt(1,numero);
            ResultSet rs = stmt.executeQuery();
            while(rs.next()){
                Partido partido = new PartidoSQliteDAO().buscar(rs.getInt("partido"));
                Cargo cargo =new CargoSQliteDAO().buscar(rs.getInt("cargo"));
                c = new Candiddato(rs.getInt("numero"),
                        rs.getString("nome"),
                        partido,cargo);

            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return c;
    }



    @Override
    public List<Candiddato> buscaTodos() {
        String sql = "SELECT * FROM candidato";
        List<Candiddato> listaCandidato = new ArrayList<>();
        try(PreparedStatement stmt = ConnectionFactory.criaStatement(sql)){
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                  Partido partido = new PartidoSQliteDAO().buscar(rs.getInt("partido"));
                  Cargo cargo = new CargoSQliteDAO().buscar(rs.getInt("cargo"));
                  Candiddato c = new Candiddato ( rs.getInt("numero"),
                        rs.getString("nome"),
                        partido,cargo);
                  listaCandidato.add(c);
            }
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
        return listaCandidato;
    }

}
