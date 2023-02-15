package br.edu.stefano.argumentos;
//Vai em Run->Edit Configurations e adiciona os parametros
public class SobreMim {
    /**
     * "args" é um array de argumentos da classe "main"
     * @param args
     */
    public static void main(String[] args) {
        //os argumentos começam com indice 0
        String nome = args [0];
        String sobrenome = args[1];
        int idade = Integer.valueOf(args[2]);
        double altura = Double.valueOf(args[3]);

        System.out.println("Olá, me chamo "+nome+" "+sobrenome);
        System.out.println("Tenho "+idade+" anos");
        System.out.println("Minha altura é "+altura+" cm");
    }
}
