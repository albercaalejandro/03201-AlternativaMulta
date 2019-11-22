/* 
 * Copyright 2019 Alejandro Alberca - alejandro.alberca.alum@iescamp.es.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.main;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Alejandro Alberca - alejandro.alberca.alum@iescamp.es
 */
public class Main {

    public static final Scanner SCN = new Scanner(System.in, "ISO-8859-1");

    public static void main(String[] args) {
        final int MULTA = 60;
        final int DIAS = 30;
        final double DESCUENTO = 0.2;
        final double D_REAL = 20;

        double pDescuento = MULTA * DESCUENTO;
        double cDescuento = MULTA - pDescuento;
        double noDescuento= 0;
        try {
            System.out.println("Alternativa Multa");
            System.out.println("=================");
            
            System.out.print("Días de demora ...........: ");            
            int fMulta = SCN.nextInt();
            System.out.println("---");
            
            System.out.printf(Locale.ENGLISH, "Importe inicial multa .....: %d €%n", MULTA);            System.out.println("---");
            System.out.printf("Plazo con descuento ......: %d días %n",DIAS);
            System.out.println("Tanto descuento ..........: "+D_REAL+" %");
            if (fMulta < 30) {
                System.out.printf("Importe descuento ........: %.02f € %n",pDescuento);
                System.out.println("---");
                System.out.printf("Importe final multa ......: %.0f € %n", cDescuento);
            } else {
                System.out.printf("Importe descuento ........: %.02f € %n",noDescuento);
                System.out.println("---");
                System.out.printf("Importe final multa ......: %d.00 € %n", MULTA);

            }
        } catch (Exception e) {
            System.out.println("ERROR: Entrada incorrecta");
        } finally {

            SCN.nextLine();
        }

    }
}
