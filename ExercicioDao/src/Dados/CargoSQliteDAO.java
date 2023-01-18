package Dados;


import modelo.Cargo;
import modelo.Partido;

import java.sql.*;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

public class CargoSQliteDAO  implements CargoDAO{
    @Override
    public void salvar(Cargo c) {
        String sql = "INSERT INTO cargo values(?,?)";
        try(PreparedStatement stmt = ConnectionFactory.criaStatement(sql)){
             stmt.setInt(1,c.getIdCargo());
             stmt.setString(2,c.getCargo());
             stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }



    @Override
    public void atualizar(Cargo c) {
        String sql = "UPDATE cargo set idCargo = ?, cargo =? where idCargo=?";
        try ( PreparedStatement stmt =ConnectionFactory.criaStatement(sql)){;
            stmt.setInt(1,c.getIdCargo());
            stmt.setString(2,c.getCargo());
            stmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void apagar(Cargo c) {
       String sql ="DELETE FROM cargo WHERE idCargo =?";
       try (PreparedStatement stmt = ConnectionFactory.criaStatement(sql)){
           stmt.setInt(1,c.getIdCargo());
           stmt.setString(2,c.getCargo());
           stmt.executeUpdate();

       } catch (SQLException e) {
           e.printStackTrace();
       }
    }

    @Override
    public Cargo buscar(int idCargo) {
       Cargo c= null;
       String sql = "SELECT * FROM cargo WHERE idCargo=?";
       try(PreparedStatement stmt = ConnectionFactory.criaStatement(sql)){
           stmt.setInt(1,idCargo);
           ResultSet rs = stmt.executeQuery();
           while (rs.next())
               c= new Cargo(rs.getInt("idCargo"),rs.getString("cargo"));
       } catch (SQLException e) {
           e.printStackTrace();
       }
       return c;
    }

    @Override
    public List<Cargo> buscaTodos() {
         String sql ="SELECT * FROM cargo";
         List<Cargo>listaCargo = new ArrayList<>();
         try(PreparedStatement stmt = ConnectionFactory.criaStatement(sql)){
             ResultSet rs = stmt.executeQuery();
             while (rs.next()){
                 Cargo c = new Cargo(rs.getInt("idCargo"),rs.getString("cargo"));
                 listaCargo.add(c);
             }


         } catch (SQLException e) {
             e.printStackTrace();
         }
        return  listaCargo;
    }
}
