package br.edu.stefano.estrutura_dados.no;

import br.edu.stefano.estrutura_dados.no.model.No;

public class main {
    public static void main(String[] args) {
        No no1 = new No("Conteudo 1");
        No no2 = new No("Conteudo 2");
        no1.setProximoNo(no2);

        No no3 = new No("Conteudo 3");
        no2.setProximoNo(no3);

        No no4 = new No("Conteudo 4");
        no3.setProximoNo(no4);

        System.out.println(no1);
        System.out.println(no2);

        System.out.println(no1.getProximoNo().getProximoNo().getProximoNo().getProximoNo());
    }
}
