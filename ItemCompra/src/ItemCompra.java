public class ItemCompra {
    private int quantidade;
    private double valorParcial;
    private Compra compra;
    Produto produto;


    public ItemCompra() {
    }

    public ItemCompra(int quantidade, Compra compra, Produto produto) {
        this.quantidade = quantidade;
        this.compra = compra;
        this.produto = produto;
    }

    public double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getValorParcial() {
        return valorParcial;
    }

    public void setValorParcial(int valorParcial) {
        this.valorParcial = valorParcial;
    }

    public Compra getCompra() {
        return compra;
    }

    public void setCompra(Compra compra) {
        this.compra = compra;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public void calculaValorParcial(){
      double soma =0;
      soma = soma +( this.quantidade * this.getValorParcial());

      this.setValorParcial((int) soma);

    }

    public void mostraItem(){
        System.out.println("quantidade:" + this.getQuantidade() +"\n"
                           +"valor parcoal:"+this.getValorParcial());
    }
}
