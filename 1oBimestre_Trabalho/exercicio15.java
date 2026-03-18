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
Descritivo: Programa que calcula o IMC e mostra a classificação do resultado.
*******************************************************************************/

import java.util.Scanner;

public class exercicio15{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double peso, altura, imc;

        // solicita peso e altura ao usuário
        System.out.print("Digite o peso (kg): ");
        peso = sc.nextDouble();
        System.out.print("Digite a altura (m): ");
        altura = sc.nextDouble();

        // calcula o IMC utilizando a fórmula peso dividido pela altura ao quadrado
        imc = peso / (altura * altura);

        // determina a classificação com base no valor do IMC
        String classificacao;
        if (imc < 18.5) {
            classificacao = "Abaixo do peso";
        } else if (imc < 25) {
            classificacao = "Peso normal";
        } else if (imc < 30) {
            classificacao = "Sobrepeso";
        } else if (imc < 35) {
            classificacao = "Obesidade grau I";
        } else if (imc < 40) {
            classificacao = "Obesidade grau II";
        } else {
            classificacao = "Obesidade grau III";
        }

        // exibe o IMC formatado com duas casas decimais e a classificação correspondente
        System.out.printf("IMC: %.2f - %s%n", imc, classificacao);

        // fecha o scanner para liberar o recurso de entrada
        sc.close();
    }
}

/******************************************************************************
1. O programa solicita peso (em kg) e altura (em metros) ao usuário.
2. Os valores digitados são armazenados em variáveis do tipo double.
3. O IMC é calculado utilizando a fórmula: IMC = peso / (altura * altura).
4. Após o cálculo, o programa verifica em qual faixa o IMC se encaixa e define uma classificação (abaixo do peso, peso normal, sobrepeso, obesidade grau I, obesidade grau II ou obesidade grau III).
5. O valor do IMC (formatado com duas casas decimais) e a classificação correspondente são exibidos no console.
6. Por fim, o objeto Scanner é fechado para liberar o recurso de entrada.
*******************************************************************************/