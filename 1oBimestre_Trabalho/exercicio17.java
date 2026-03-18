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
Descritivo: Programa de jogo de adivinhação com número aleatório.
*******************************************************************************/

import java.util.Random;
import java.util.Scanner;

public class exercicio17{
    public static void main(String[] args){
        Random r = new Random();
        Scanner sc = new Scanner(System.in);

        int numero = r.nextInt(100) + 1;
        int chute = 0;

        System.out.println("Tente adivinhar o número sorteado entre 1 e 100!");
        while (chute != numero) {
            System.out.print("Digite seu palpite: ");
            chute = sc.nextInt();

            if (chute > numero) {
                System.out.println("Menor");
            } else if (chute < numero) {
                System.out.println("Maior");
            }
        }

        System.out.println("Acertou!");

        // fecha o scanner para liberar o recurso de entrada
        sc.close();
    }
}

/******************************************************************************
1. O programa utiliza a classe Random para gerar um número aleatório.
2. O número gerado está no intervalo entre 1 e 100.
3. O usuário tenta adivinhar o número digitando palpites.
4. Um laço while mantém o jogo em execução até o acerto.
5. A cada tentativa o programa compara o palpite com o número gerado.
6. Caso o palpite seja menor, o programa indica "maior".
7. Caso o palpite seja maior, o programa indica "menor".
8. Quando o número é acertado, o programa encerra o laço.
9. Por fim, o objeto Scanner é fechado para liberar o recurso de entrada.
*******************************************************************************/