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
Descritivo: Programa que demonstra o uso de interface com Veiculo e implementação Carro.
*******************************************************************************/

interface Veiculo {
    /**
     * Acelera o veículo.
     */
    void acelerar();

    /**
     * Freia o veículo.
     */
    void frear();
}

class Carro implements Veiculo {
    @Override
    public void acelerar() {
        System.out.println("Carro acelerando");
    }

    @Override
    public void frear() {
        System.out.println("Carro freando");
    }
}

public class exercicio13 {
    public static void main(String[] args) {
        Carro c = new Carro();
        // demonstra os métodos de acelerar e frear da interface
        c.acelerar();
        c.frear();
    }
}

/******************************************************************************
1. É definida uma interface chamada Veiculo.
2. A interface declara os métodos acelerar() e frear().
3. Uma classe chamada Carro implementa a interface utilizando implements.
4. A classe fornece a implementação dos métodos definidos na interface.
5. No método main é criado um objeto da classe Carro.
6. Os métodos acelerar() e frear() são executados.
*******************************************************************************/
