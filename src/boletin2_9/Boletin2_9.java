
package boletin2_9;

import java.util.Scanner;


public class Boletin2_9 {


    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int total,b100,b20,b5,m1;
        System.out.println("Teclea la cantidad total de euros :");
        total=sc.nextInt();
        b100=total/100;
        b20=total%100/20;
        b5=total%100%20/5;
        m1=total%100%20%5/1;
        System.out.println(b100+" billetes de 100€ "+b20+" billetes de 20€ "+b5+" billetes de 5€ "+m1+" monedas de 1€");
        

    }
    
}
