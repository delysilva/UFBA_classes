package classes;

public class ContaCorrente extends ContaPoupanca{
    private float anuidade;

    public ContaCorrente(int numero, int agencia, String nome, float saldo, float taxaDeJuros, float anuidade) {
        super(numero, agencia, nome, saldo, taxaDeJuros);
        this.anuidade = anuidade;
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
        super.sacar(this.anuidade);
    }

    public void depositar(float valor) {
        super.depositar(valor);
    }

    public void extrato() {
        super.extrato();
        System.out.println("Anuidade: " + this.anuidade);
    }

    public float getAnuidade() {
        return this.anuidade;
    }

    public void setAnuidade(float anuidade) {
        this.anuidade = anuidade;
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

    public int getNumero() {
        return super.getNumero();
    }
}
