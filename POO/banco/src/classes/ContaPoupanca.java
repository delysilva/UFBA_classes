package classes;

public class ContaPoupanca {
    private int numero;
    private int agencia;
    private String nome;
    private float saldo;
    private float taxaDeJuros;

    public ContaPoupanca(int numero, int agencia, String nome, float saldo, float taxaDeJuros) {
        this.numero = numero;
        this.agencia = agencia;
        this.nome = nome;
        this.saldo = saldo;
        this.taxaDeJuros = taxaDeJuros;
    }

    public void depositar(float valor) {
        this.saldo += valor;
    }

    public void sacar(float valor) {
        if(valor > this.saldo){
            System.out.println("Saldo insuficiente.");
            return;
        }
        this.saldo -= valor;
    }

    public void transferir(ContaPoupanca conta, float valor) {
        if (valor > this.saldo) {
            System.out.println("Saldo insuficiente.");
            return;
        }
        this.sacar(valor);
        conta.depositar(valor);
    }

    public void renderJuros() {
        this.saldo += this.saldo * this.taxaDeJuros;
    }

    public void extrato() {
        System.out.println("Número: " + this.numero);
        System.out.println("Agência: " + this.agencia);
        System.out.println("Nome: " + this.nome);
        System.out.println("Saldo: " + this.saldo);
        System.out.println("Taxa de juros: " + this.taxaDeJuros);
    }

    public int getNumero() {
        return this.numero;
    }

    public int getAgencia() {
        return this.agencia;
    }

    public String getNome() {
        return this.nome;
    }

    public float getSaldo() {
        return this.saldo;
    }

    public float getTaxaDeJuros() {
        return this.taxaDeJuros;
    }

    public void setTaxaDeJuros(float taxaDeJuros) {
        this.taxaDeJuros = taxaDeJuros;
    }
}
