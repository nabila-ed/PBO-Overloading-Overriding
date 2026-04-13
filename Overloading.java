package overloading;
class BangunDatar {
    // luas persegi
    float luas(float sisi) {
        float hasil = sisi * sisi;
        System.out.println("Luas Persegi: " + hasil);
        return hasil;
    }
    // luas persegi panjang
    float luas(float panjang, float lebar) {
        float hasil = panjang * lebar;
        System.out.println("Luas Persegi Panjang: " + hasil);
        return hasil;
    }
    // luas lingkaran
    float luas(double r) {
        float hasil = (float)(3.14 * r * r);
        System.out.println("Luas Lingkaran: " + hasil);
        return hasil;
    }
}
public class Overloading {
    public static void main(String[] args) {
        BangunDatar bd = new BangunDatar();

        bd.luas(4);       // persegi
        bd.luas(6, 3);    // persegi panjang
        bd.luas(7.0);     // lingkaran
    }
}
