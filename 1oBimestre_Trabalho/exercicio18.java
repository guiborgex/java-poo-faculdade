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
Descritivo: Programa que conta a quantidade de palavras em uma frase.
*******************************************************************************/

import java.util.Scanner;

public class exercicio18{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite uma frase: ");
        String frase = sc.nextLine();

        // separa a frase em palavras utilizando espaços em branco como delimitador
        // Expressão regular \s+ garante que múltiplos espaços sejam tratados como um único separador
        String[] palavras = frase.trim().split("\\s+");
        System.out.println("Palavras: " + palavras.length);

        // fecha o scanner para liberar o recurso de entrada
        sc.close();
    }
}

/******************************************************************************
1. O programa solicita ao usuário a digitação de uma frase.
2. A frase é armazenada em uma variável do tipo String.
3. O texto digitado é dividido em palavras utilizando o método `split("\\s+")`, que considera um ou mais espaços em branco como separador.
4. Cada palavra resultante é armazenada em uma posição de um array.
5. O tamanho do array representa a quantidade de palavras na frase.
6. O total de palavras é exibido no console.
7. Por fim, o objeto Scanner é fechado para liberar o recurso de entrada.
*******************************************************************************/