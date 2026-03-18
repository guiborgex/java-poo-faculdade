/******************************************************************************
Curso: Engenharia de Software
Disciplina: Análise e Projeto Orientado a Objetos
Professor: José Carlos Flores
Turma: ESOFT3A

Componentes:
26006989-2 - Guilherme Borges de Gouveia
24135968-2 - Nycollas Codognoto Ferreira
25043865-2 - Leonardo Cassenotti Andretta
25001795-2 - Christian Romanichen
26005680-2 - Hygor dos Santos de Andrade

Data: 18 de Março de 2026
Descritivo: Programa que cria uma classe Pessoa com nome e idade e exibe os dados.
*******************************************************************************/

public class exercicio11 {

    static class Pessoa{
        String nome;
        int idade;

        /**
         * Exibe no console o nome e a idade da pessoa.
         */
        void mostrar() {
            System.out.println("Nome: " + nome);
            System.out.println("Idade: " + idade);
        }
    }

    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        p.nome = "João";
        p.idade = 25;

        // chama o método para exibir os dados da pessoa
        p.mostrar();
    }
}

/******************************************************************************
1. É criada uma classe chamada Pessoa.
2. A classe possui dois atributos: nome e idade.
3. Um método chamado mostrar() é implementado para exibir os dados.
4. No método main é criado um objeto da classe Pessoa.
5. Os atributos recebem valores.
6. O método mostrar() é chamado para imprimir as informações no console.
*******************************************************************************/