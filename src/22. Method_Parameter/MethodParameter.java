public class MethodParameter {
    public static void main(String[] args) {
        panggiNama("Audyari W", "Pondok Gede");
        System.out.println(hasilPanggil());

    }

    static void panggiNama(String Nama, String Alamat) {
        System.out.println("Hai Nama kamu = " + Nama + " Kamu Tinggal di " + Alamat);
    }

    static String hasilPanggil() {
        return "Hasil nya string";
    }

    
    
}
