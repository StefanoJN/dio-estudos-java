package br.edu.stefano.estrutura_dados.generics.model;

public class NoGenerecs<T> { //NO com Generecs "<T>"

    private T conteudo; //tipo de variavel generic
    private NoGenerecs<T> proximoNo;//Variavel NO com Generecs "<T>"

    public NoGenerecs(T conteudo) {
        this.conteudo = conteudo;
        this.proximoNo = proximoNo;
    }

    public T getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public NoGenerecs<T> getProximoNo() {
        return proximoNo;
    }

    public void setProximoNo(NoGenerecs<T> proximoNo) {
        this.proximoNo = proximoNo;
    }

    @Override
    public String toString() {
        return "No{" +
                "conteudo='" + conteudo + '\'' +
                '}';
    }
}

