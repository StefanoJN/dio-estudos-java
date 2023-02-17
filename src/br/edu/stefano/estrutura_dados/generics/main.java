package br.edu.stefano.estrutura_dados.generics;

import br.edu.stefano.estrutura_dados.generics.model.NoGenerecs;

public class main {
    public static void main(String[] args) {

        NoGenerecs<String> no1 = new NoGenerecs<>("Conteudo 1");
        NoGenerecs<String> no2 = new NoGenerecs<>("Conteudo 2");
        no1.setProximoNo(no2);

        NoGenerecs<String> no3 = new NoGenerecs<>("Conteudo 3");
        no2.setProximoNo(no3);

        NoGenerecs<String> no4 = new NoGenerecs<>("Conteudo 4");
        no3.setProximoNo(no4);

        System.out.println(no1);
        System.out.println(no2);

        System.out.println(no1.getProximoNo().getProximoNo().getProximoNo().getProximoNo());
    }
}
