import java.util.ArrayList;

public class F4T6_DaftarMenu {
        public static void main(String[] args) {
        int harga1= 10000;
        int harga2= 15000;
        int harga3= 8500;
        ArrayList<String> daftarmenu = new ArrayList<String>();
        daftarmenu.add("1. mie ayam tanpa bakso harga "+harga1);
        daftarmenu.add("2. mie ayam pakai bakso harga "+harga2);
        daftarmenu.add("3. bakso dengan kuah harga "+harga1);
        daftarmenu.add("4. bakso dengan bihun dan mie kuning harga "+harga2);
        daftarmenu.add("5. pangsit harga "+harga3);
        System.out.println("daftar menu: ");
        for (int i=0;i<daftarmenu.size();i++){
            System.out.println(daftarmenu.get(i));
        }
    }
}
