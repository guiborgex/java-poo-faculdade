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
Descritivo: Programa que converte temperatura de Celsius para Fahrenheit.
*******************************************************************************/

import java.util.Scanner;

public class exercicio04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double c,f;

        System.out.print("Digite Celsius: ");
        c = sc.nextDouble();

        f = (c*9/5)+32;
        System.out.println("Fahrenheit: "+f);

        // fecha o scanner para liberar o recurso de entrada
        sc.close();
    }
}

/******************************************************************************
1. O programa solicita a entrada de um valor de temperatura em graus Celsius.
2. O valor é armazenado em uma variável do tipo double.
3. É aplicada a fórmula matemática de conversão para Fahrenheit:
   F = (C * 9/5) + 32.
4. O resultado da operação é armazenado na variável f.
5. O valor convertido é exibido no console para o usuário.
6. Por fim, o objeto Scanner é fechado para liberar o recurso de entrada.
*******************************************************************************/