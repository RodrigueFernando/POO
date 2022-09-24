public  class Bebida extends Produto{
    private int quantidadeEstoque;

    public Bebida(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public Bebida(String descricao, String preco, int quantidadeEstoque) {
        super(descricao, preco);
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }
    @Override
    public void mostraDados() {
        System.out.println("\nBebidas"+"\nquantidade de estouqe:"+this.quantidadeEstoque+
                "\ndiscricao:"+this.getDescricao()+
                "\npreco:" + this.getPreco());
    }

}
