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
Descritivo: Programa que conta a quantidade de vogais em uma palavra ou frase.
*******************************************************************************/

import java.util.Scanner;

public class exercicio08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite uma palavra ou frase: ");
        String texto = sc.nextLine();

        int contador=0;
        texto=texto.toLowerCase();

        for(int i=0;i<texto.length();i++){
            char c = texto.charAt(i);
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
                contador++;
        }

        System.out.println("Vogais: "+contador);

        // fecha o scanner para liberar o recurso de entrada
        sc.close();
    }
}

/******************************************************************************
1. O programa solicita ao usuário uma string.
2. O texto é convertido para letras minúsculas para facilitar a comparação.
3. Um laço percorre todos os caracteres da string.
4. Cada caractere é obtido através do método charAt().
5. É realizada uma verificação para identificar se o caractere é uma vogal.
6. Caso seja uma vogal, um contador é incrementado.
7. Ao final da verificação, o total de vogais é exibido no console.
8. Por fim, o objeto Scanner é fechado para liberar o recurso de entrada.
*******************************************************************************/