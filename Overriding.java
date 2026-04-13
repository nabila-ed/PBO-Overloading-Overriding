package overriding;
//Parent Class
class BangunDatar {
    float luas() {
        System.out.println("Menghitung luas bangun datar");
        return 0;
    }
}
// Child Class Persegi
class Persegi extends BangunDatar {
    float sisi = 4;
    @Override
    float luas() {
        float hasil = sisi * sisi;
        System.out.println("Luas Persegi: " + hasil);
        return hasil;
    }
}
// Child Class Lingkaran
class Lingkaran extends BangunDatar {
    float r = 7;
    @Override
    float luas() {
        float hasil = 3.14f * r * r;
        System.out.println("Luas Lingkaran: " + hasil);
        return hasil;
    }
}
// Main Class
public class Overriding {
    public static void main(String[] args) {
        BangunDatar b1 = new Persegi();
        BangunDatar b2 = new Lingkaran();
        b1.luas();
        b2.luas();
    }
}