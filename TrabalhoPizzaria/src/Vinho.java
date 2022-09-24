public class Vinho extends Bebida{
    private String uva;
    private String paisOrigem;

    public Vinho(int quantidadeEstoque, String uva, String paisOrigem) {
        super(quantidadeEstoque);
        this.uva = uva;
        this.paisOrigem = paisOrigem;
    }

    public Vinho(String descricao, String preco, int quantidadeEstoque, String uva, String paisOrigem) {
        super(descricao, preco, quantidadeEstoque);
        this.uva = uva;
        this.paisOrigem = paisOrigem;
    }

    public String getUva() {
        return uva;
    }

    public void setUva(String uva) {
        this.uva = uva;
    }

    public String getPaisOrigem() {
        return paisOrigem;
    }

    public void setPaisOrigem(String paisOrigem) {
        this.paisOrigem = paisOrigem;
    }

    @Override
    public void mostraDados() {
        System.out.println("\n"+"Vinho"+ "\n"+"uva: " + this.getUva()
                +"\n"+
                "Pais de origem: "+ getPaisOrigem() +"\n"+
                "quantidade de estoque: " + getQuantidadeEstoque() +"\n"+
                "descricao: " + getDescricao() +"\n"+
                "preco: " + getPreco()


        );

    }


}
