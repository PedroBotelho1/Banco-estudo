package Entidades;

public class Usuario {

    private int numero;
    private String nome;
    private double saldo;

    public Usuario(int numero, String nome) {
        this.numero = numero;
        this.nome = nome;
    }

    public Usuario(int numero, String nome, double depositoInicial) {
        this.numero = numero;
        this.nome = nome;
        deposito(depositoInicial);
    }

    public int getNumero() {
        return numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public void deposito(double quantia) {
        saldo += quantia;
    }

    public void saque(double quantia) {
        saldo -= quantia + 5.00;
    }

    public String toString() {
        return "Usuario "
                + numero
                + ", Nome: "
                + nome
                + ", Saldo: $ "
                + saldo;
    }

}
