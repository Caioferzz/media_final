package br.senai.sp.jandira.ds1t.mediaescolar;

import br.senai.sp.jandira.ds1t.mediaescolar.model.Media_final;

public class MediaApp {
    public static void main(String[] args) {

        System.out.println("****** CÁCULO DA MÉDIA ESCOLAR ******");

        Media_final mediaFinal = new Media_final();
        mediaFinal.receberDados();
    }
}
