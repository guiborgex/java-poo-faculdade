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
Descritivo: Programa que lê 5 números e os armazena em um array, exibindo-os depois.
*******************************************************************************/

import java.util.Scanner;

public class exercicio06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[5];

        for(int i=0;i<5;i++){
            System.out.print("Digite um número: ");
            numeros[i]=sc.nextInt();
        }

        for(int i=0;i<5;i++){
            System.out.println(numeros[i]);
        }

        // fecha o scanner para liberar o recurso de entrada
        sc.close();
    }
}

/******************************************************************************
1. O programa declara um array de inteiros com tamanho fixo de 5 posições.
2. Utiliza um laço de repetição para solicitar ao usuário cinco valores.
3. Cada valor digitado é armazenado em uma posição do array.
4. Após o preenchimento, um segundo laço percorre o array.
5. Cada elemento armazenado é exibido no console.
6. Por fim, o objeto Scanner é fechado para liberar o recurso de entrada.
*******************************************************************************/