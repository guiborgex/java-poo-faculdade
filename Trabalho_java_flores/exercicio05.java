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
Descritivo: Programa que exibe todos os números pares de 1 até 20.
*******************************************************************************/

public class exercicio05 {
    public static void main(String[] args) {
        for(int i=1;i<=20;i++){
            if(i%2==0)
                System.out.println(i);
        }
    }
}

/******************************************************************************
1. O programa utiliza uma estrutura de repetição do tipo for.
2. O contador inicia no valor 1 e se incrementa até alcançar 20.
3. A cada iteração é realizada uma verificação utilizando o operador módulo.
4. Caso o resto da divisão por 2 seja igual a zero, o número é par.
5. Somente os números pares são exibidos no console.
*******************************************************************************/