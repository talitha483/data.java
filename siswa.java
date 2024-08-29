//object Class
public class siswa {
    int id;
    String nama;
    double ipk;

    //Constructor
    //nama harus sama dgn Class
    public siswa() {
        id = 0;
        nama = "kosong";
        ipk = 0.0;
    }  
    
    //constructor parameter
    public siswa(int id, String nama, double
    ipk) {
        //variable = parameter
        this.id = id;
        this.nama = nama;
        this.ipk = ipk;
    }

    //method print
    public void print() {
        System.out.println("id : " + id);
        System.out.println("nama : " + nama);
        System.out.println("ipk : " + ipk);
    }
        
    }

    
