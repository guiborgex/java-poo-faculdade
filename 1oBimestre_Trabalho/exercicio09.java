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
Descritivo: Programa que funciona como uma calculadora simples usando switch.
*******************************************************************************/

import java.util.Scanner;

public class exercicio09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a,b;
        int op;

        System.out.print("Número 1: ");
        a=sc.nextDouble();
        System.out.print("Número 2: ");
        b=sc.nextDouble();

        System.out.println("Escolha uma operação: 1 - Soma | 2 - Subtração | 3 - Multiplicação | 4 - Divisão");
        op = sc.nextInt();

        switch(op){
            case 1: System.out.println(a+b); break;
            case 2: System.out.println(a-b); break;
            case 3: System.out.println(a*b); break;
            case 4: System.out.println(a/b); break;
            default: System.out.println("Opção inválida");
        }

        // fecha o scanner para liberar o recurso de entrada
        sc.close();
    }
}

/******************************************************************************
1. O programa solicita ao usuário dois números do tipo double.
2. Os valores digitados são armazenados em variáveis numéricas.
3. O usuário escolhe a operação digitando um número inteiro correspondente à operação desejada (1 para soma, 2 para subtração, 3 para multiplicação ou 4 para divisão).
4. A estrutura de controle `switch` é utilizada para identificar a operação selecionada.
5. Dependendo da opção informada, a operação correspondente é executada e o resultado é exibido.
6. Caso seja digitada uma opção inválida, o programa exibe uma mensagem de erro.
7. Por fim, o objeto Scanner é fechado para liberar o recurso de entrada.
*******************************************************************************/