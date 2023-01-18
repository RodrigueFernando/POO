import java.util.Date;
import java.util.List;

public class Compra {
    private String numeroCompra;
   // private Date datacompra;
    private double valorTotalCompra;
    private List<ItemCompra> compra;
    Cliente cliente;

    public Compra() {
    }

    public Compra(String numeroCompra, Cliente cliente) {
        this.numeroCompra = numeroCompra;
        //this.datacompra = datacompra;
        this.cliente = cliente;
    }



    public String getNumeroCompra() {
        return numeroCompra;
    }

    public void setNumeroCompra(String numeroCompra) {
        this.numeroCompra = numeroCompra;
    }




    public void setValorTotalCompra(double valorTotalCompra) {
        this.valorTotalCompra = valorTotalCompra;
    }

    public List<ItemCompra> getCompra() {
        return compra;
    }

    public void setCompra(List<ItemCompra> compra) {
        this.compra = compra;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public void calculaTotalCompra(){
         double total =0;
        for(ItemCompra i: compra){
            total =  + i.getValorParcial();
        }
        this.setValorTotalCompra(total);
    }

    public void mostraDados(){
        System.out.println("numero compra:" + this.numeroCompra+"\n"
                          +"valor total compra"+ this.getNumeroCompra());
    }
}
