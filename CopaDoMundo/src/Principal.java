import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        Jogador jogador = new Jogador("fernando","esquerda",10);
        Jogador jogador2 = new Jogador("marcelo","direita",12);
        Jogador jogador3 = new Jogador("Paulo","atacante",10);
        Jogador jogador4 = new Jogador("mateus","meioCampo",12);

        List<Jogador> listaJogadores = new ArrayList<>();
        listaJogadores.add(jogador);
        listaJogadores.add(jogador2);
        Time time = new Time("brasil",3,listaJogadores);


        List<Jogador> listaJogador = new ArrayList<>();
        listaJogador.add(jogador3);
        listaJogador.add(jogador4);

        Time time1 = new Time("Argentina",1,listaJogador);
         Estadio estadio = new Estadio("luizao","sao carlos");
        Partida partida = new Partida("12-12-2020","16;30",0,0,time1,time,estadio);
        time.adicionaJogador(jogador4) ;



        //System.out.println(partida.getTime2().getPais());
        //System.out.println(partida.getTime1().getPais());
        System.out.println( partida.getData());
        partida.atualizarResuldado(1,2);

        //System.out.println(partida.getPlacarTime2());
        System.out.println(estadio.getCidade());
        System.out.println(estadio.getNome());

        for (Jogador j: time1.getJogadores()){
            System.out.println("\n"+"nome: " + j.getNome() +"\n"+"Numero da camisa: "  + j.getNumeroCamisa());
        }



    }
}
