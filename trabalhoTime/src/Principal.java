public class Principal {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Fernando", "atacante", 10);
        Jogador jogador2 = new Jogador("Marcelo", "lateral", 7);
        Jogador jogador3 = new Jogador("Mateus", "meio campo", 7);
        Jogador jogador4 = new Jogador("Paulo", "goleiro", 15);

        Estadio estadio1 = new Estadio("Luizão", "São carlos");
        Estadio estadio2 = new Estadio("Maracana", "são carlos");

        Time brasil = new Time("brasil", 2);
        Time inglaterra = new Time("inglaterra", 5);
        Time argentina = new Time("argentina", 2);
        Time franca = new Time("franca", 2);

        brasil.adicionaJogador(jogador1);
        inglaterra.adicionaJogador(jogador2);
        argentina.adicionaJogador(jogador3);

        Partido partido = new Partido("10/08/2022", "22h00", brasil, inglaterra, estadio1);
        Partido partido1 = new Partido("01/07/2022", "20:00", argentina, franca, estadio2);

        partido1.atualizaResultado(2, 2);
        partido1.Placar();

        partido.atualizaResultado(3, 0);
        partido.Placar();

        for (Jogador j : inglaterra.getJogador()){
            System.out.println("\ninglaterra"+"\nnome do jogador: " + j.getNome() + " " + "\nposicao: " + j.getPosicao()
                    + "\nnumero camisa: " + j.getNumeroCamisa());
        }
        for (Jogador j : brasil.getJogador()){
            System.out.println("\nbrasil"+"\nnome do jogador: " + j.getNome() + " " + "\nposicao: " + j.getPosicao()
                    + "\nnumero camisa: " + j.getNumeroCamisa());
        }


    }

}
