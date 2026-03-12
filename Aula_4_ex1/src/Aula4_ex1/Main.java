package Aula4_ex1;

public class Main {

    public static void main(String[] args) {

        // Associação Unária
        Pessoa p1 = new Pessoa("João");
        Pessoa p2 = new Pessoa("Carlos");
        p1.adicionarAmigo(p2);
        p1.mostrarAmigo();

        System.out.println("-----------");

        // Associação múltipla
        Professor prof = new Professor("Marcos");
        Disciplina disc = new Disciplina("POO", prof);
        Estudante est = new Estudante("Ana", disc);
        est.mostrarInfo();

        System.out.println("-----------");

        // Cardinalidade
        Empresa emp = new Empresa("Tech LTDA");
        Funcionario f1 = new Funcionario("Lucas");
        Funcionario f2 = new Funcionario("Pedro");

        emp.adicionarFuncionario(f1);
        emp.adicionarFuncionario(f2);
        emp.listarFuncionarios();

        System.out.println("-----------");

        // Navegabilidade
        Cliente c1 = new Cliente("Maria");
        ContaBancaria conta = new ContaBancaria(1234, c1);
        conta.mostrarConta();
    }
}