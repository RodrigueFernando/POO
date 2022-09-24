public class Corrente extends  Conta implements ITributavel{
    private  double limitedisponivel;

    public Corrente(String numero, double saldo, double limitedisponivel) {
        super(numero, saldo);
        this.limitedisponivel = limitedisponivel;
    }

    public Corrente(String descriicao, Cliente cliente, String numero, double saldo, double limitedisponivel) {
        super(descriicao, cliente, numero, saldo);
        this.limitedisponivel = limitedisponivel;
    }

    public double getLimitedisponivel() {
        return limitedisponivel;
    }

    public void setLimitedisponivel(double limitedisponivel) {
        this.limitedisponivel = limitedisponivel;
    }

    @Override
    public void calcularAtibuto() {
        setSaldo(getSaldo()- 0.05 ) ;
        System.out.println(getSaldo());
    }
}
