
package Pertemuan4;

import java.util.Scanner;
public class nomor1kalkulator {
    public static void main(String[] args) {
        System.out.println("KALKULATOR");
        String kalkulator;
        Scanner input = new Scanner (System.in);
        float a,b, hasil;
        System.out.print("nlai a = ");
        a = input.nextFloat();
        System.out.print("operasi (+/-/*/ //% ) = ");
        kalkulator = input.next();
        System.out.print("nilai b = ");
        b = input.nextFloat();
     switch (kalkulator) {
         case "+":
             hasil = a + b;
             System.out.print("Hasil = " + hasil);
             break;
         case "-":
             hasil = a - b;
             System.out.print("Hasil = " + hasil);
             break;
         case "*":
             hasil = a * b;
             System.out.print("Hasil = " + hasil);
             break; 
         case "/":
             hasil = a / b;
             System.out.print("Hasil = " + hasil);
             break;
         case "%":
             hasil = a % b;
             System.out.print("Hasil = " + hasil);
             break;    
         default:
             System.out.println("operasi" + kalkulator + "tidak ditemukan" );        
     }  
    }
    
}
