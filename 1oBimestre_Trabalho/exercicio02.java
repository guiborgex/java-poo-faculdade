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
Descritivo: Programa que lê um número inteiro e verifica se ele é par ou ímpar.
*******************************************************************************/

import java.util.Scanner;

public class exercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;

        System.out.print("Digite um número: ");
        numero = sc.nextInt();

        if(numero % 2 == 0)
            System.out.println("Número par");
        else
            System.out.println("Número ímpar");

        // fecha o scanner para liberar o recurso de entrada
        sc.close();
    }
}

/******************************************************************************
1. O programa recebe um número inteiro informado pelo usuário.
2. O valor é armazenado na variável numero.
3. É utilizada a operação módulo (%) para verificar o resto da divisão por 2.
4. Caso o resto da divisão seja igual a 0, o número é considerado par.
5. Caso contrário, o número é considerado ímpar.
6. A verificação é realizada utilizando uma estrutura condicional if/else.
7. O resultado da verificação é exibido no console.
8. Por fim, o objeto Scanner é fechado para liberar o recurso de entrada.
*******************************************************************************/