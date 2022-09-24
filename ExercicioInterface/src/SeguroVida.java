public class SeguroVida  extends  Produto implements ITributavel{
    private double premio;

    public SeguroVida(double premio) {
        this.premio = premio;
    }

    public SeguroVida(String descriicao, Cliente cliente, double premio) {
        super(descriicao, cliente);
        this.premio = premio;
    }

    public double getPremio() {
        return premio;
    }

    public void setPremio(double premio) {
        this.premio = premio;
    }

    @Override
    public void calcularAtibuto() {
        setPremio(getPremio() * 1.07);
        System.out.println("primo: "+getPremio());
    }
}
