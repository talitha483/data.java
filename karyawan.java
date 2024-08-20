 //object Class
public class karyawan {
    int id;
    String nama;
    String unit;
    String alamat;
    
    //constructor parameter
    public karyawan(int id, String nama, String unit,
    String alamat) {
        //variable = parameter
        this.id = id;
        this.nama = nama;
        this.unit = unit;
        this.alamat = alamat;
    }

    
    //method print
    public void print() {
        System.out.println("id : " + id);
        System.out.println("nama : " + nama);
        System.out.println("unit : " + unit);
        System.out.println("alamat : " + alamat);
    }

    

    
}
