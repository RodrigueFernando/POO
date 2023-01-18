import modelo.Candidato;
import  modelo.Partido;
import dado.PartidoSQLiteDAO;
import modelo.Cargo;
import dado.CargoSQliteDAO;
import dado.CandidatoSQliteDAO;


import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {

        Cargo cargo = new Cargo(13,"ads");
        Cargo cargo1 = new Cargo(14,"Analista");


        CargoSQliteDAO cargoDAO = new CargoSQliteDAO();
        cargoDAO.salvar(cargo);
        cargoDAO.salvar(cargo1);




        Partido partido = new Partido(1,"fernando","fer");
        Partido partido1 = new Partido(2,"Marcelo","mar");

        PartidoSQLiteDAO partidoSQLiteDAO = new PartidoSQLiteDAO();
        partidoSQLiteDAO.salvar(partido1);

        Candidato candidato = new Candidato(1,"angelica",cargo,partido);
        Candidato candidato1 = new Candidato(2,"mateus",cargo1,partido1);

          CandidatoSQliteDAO candidatoSQliteDAO =new CandidatoSQliteDAO();
          candidatoSQliteDAO.salvar(candidato);
          candidatoSQliteDAO.salvar(candidato1);


        List<Cargo>listaCArgo = cargoDAO.buscaTodos();
        for(Cargo c: listaCArgo){
            c.mostrarDadoCArgo();
        }

        List<Partido>ListaPartido =partidoSQLiteDAO.BuscaTodos();
        for(Partido p :ListaPartido){
            p.mostraDadosPartido();
        }


        List<Candidato>listaCandidato = candidatoSQliteDAO.buscaTodos();
        for( Candidato c: listaCandidato){
            c.mostraDadoCandidato();
        }

    }
}
