package br.edu.stefano.repeticoes_arrays;

import java.util.Scanner;

public class Repeticao_While {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) { //enquanto nome não for igual a "0" o programa vai executar
            System.out.print("Digite seu nome: ");
            String nome = scan.next();
            if (nome.equals("0")) break; //comparação com break
            System.out.print("Digite sua idade :");
            int idade = scan.nextInt();
        }System.out.println("______________________________________________________________");

        /**
         * Enquanto nota nao estiver entre 1 e 10 o programa vai repetir o while
         */
        System.out.println("Digita a nota: ");
        int nota = scan.nextInt();

        while (nota < 0 | nota > 10) {
            System.out.println("Nota invalida, digita novamente: ");
            nota = scan.nextInt();
        }
    }
}
