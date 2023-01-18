public class Principal {
    public static void main(String[] args) {
        Produto produto = new Produto("Smaetohone",2000.0);
        Produto produto2 = new Produto("laptop",3500.00);

        Cliente cliente = new Cliente("maria","12345678910");


        Compra compra = new Compra("2",cliente);

        ItemCompra item =new ItemCompra(2,compra,produto);
        compra.mostraDados();
        item.mostraItem();
    }
}
