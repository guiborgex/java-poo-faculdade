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
Descritivo: Programa que solicita três notas e calcula a média aritmética.
*******************************************************************************/

import java.util.Scanner;

public class exercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n1,n2,n3,media;

        System.out.print("Nota 1: ");
        n1 = sc.nextDouble();
        System.out.print("Nota 2: ");
        n2 = sc.nextDouble();
        System.out.print("Nota 3: ");
        n3 = sc.nextDouble();

        media = (n1+n2+n3)/3;
        System.out.println("Média: "+media);

        // fecha o scanner para liberar o recurso de entrada
        sc.close();
    }
}

/******************************************************************************
1. O programa solicita ao usuário a entrada de três valores numéricos.
2. Cada valor é armazenado em uma variável do tipo double.
3. Os valores são somados utilizando o operador aritmético de adição.
4. O resultado da soma é dividido por 3 para calcular a média aritmética.
5. O resultado final é armazenado na variável media.
6. O valor calculado é exibido ao usuário através do console.
7. Por fim, o objeto Scanner é fechado para liberar o recurso de entrada.
*******************************************************************************/