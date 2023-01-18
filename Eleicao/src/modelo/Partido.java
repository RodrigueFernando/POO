package modelo;

public class Partido {
    private int numero;
    private String nome;
    private  String sigla;


    public void mostraDadosPartido(){
        System.out.println("\n\nPartido \n Id:" + this.getNumero() +
                "\n Nome:" + this.getNome() +
                "\n Sigla:" + this.getSigla());
    }

    public Partido(int numero, String nome, String sigla) {
        this.numero = numero;
        this.nome = nome;
        this.sigla = sigla;
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

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }
}