package br.edu.stefano.sistema_smart_tv;

import br.edu.stefano.sistema_smart_tv.model.SmartTv;

public class main {
    public static void main(String[] args) {
        SmartTv smartTv= new SmartTv();

        smartTv.ExibirStatusTV();
        smartTv.ligar();
        smartTv.ExibirStatusTV();
        System.out.println("Canal Atual: " + smartTv.canal);
        System.out.println("Volume Atual: " + smartTv.volume);

        smartTv.AumentarVolume();
        smartTv.AumentarVolume();
        System.out.println("Aumento de Volume: " + smartTv.volume);

        smartTv.DiminuirVolume();
        System.out.println("Diminuição de Volume: " + smartTv.volume);

        smartTv.MudarCanal(15);
        System.out.println("Novo Canal :" + smartTv.canal);


    }
}
