package Aula4_ex1;

public class Pessoa {

    String nome;
    Pessoa amigo;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public void adicionarAmigo(Pessoa amigo) {
        this.amigo = amigo;
    }

    public void mostrarAmigo() {
        if (amigo != null) {
            System.out.println(nome + " é amigo de " + amigo.nome);
        } else {
            System.out.println(nome + " não tem amigo.");
        }
    }
}