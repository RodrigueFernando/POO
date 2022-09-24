import java.util.ArrayList;
import java.util.List;

public  class Pizza extends  Produto{
   private  boolean bordaRecheado;
   private List<Ingrediente>ingredientes = new ArrayList<>();

    public Pizza() {

    }

    @Override
    public void mostraDados() {

        System.out.println("\nPizza:"+"\nborda rechiada:" + this.bordaRecheado+"\ndiscricao:"+this.getDescricao()+
        "\npreco:" + this.getPreco());


        for( Ingrediente j : ingredientes){
            System.out.println("ingredientes: " + j.getNome());
        }

    }

    public Pizza(boolean bordaRecheado, List<Ingrediente> ingredientes) {
        this.bordaRecheado = bordaRecheado;
        this.ingredientes = ingredientes;
    }

    public Pizza(String descricao, String preco, boolean bordaRecheado, List<Ingrediente> ingredientes) {
        super(descricao, preco);
        this.bordaRecheado = bordaRecheado;
        this.ingredientes = ingredientes;
    }



}
