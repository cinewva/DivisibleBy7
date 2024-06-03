package com.itfactory;

import java.util.Scanner;

public class Problema6 {
    public static void main(String[] args) {

// Scrieți un program în care, folosind o bucla (stabiliti voi care) o sa cititi de la tastatură numere întregi până la intalnirea unui număr divizibil cu 7.
// while = este un loop
// while este o zona de cod care se repeta atat timp cat o conditie este true


        Scanner scanner = new Scanner(System.in);
        // introducem numarul special care este de verificat
        System.out.println("Introducem numarul ales: ");
        int numardivizibil = 7;
        numardivizibil = scanner.nextInt();
        while (numardivizibil % 7 >= 1) {
            System.out.println("nevizibil cu 7 (copiii de clasa a III-a stiu si tu ... tu esti tu.");
            numardivizibil = scanner.nextInt();
        } if (numardivizibil % 7 == 0 ){
            System.out.println("divizibil cu 7 !!!");

        }

    }
}