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
Descritivo: Programa que lê 5 números e mostra qual é o maior deles.
*******************************************************************************/

import java.util.Scanner;

public class exercicio07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] n = new int[5];

        for(int i=0;i<5;i++){
            System.out.print("Digite um número: ");
            n[i] = sc.nextInt();
        }

        int maior=n[0];

        for(int i=1;i<5;i++){
            if(n[i]>maior)
                maior=n[i];
        }

        System.out.println("Maior número: "+maior);

        // fecha o scanner para liberar o recurso de entrada
        sc.close();
    }
}

/******************************************************************************
1. O programa declara um array de inteiros com 5 posições.
2. Um laço solicita ao usuário a digitação de cinco números que são armazenados no array.
3. A variável `maior` recebe inicialmente o primeiro valor do array.
4. Um laço percorre o array a partir do segundo elemento.
5. A cada iteração é comparado se o valor atual é maior que o valor armazenado em `maior`; se sim, `maior` é atualizado.
6. Ao final, `maior` contém o maior número informado pelo usuário.
7. O resultado é exibido no console.
8. Por fim, o objeto Scanner é fechado para liberar o recurso de entrada.
*******************************************************************************/
