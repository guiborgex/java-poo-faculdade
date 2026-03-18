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
Descritivo: Programa que mostra a tabuada de um número digitado pelo usuário.
*******************************************************************************/

import java.util.Scanner;

public class exercicio14{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número para exibir a tabuada: ");
        int n = sc.nextInt();

        for(int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }

        // fecha o scanner para liberar o recurso de entrada
        sc.close();
    }
}

/******************************************************************************
1. O programa solicita um número inteiro ao usuário.
2. O valor digitado é armazenado em uma variável inteira.
3. Utiliza-se uma estrutura de repetição `for` de 1 até 10 para gerar a tabuada.
4. A cada iteração o número informado é multiplicado pelo contador e o resultado é calculado.
5. Cada linha da tabuada é exibida no console.
6. Por fim, o objeto Scanner é fechado para liberar o recurso de entrada.
*******************************************************************************/