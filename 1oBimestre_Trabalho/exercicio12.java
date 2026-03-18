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
Descritivo: Programa que demonstra herança com as classes Pessoa e Aluno.
*******************************************************************************/

public class exercicio12 {

    static class Pessoa{
        String nome;
    }

    static class Aluno extends Pessoa{
        String matricula;
    }

    public static void main(String[] args) {
        Aluno a = new Aluno();
        a.nome="Carlos";
        a.matricula="123";

        System.out.println(a.nome);
        System.out.println(a.matricula);
    }
}

/******************************************************************************
1. A classe Pessoa é definida com um atributo nome.
2. Uma nova classe chamada Aluno é criada.
3. A classe Aluno herda os atributos da classe Pessoa utilizando extends.
4. A classe Aluno possui um atributo adicional chamado matricula.
5. No método main é criado um objeto da classe Aluno.
6. Os atributos herdados e próprios são preenchidos.
7. Os valores são exibidos no console.
*******************************************************************************/