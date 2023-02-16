package br.edu.stefano.repeticoes_arrays;

import java.util.Scanner;

public class Repeticao_For {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Qual a tabuada costaria de ver: ");
        int tabuada = scan.nextInt();

        System.out.println("A tabuada de "+tabuada+" é :");
        for (int i = 1; i<=10 ;i++){
            System.out.println(tabuada+" X "+ i +" = " + (tabuada*i));
        }

    }
}
