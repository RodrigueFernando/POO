import java.util.List;

public class Time {
    private String pais;
    private  int quantidadeTitulos;
    private List<Jogador> jogadores;

    public Time() {
    }

    public Time(String pais, int quantidadeTitulos, List<Jogador> jogadores) {
        this.pais = pais;
        this.quantidadeTitulos = quantidadeTitulos;
        this.jogadores = jogadores;
    }



    public void adicionaJogador(Jogador jogador){
         this.jogadores.add(jogador);
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getQuantidadeTitulos() {
        return quantidadeTitulos;
    }

    public void setQuantidadeTitulos(int quantidadeTitulos) {
        this.quantidadeTitulos = quantidadeTitulos;
    }

    public List<Jogador> getJogadores() {
        return jogadores;
    }

    public void setJogadores(List<Jogador> jogadores) {
        this.jogadores = jogadores;
    }
}
