package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {
    public static void main(String[] args) {
        /*   System.out.println("Hello world!");*/
        Gato gato = new Gato();
        gato.setNome("Garfield");
        gato.setIdade(1);
        System.out.println(gato.getNome() + " " + gato.getIdade());
    }
}