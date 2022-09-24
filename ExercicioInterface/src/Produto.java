public class Produto  implements Iprint{
    private String descriicao;
    private Cliente cliente;

    public Produto() {
    }

    public Produto(String descriicao, Cliente cliente) {
        this.descriicao = descriicao;
        this.cliente = cliente;
    }

    public String getDescriicao() {
        return descriicao;
    }

    public void setDescriicao(String descriicao) {
        this.descriicao = descriicao;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public void mostarDados() {
        System.out.println("\n"+"Discricao: "+ getDescriicao()
                            +"\n"+"Nome: "+getCliente().getNome()
                            + "\n"+"cpf: " + getCliente().getCpf());
    }
}
