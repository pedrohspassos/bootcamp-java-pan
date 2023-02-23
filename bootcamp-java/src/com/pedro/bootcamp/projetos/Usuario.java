package com.pedro.bootcamp.projetos;

import java.util.Scanner;

public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv tv = new SmartTv();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("A TV esta: " + tv.ligada);
        System.out.println("Canal Atual: " + tv.canal);
        System.out.println("Volume: " + tv.volume);

        tv.ligar();
        System.out.println("Novo status: " + tv.ligada);
        tv.aumentarVolume();
        System.out.println("Volume atual: " + tv.volume);

        tv.mudarCanal(sc.nextInt());

        System.out.println("Canal Atual: " + tv.canal);

    }
}
