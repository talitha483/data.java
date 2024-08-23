import java.util.Scanner;

public class KaryawanTester {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("inputkan nama karyawan:");
        String nama = input.nextLine();
        System.out.println("inputkan unit:");
        String unit = input.nextLine();
        System.out.println("inputkan alamat:");
        String alamat = input.nextLine();
        System.out.println("inputkan id karyawan:");
        int id = input.nextInt();
        karyawan nimas = new karyawan(id, nama, unit, alamat);
        nimas.print();
        // object
        // Class object = new constructor
        karyawan tia = new karyawan(123, "tia", "tu", "malang");
        karyawan alex = new karyawan(87, "alex", "kurikulum", "surabaya");
        karyawan rudi = new karyawan(9, "rudi", "kesiswaan", "jember");
        karyawan suna = new karyawan(7, "suna", "bk", "mojokerto");
        karyawan yasmin = new karyawan(9, "yasmin", "sapras", "sidoarejo");
        karyawan sunarto = new karyawan(9, "sunarto", "sapras", "jombang");

        tia.print();
        alex.print();
        rudi.print();
        suna.print();
        yasmin.print();
        input.close();

    }
}
