package entity;

public class Conta {
    private int nuberCont;
    private String nome;
    private double valor;

    public Conta(){}

    public Conta(int nuberCont, String nome) {
        this.nuberCont = nuberCont;
        this.nome = nome;
    }

    public Conta(int nuberCont, String nome, double inicialValor) {
        this.nuberCont = nuberCont;
        this.nome = nome;
        deposito(inicialValor);
    }

    public int getNuberCont() {
        return nuberCont;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void deposito(double quantia){
        valor += quantia;
    }

    public void saldoRetirada(double quantia){
        valor -= quantia + 5;
    }

    @Override
    public String toString() {
        return "Conta: " + nuberCont +
                ", nome: " + nome +
                ", valor: $" + String.format("%.2f", valor);

    }
}
