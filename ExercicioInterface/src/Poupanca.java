public class Poupanca extends  Conta {
    private  double rendimentoAnual;
    public Poupanca(String numero, double saldo, double rendimentoAnual) {
        super(numero, saldo);
        this.rendimentoAnual = rendimentoAnual;
    }

    public Poupanca(String descriicao, Cliente cliente, String numero, double saldo, double rendimentoAnual) {
        super(descriicao, cliente, numero, saldo);
        this.rendimentoAnual = rendimentoAnual;
    }

    public double getRendimentoAnual() {
        return rendimentoAnual;
    }

    public void setRendimentoAnual(double rendimentoAnual) {
        this.rendimentoAnual = rendimentoAnual;
    }



}
