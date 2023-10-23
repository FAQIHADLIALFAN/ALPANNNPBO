import java.util.Scanner;

public class NilaiMhs {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Nama: ");
        String nama= input.nextLine();

        System.out.print("Masukkan NIM: ");
        Integer nim = input.nextInt();

        System.out.print("Masukkan Nilai Tubes Besar : ");
        double nilaiTugasBesar = input.nextDouble();

        System.out.print("Masukkan Nilai Quiz : ");
        double nilaiQuiz  = input.nextDouble();

        System.out.print("Masukkan Nilai Tugas : ");
        double nilaiTugas = input.nextDouble();

        System.out.print("Masukkan Nilai UTS : ");
        double nilaiUTS = input.nextDouble();

        System.out.print("Masukkan Nilai UAS : ");
        double nilaiUAS = input.nextDouble();

        Nilai Nilai = new Nilai();
        double nilaiAkhir = Nilai.nilaiAkhir(nilaiTugasBesar, nilaiQuiz, nilaiTugas, nilaiUTS, nilaiUAS);
        
        System.out.println("\nNama : " + nama);
        System.out.println("NIM : " + nim);
        System.out.println("Nilai  Matakuliah Pemograman Berorientasi Objek :" + nilaiAkhir);

        input.close();
    }   
}
