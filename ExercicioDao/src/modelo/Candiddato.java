package modelo;
import modelo.Partido;

public class Candiddato {
    private int numero;
    private  String nome;
    private Partido partido;
    private Cargo cargo;

    public Candiddato(int numero, String nome, Partido partido, Cargo cargo) {
        this.numero = numero;
        this.nome = nome;
        this.partido = partido;
        this.cargo = cargo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Partido getPartido() {
        return partido;
    }

    public void setPartido(Partido partido) {
        this.partido = partido;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {

        this.cargo = cargo;
    }
   public  void mostraDados(){
        System.out.println("\n numero:" + this.getNumero() +
                 "\n Nome:" + getNome()+
                 "\n Partido: " +this.getPartido().getNome()+
                 "\n Cargo:" + this.getCargo().getIdCargo());
    }
}
