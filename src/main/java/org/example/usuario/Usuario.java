package org.example.usuario;

import org.example.celular.Iphone;

public class Usuario {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        //Aparelho Telefônico
        iphone.tocar();
        iphone.pausar();
        iphone.selecionarMusica();

        System.out.println("--------------------");

        //Navegador Internet
        iphone.ligar();
        iphone.atender();
        iphone.iniciarCorreioVoz();

        System.out.println("--------------------");

        //Reprodutor  Musical
        iphone.exibirPagina();
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
    }
}
