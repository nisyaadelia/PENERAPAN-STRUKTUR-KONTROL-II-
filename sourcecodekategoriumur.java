
package Pertemuan4;
import java.util.Scanner;
public class nomor2kategoriumur {  
    public static void main(String[] args) {
       System.out.println("Ayo Cek Kategori Umur");
        Scanner input = new Scanner (System.in);
        int Umur;
        System.out.print("Masukkan Umur : ");
        Umur = input.nextInt();
        
        int kategoriumur;
        if (Umur >=0 && Umur <=5 ) kategoriumur = 1;
        else if (Umur >=6 && Umur <=12) kategoriumur = 2;
        else if (Umur >= 13 && Umur <= 17) kategoriumur = 3;
        else if (Umur >= 18 && Umur <= 59) kategoriumur = 4;
        else if (Umur >= 60) kategoriumur = 5;
        else kategoriumur = 0;
        
        switch (kategoriumur){
            case 1:
                System.out.println("Kategori Balita");
                break;
            case 2:
                System.out.println("Kategori Anak-Anak");
                break;
            case 3:
                System.out.println("Kategori Remaja");
                break;
            case 4:
                System.out.println("Kategori Dewasa");
                break;    
            case 5:
                System.out.println("Kategori Lansia");
                break;
            default:
                System.out.println("Umur tidak valid");
                    
        }
    }
    
}
