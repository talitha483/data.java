package penjualan.ukl;

public class methodsmenghitung {

    public static void main(String[] args) {
        int a = 5; 
        int b = 8;
        System.out.println("hasil penjumlahan: "+jumlah(a,b));
        System.out.println("hsil pengurangan: "+kurang(a,b));
        System.out.println("hasil perkalian: "+kali(a,b));
        System.out.println("hasil pembagian: "+bagi(a,b));
    }
     
    public static int jumlah (int x,int y){
        return x+y;
    }
    public static int kurang (int x,int y){
        return x-y;
    }
    public static int kali (int x,int y){
        return x*y;
    }
    public static double bagi (int x,int y){
        return x/y;
    }
}
