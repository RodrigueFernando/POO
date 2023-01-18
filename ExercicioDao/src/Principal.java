import Dados.*;
import Dados.CandidatoSQliteDAO;
import Dados.CargoSQliteDAO;
import Dados.PartidoSQliteDAO;
import modelo.Candiddato;
import modelo.Cargo;
import modelo.Partido;

import java.util.List;

class Principal {
    public static void main(String[] args) {


        Cargo cargo = new Cargo(11355,"ads");
        Cargo cargo1 = new Cargo(11455,"Analista");


        CargoSQliteDAO cargoDAO = new CargoSQliteDAO();
        cargoDAO.salvar(cargo);
        cargoDAO.salvar(cargo1);





        Partido partido = new Partido(10555,"fernando","fer");
        Partido partido1 = new Partido(15555,"São carlos","sc");

        PartidoSQliteDAO partidoDAO = new PartidoSQliteDAO();
        partidoDAO.salvar(partido);
        partidoDAO.salvar(partido1);


        Candiddato candiddato = new Candiddato(15050,"fernando",partido,cargo);
        Candiddato candiddato1 = new Candiddato(15650,"marcelo",partido1,cargo1);

        CandidatoSQliteDAO candidatoSQliteDAO = new CandidatoSQliteDAO();
        candidatoSQliteDAO.salvar(candiddato);
        candidatoSQliteDAO.salvar(candiddato1);




        List<Cargo>listaCargo = cargoDAO.buscaTodos();
        for(Cargo c : listaCargo){
            c.mostrarDados();
        }



        List<Partido>listaPartido = partidoDAO.buscaTodos();
        for(Partido p : listaPartido){
            p.mostrarDados();
        }


        List < Candiddato > listaCandidato = candidatoSQliteDAO.buscaTodos();
        for(Candiddato cp: listaCandidato){
            cp.mostraDados();
        }


    }
}










