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
Descritivo: Programa que valida uma senha verificando tamanho, letras e números.
*******************************************************************************/

import java.util.Scanner;

public class exercicio16{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite uma senha: ");
        String senha = sc.nextLine();

        // verifica se a senha possui pelo menos 8 caracteres
        boolean tamanhoOk = senha.length() >= 8;
        // verifica se contém pelo menos uma letra maiúscula
        boolean temMaiuscula = false;
        // verifica se contém pelo menos uma letra minúscula
        boolean temMinuscula = false;
        // verifica se contém pelo menos um número
        boolean temNumero = false;

        for (char ch : senha.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                temMaiuscula = true;
            } else if (Character.isLowerCase(ch)) {
                temMinuscula = true;
            } else if (Character.isDigit(ch)) {
                temNumero = true;
            }
        }

        if (tamanhoOk && temMaiuscula && temMinuscula && temNumero) {
            System.out.println("Senha válida");
        } else {
            System.out.println("Senha inválida. A senha deve ter pelo menos 8 caracteres, uma letra maiúscula, uma letra minúscula e um número.");
        }

        // fecha o scanner para liberar o recurso de entrada
        sc.close();
    }
}

/******************************************************************************
1. O programa solicita ao usuário a digitação de uma senha.
2. A senha digitada é armazenada em uma variável do tipo String.
3. O programa verifica se a senha possui pelo menos oito caracteres.
4. Em seguida verifica se a senha contém pelo menos uma letra maiúscula, uma letra minúscula e um número.
5. Se todas as condições forem atendidas, a senha é considerada válida; caso contrário, é considerada inválida e uma mensagem explicativa é exibida.
6. Por fim, o objeto Scanner é fechado para liberar o recurso de entrada.
*******************************************************************************/