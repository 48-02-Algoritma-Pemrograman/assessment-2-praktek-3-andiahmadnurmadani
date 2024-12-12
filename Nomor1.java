import java.util.Scanner;

public class Nomor1 {
  static Scanner input = new Scanner(System.in);

  static double luas(int alas, int tinggi){
    double hasil = (alas * tinggi) / 2;
    return hasil;
  }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        /* Pekerjaan anda mulai dari sini */
        int tinggi = input.nextInt();
        System.out.println(luas(N, tinggi));
        /* Pekerjaan anda berakhir sini */

        System.out.println(Nomor1.class.getDeclaredMethods().length); 
    }
    
}
