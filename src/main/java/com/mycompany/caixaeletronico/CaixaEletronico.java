/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.caixaeletronico;

import java.util.Scanner;

/**
 *
 * @author Everton
 */
public class CaixaEletronico {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int notas100 = 0, notas50 = 0, notas20 = 0, notas10 = 0, notas5 = 0;

        System.out.println("Caixa Eletrônico. ");

        System.out.println("Quanto deseja sacar ?: ");
        int saque = sc.nextInt();

        while (saque != 0) {
            if (saque % 5 == 0) {
                if (saque >= 100) {
                    notas100 = saque / 100;
                    saque = saque % 100;
                } else if (saque >= 50) {
                    notas50 = saque / 50;
                    saque = saque % 50;
                } else if (saque >= 20) {
                    notas20 = saque / 20;
                    saque = saque % 20;
                } else if (saque >= 10) {
                    notas10 = saque / 10;
                    saque = saque % 10;
                } else if (saque >= 5) {
                    notas5 = saque / 5;
                    saque = saque % 5;
                }
            } else {
                System.out.println("Somento valores multiplos de 5");
            }
        }

        System.out.println(
                "Cédulas de 100: " + notas100);
        System.out.println(
                "Cédulas de 50: " + notas50);
        System.out.println(
                "Cédulas de 20: " + notas20);
        System.out.println(
                "Cédulas de 10: " + notas10);
        System.out.println(
                "Cédulas de 5: " + notas5);
    }

}
