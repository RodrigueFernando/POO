import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("fernando","123456");
        Produto produto = new Produto("carro",cliente);
        Conta conta = new Conta("2",cliente,"2",2000);
        SeguroVida seguroVida = new SeguroVida("seguro",cliente,3000);
        Corrente corrente =new Corrente("123",2000,5000);
        Poupanca poupanca = new Poupanca("321",5000,0.07);

        cliente.mostarDados();
        produto.mostarDados();
        corrente.calcularAtibuto();
        seguroVida.calcularAtibuto();
     












    }
}
