package persewaan;

public class dvdtugas {
    public static void main(String[] args) {
        product[] produk = new product[10];
        dvd[] d = new dvd [5];
        produk[0]=new product();
        produk[0].print();
        d[3]=new dvd(2,"friend",9,67,66,"keren","erpel");
        d[3].print();
        produk[4]=new product(2,"friend",23,3);
        produk[4].print();  
    }




    
}


