public class Livro {
    Editora editora;
    Autor autor;
    private String titulo;
    private int anoPuplicacao;
    private double preco;

    public Livro() {
    }

    public Livro(Editora editora, Autor autor, String titulo, int anoPuplicacao, double preco) {
        this.editora = editora;
        this.autor = autor;
        this.titulo = titulo;
        this.anoPuplicacao = anoPuplicacao;
        this.preco = preco;
    }

    public Editora getEditora() {
        return editora;
    }

    public void setEditora(Editora editora) {
        this.editora = editora;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnoPuplicacao() {
        return anoPuplicacao;
    }

    public void setAnoPuplicacao(int anoPuplicacao) {
        this.anoPuplicacao = anoPuplicacao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    void mostraDados(){
        System.out.println("razao social:" +editora.getRazaoSocial()
        +"\n cnpj:"+ editora.getCnpj()
        +"\n nome autor:"+autor.getNome()
        +"\n telefone autor:"+ autor.getTelefone());
    }
}
