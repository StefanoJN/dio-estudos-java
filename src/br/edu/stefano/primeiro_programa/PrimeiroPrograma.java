package br.edu.stefano.primeiro_programa;

import br.edu.stefano.primeiro_programa.model.Gato;
import br.edu.stefano.primeiro_programa.model.Livro;

public class PrimeiroPrograma {
    public static void main(String[] args) {
        /*   System.out.println("Hello world!");*/
        Gato gato = new Gato();
        gato.setNome("Garfield");
        gato.setIdade(1);
        System.out.println(gato.getNome() + " " + gato.getIdade());
        Livro livro = new Livro("Tres Porquinhos", 328);
        System.out.println(livro.getName() + " Paginas:" + livro.getPagina());
    }
}