import java.util.ArrayList;
import java.util.Scanner;

public class Nomor2 {

  static int totalHampers(int hampers){
    ArrayList<Integer> jumlahHampers = new ArrayList<>();
    jumlahHampers.add(hampers);
    int jumlah = jumlahHampers.size()+1;
    
    // for(int i = 0; i <= jumlahHampers.size();i++){
    //   jumlah+= i;
    // }
    return jumlah;
  }
  

  static double biaya(int hampers, int packing){
    ArrayList <Double> Biaya = new ArrayList<>();
    double keseluruhan = 0;
    double total=0;
    if (hampers == 1) {
      hampers = 150000;
    } else if (hampers == 2){
      hampers = 175000;
    } else if (hampers == 3) {
      hampers = 200000;
    }

    if (packing == 1) {
      packing = 50000;
    }else if (packing == 2) {
      packing = 75000;
    }else if (packing == 3) {
      packing = 125000;
    }
    double hasil = hampers + packing;
    keseluruhan += hasil;

    Biaya.add(keseluruhan);
    for (int i = 0; i < Biaya.size();i++){
      keseluruhan += Biaya.get(i);
    }
    return keseluruhan;
  }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int hampers = input.nextInt();
        int packing = input.nextInt();
        /* Pekerjaan anda mulai dari sini */
        while (true) {
          totalHampers(hampers);
          biaya(hampers, packing);
          String ulang = input.next();
          
          if (ulang.equalsIgnoreCase("N")) {
            break;
          }
        }

        System.out.println("Total hamper yang dipesan ="+totalHampers(hampers));
        System.out.println("Total yang harus dibayar = " + biaya(hampers, packing));

        /* Pekerjaan anda berakhir sini */

        System.out.println(Nomor2.class.getDeclaredMethods().length); 
    }
}
