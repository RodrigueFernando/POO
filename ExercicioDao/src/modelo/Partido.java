package modelo;

public class Partido {
    private  int numero;
    private String nome;
    private String siglas;

    public Partido(int numero, String nome, String siglas) {
        this.numero = numero;
        this.nome = nome;
        this.siglas = siglas;
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

    public String getSiglas() {
        return siglas;
    }

    public void setSiglas(String siglas) {

        this.siglas = siglas;
    }

    public void mostrarDados(){
        System.out.println("\n Numero: " + getNumero() +
                "\n Nome: " + getNome()+
                "\n Siglas:" + getSiglas());

    }
}
