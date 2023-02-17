package br.edu.stefano.estrutura_dados.no.model;

public class No {

    private String conteudo;
    private No proximoNo;

    public No(String conteudo) {
        this.conteudo = conteudo;
        this.proximoNo = proximoNo;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public No getProximoNo() {
        return proximoNo;
    }

    public void setProximoNo(No proximoNo) {
        this.proximoNo = proximoNo;
    }

    @Override
    public String toString() {
        return "No{" +
                "conteudo='" + conteudo + '\'' +
                '}';
    }
}

