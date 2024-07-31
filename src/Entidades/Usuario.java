package Entidades;

public class Usuario {

    private int numero;
    private String nome;
    private double saldo;

    // Construtor
    public Usuario(int numero, String nome) {
        this.numero = numero;
        this.nome = nome;
    }

    // Construtor
    public Usuario(int numero, String nome, double depositoInicial) {
        this.numero = numero;
        this.nome = nome;
        deposito(depositoInicial);
    }

    //Get para o numero da conta
    public int getNumero() {
        return numero;
    }

    // Get para o nome do usuário
    public String getNome() {
        return nome;
    }

    // Set para o nome de usuário
    public void setNome(String nome) {
        this.nome = nome;
    }

    // get para o saldo na conta
    public double getSaldo() {
        return saldo;
    }

    // Método para depositar uma quantia na conta
    public void deposito(double quantia) {
        saldo += quantia;
    }

    // Método para sacar uma quantia da conta, com taxa de $5.00
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
