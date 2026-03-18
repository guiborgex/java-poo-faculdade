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
Descritivo: Programa que ordena um array de números em ordem crescente.
*******************************************************************************/

import java.util.Arrays;

public class exercicio10 {
    public static void main(String[] args) {
        int[] n={5,3,8,1,9};
        Arrays.sort(n);

        for(int i:n)
            System.out.println(i);
    }
}

/******************************************************************************
1. Um array de números inteiros é inicializado com valores aleatórios.
2. O método Arrays.sort() é utilizado para ordenar os elementos.
3. Esse método organiza os valores em ordem crescente.
4. Após a ordenação, um laço percorre o array.
5. Cada elemento ordenado é exibido no console.
*******************************************************************************/