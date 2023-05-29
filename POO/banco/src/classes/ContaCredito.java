package classes;

public class ContaCredito extends ContaCorrente{
    private float limite;
    private float limiteUtilizado;

    public ContaCredito(int numero, int agencia, String nome, float saldo, float taxaDeJuros, float anuidade, float limite) {
        super(numero, agencia, nome, saldo, taxaDeJuros, anuidade);
        this.limite = limite;
        this.limiteUtilizado = 0;
    }

    public void sacar(float valor) {
        super.sacar(valor);
    }

    public void transferir(ContaPoupanca conta, float valor) {
        super.transferir(conta, valor);
    }

    public void renderJuros() {
        super.renderJuros();
    }

    public void cobrarAnuidade() {
        super.cobrarAnuidade();
    }

    public void depositar(float valor) {
        super.depositar(valor);
    }

    public void extrato() {
        super.extrato();
        System.out.println("Limite: " + this.limite);
        System.out.println("Limite utilizado: " + this.limiteUtilizado);
    }

    public float getLimite() {
        return this.limite;
    }

    public void setLimite(float limite) {
        this.limite = limite;
    }

    public float getLimiteUtilizado() {
        return this.limiteUtilizado;
    }

    public void setLimiteUtilizado(float limiteUtilizado) {
        this.limiteUtilizado = limiteUtilizado;
    }

    public void setTaxaDeJuros(float taxaDeJuros) {
        super.setTaxaDeJuros(taxaDeJuros);
    }

    public float getTaxaDeJuros() {
        return super.getTaxaDeJuros();
    }

    public float getSaldo() {
        return super.getSaldo();
    }

    public String getNome() {
        return super.getNome();
    }

    public int getAgencia() {
        return super.getAgencia();
    }

    public void setAnuidade(float anuidade) {
        super.setAnuidade(anuidade);
    }

    public float getAnuidade() {
        return super.getAnuidade();
    }


    public int getNumero() {
        return super.getNumero();
    }

}
