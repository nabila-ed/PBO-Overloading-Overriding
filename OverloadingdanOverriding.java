//Parent class
class User {

    // 🔹 OVERLOADING (banyak cara login)
    
    // login pakai username & password
    void login(String username, String password) {
        System.out.println("Login dengan Username: " + username);
    }

    // login pakai email & password
    void login(String email, String password, boolean isEmail) {
        System.out.println("Login dengan Email: " + email);
    }

    // login pakai PIN
    void login(int pin) {
        System.out.println("Login dengan PIN: " + pin);
    }

    // 🔹 METHOD YANG AKAN DI-OVERRIDE
    void akses() {
        System.out.println("Akses sebagai USER biasa");
    }
}

// Child class Admin
class Admin extends User {

    // 🔹 OVERRIDING
    @Override
    void akses() {
        System.out.println("Akses sebagai ADMIN (full akses)");
    }
}

// Child class Guest
class Guest extends User {

    // 🔹 OVERRIDING
    @Override
    void akses() {
        System.out.println("Akses sebagai GUEST (terbatas)");
    }
}

// Main class (WAJIB ADA)
public class OverloadingdanOverriding {
    public static void main(String[] args) {

        System.out.println("=== OVERLOADING (LOGIN) ===");

        User user = new User();

        // Overloading dipakai
        user.login("nabila", "123");                 
        user.login("nabila@gmail.com", "123", true); 
        user.login(4567);                            


        System.out.println("\n=== OVERRIDING (AKSES) ===");

        User u1 = new Admin();
        User u2 = new Guest();
        User u3 = new User();

        // Overriding dipakai
        u1.akses(); // Admin
        u2.akses(); // Guest
        u3.akses(); // User biasa
    }
}
