public class Cerveja  extends  Bebida{
     private double teorAlcoolico;

    public Cerveja(int quantidade, double teorAlcoolico) {
        super(quantidade);
        this.teorAlcoolico = teorAlcoolico;
    }

    public Cerveja(String descricao, String preco, int quantidade, double teorAlcoolico) {
        super(descricao, preco, quantidade);
        this.teorAlcoolico = teorAlcoolico;
    }

    public double getTeorAlcoolico() {
        return teorAlcoolico;
    }

    public void setTeorAlcoolico(double teorAlcoolico) {
        this.teorAlcoolico = teorAlcoolico;
    }


    public void mostraDados() {
        System.out.println("\nCerveja"+"\nteor Alcoolico:" +this.teorAlcoolico +
                         "\ndiscricao:"+ this.getDescricao()+
                         "\npreco:"+this.getPreco() +
                          "\nquantidade de EStoque:"+ this.getQuantidadeEstoque());
    }
}
