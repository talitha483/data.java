package persewaan;

import java.util.Scanner;

public class tester {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("mau membuat berapa objek");
        int jumlah = in.nextInt();
        try{

        }catch (Exception e) {
            System.out.println("tipe data salah.");
        }

        System.out.println("pilih cd atau dvd");
        String pilihan = in.next();


        if(pilihan.equals("cd")){
            cd c = new cd();
            c.print();
        }else if (pilihan.equals("dvd")){
            dvd c = new dvd();
            c.print();
        }else {
            System.out.println("input salah. ");
        }

        //array object
        product[] produk = new product[10];
        cd[] c = new cd [5];
        dvd[] d = new dvd [5];
        produk[0]=new product();
        produk[0].print();
        c[4]=new cd (1,"friend",12,200,"bruno mars",5,"sony music");
        c[4].print();
        produk[1]=new product(1,"table",2,20.5);
        produk[1].print();
        d[2]=new dvd (2,"friend",14,300,2,"keren","sepersen");
        d[2].print();
        produk[2]=new product(2,"friend",32,393939);
        produk[2].print();

    }
    
}
