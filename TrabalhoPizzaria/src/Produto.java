public abstract class Produto {
    private String descricao;
    private String preco;

    public Produto() {
    }

    public Produto(String descricao, String preco) {
        this.descricao = descricao;
        this.preco = preco;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getPreco() {
        return preco;
    }

    public void setPreco(String preco) {
        this.preco = preco;
    }

    public  abstract void mostraDados();
}
