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
Descritivo: Programa que solicita dois números inteiros ao usuário e exibe o resultado da soma.
*******************************************************************************/

import java.util.Scanner;

public class exercicio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2, soma;

        System.out.print("Digite o primeiro número: ");
        num1 = sc.nextInt();

        System.out.print("Digite o segundo número: ");
        num2 = sc.nextInt();

        soma = num1 + num2;
        System.out.println("Resultado da soma: " + soma);

        // fecha o scanner para liberar o recurso de entrada
        sc.close();
    }
}

/******************************************************************************
1. O programa inicia no método main, ponto de entrada da aplicação Java.
2. A classe Scanner é instanciada para permitir a leitura de dados do teclado.
3. O usuário informa dois números inteiros através do método nextInt().
4. Os valores digitados são armazenados nas variáveis num1 e num2.
5. A operação aritmética de soma é realizada utilizando o operador +.
6. O resultado da operação é armazenado na variável soma.
7. O método System.out.println() é utilizado para exibir o resultado no console.
8. Por fim, o objeto Scanner é fechado para liberar o recurso de entrada.
*******************************************************************************/
