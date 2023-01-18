package dado;

import modelo.Partido;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PartidoSQLiteDAO implements PartidoDAO {
    @Override
    public void salvar(Partido p) {

        String sql = "INSERT INTO partido values(?,?,?)";
        try(PreparedStatement stmt = ConnectionFactory.criaStatement(sql)){
            stmt.setInt(1,p.getNumero());
            stmt.setString(2,p.getNome());
            stmt.setString(3, p.getSigla());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }

    @Override
    public void atualizar(Partido p) {
        String sql = "UPDATE curso SET numero =?,nome=?, silgas = ? WHERE numero=?";
        try(PreparedStatement stmt=ConnectionFactory.criaStatement(sql)){
             stmt.setInt(1,p.getNumero());
             stmt.setString(2,p.getNome());
             stmt.setString(3,p.getSigla());
             stmt.executeUpdate();


        }
        catch (SQLException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void excluir(Partido p) {
        String sql = "DELETE FROM partido WHERE numero=?";

        try(PreparedStatement stmt = ConnectionFactory.criaStatement(sql)){
            stmt.setInt(1,p.getNumero());
            stmt.executeUpdate();
        }catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Partido buscar(int numero) {
        String sql = "SELECT * FROM partido WHERE numero=?";
        Partido p=null;
        try(PreparedStatement stmt = ConnectionFactory.criaStatement(sql)){
           stmt.setInt(1,numero);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {

                 p = new Partido( rs.getInt("numero"),rs.getString("nome"),rs.getString("sigla"));

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return p;
    }

    @Override
    public List<Partido> BuscaTodos() {
        String sql = "SELECT * FROM partido";
        List<Partido> listaPartido =new ArrayList<>();
        try(PreparedStatement stmt = ConnectionFactory.criaStatement(sql)) {
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                   Partido p = new Partido  (rs.getInt("numero"),
                        rs.getString("nome"),
                        rs.getString("sigla"));
                listaPartido.add(p);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return listaPartido;
    }

}
