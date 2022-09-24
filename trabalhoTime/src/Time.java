import java.util.ArrayList;
import java.util.List;

public class Time {
    private String pais;
    private int quantidade;
    private List<Jogador> jogador = new ArrayList<>();



    public Time(String pais, int quantidade) {
        this.pais = pais;
        this.quantidade = quantidade;
        // this.jogador = jogador;
    }
    public void adicionaJogador(Jogador jogador){
        this.jogador.add(jogador);
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantididade(int quantidade) {
        this.quantidade = quantidade;
    }

    public List<Jogador> getJogador() {
        return jogador;
    }

    public void setJogador(List<Jogador> jogador) {
        this.jogador = jogador;
    }
    public Time(String pais, int quantidade, List<Jogador> jogador) {
        this.pais = pais;
        this.quantidade = quantidade;
        this.jogador = jogador;
    }

}
