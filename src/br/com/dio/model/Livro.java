package br.com.dio.model;

public class Livro {
    private String name;
    private Integer pagina;

    public Livro(String name, Integer pagina) {
        this.name = name;
        this.pagina = pagina;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPagina() {
        return pagina;
    }

    public void setPagina(Integer pagina) {
        this.pagina = pagina;
    }
}

