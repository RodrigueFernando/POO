package Dados;

import modelo.Partido;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class PartidoSQliteDAO implements PartidoDAO {

    @Override
    public void salvar(Partido p)  {
        String sql = "insert into partido values (?,?,?)";
        try(PreparedStatement stmt = ConnectionFactory.criaStatement(sql)){
            stmt.setInt(1,p.getNumero());
            stmt.setString(2,p.getNome());
            stmt.setString(3,p.getSiglas());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void atualizar(Partido p) {
        String sql ="update partido set nome =?, siglas where numero =?";
        try(PreparedStatement stmt = ConnectionFactory.criaStatement(sql)) {

            stmt.setInt(1,p.getNumero());
            stmt.setString(2,p.getNome());
            stmt.setString(3,p.getSiglas());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void apagar(Partido p) {
        String sql = "delete from partido where numero = ?";
        try(PreparedStatement stmt = ConnectionFactory.criaStatement(sql)) {
            stmt.setInt(1,p.getNumero());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    @Override
    public Partido buscar(int numero) {
        Partido p = null;
        String sql =" select * from partido where numero =?";
        try(PreparedStatement stmt = ConnectionFactory.criaStatement(sql)) {
            stmt.setInt(1,numero);
            ResultSet rs = stmt.executeQuery();

            while(rs.next()){
                p = new Partido(rs.getInt("numero"), rs.getString("nome"),rs.getString("sigla") );

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return p;
    }

    @Override
    public List<Partido> buscaTodos() {
        String sql = "select * from partido";
        List<Partido> listaPartido = new ArrayList<>();
        try(PreparedStatement stmt = ConnectionFactory.criaStatement(sql)) {
            ResultSet rs = stmt.executeQuery();
            Partido p = new Partido(rs.getInt("numero"), rs.getString("nome"), rs.getString("sigla") );
            listaPartido.add(p);
        } catch (SQLException e) {
            e.printStackTrace();
        }


        return listaPartido;
    }
}