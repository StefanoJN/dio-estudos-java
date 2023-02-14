package br.edu.stefano.sistema_smart_tv.model;
/**
 * <h1>SmartTV</h1>
 * Essa classe possui atributos e metodos de uma smart TV
 * <p>
 * <b>Note:</b> Leia atentamente a documentação.
 * @author  Stefano Nascimento
 * @version 1.0
 * @since 13/02/2023
 */
public class SmartTv {
    /**
     * Atributos da classe SmartTV
     */
    boolean on =false;
    public int canal=1;
    public int volume= 25;

    /**
     * Metodo que altera o valor do atributo "on" para "true"
     */
    public void ligar() {
        on=true;
    }

    /**
     * Este metodo possui um operador ternario que compara se o atributo "on" esta setado para "true" e
     * de acordo com o resultado imprime se a TV está ligada ou desligada.
     */
    public void ExibirStatusTV(){
        System.out.println(on == true ? "Status: TV Ligada" : "Status: TV Desligada");
    }

    /**
     * Metodo que incrementa +1 ao atributo volume da classe SmartTV
     */
    public void AumentarVolume() {
        volume++;
    }

    /**
     * Metodo que decrementa -1 do atributo "volume" da classe SmartTV
     */
    public void DiminuirVolume() {
        volume--;
    }

   /**
     *  Metodo que incrementa +1 ao atributo "canal" da classe SmartTV
     */
    public void AumentarCanal() {
        canal++;
    }

    /**
     *  Metodo que decrementa -1 do atributo "canal" da classe SmartTV
     */
    public void DiminuirCanal() {
        canal--;
    }

    /**
     * Metodo que muda o canal da SmartTv de acordo com parametro recebido.
     * @param newcanal este é o parametro que armazena o novo canal
     */
    public void MudarCanal(int newcanal) {
        canal = newcanal;
    }
}
