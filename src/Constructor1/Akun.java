
package Constructor1;

/**
 *
 * @author Stanley Giovanni
 */
public class Akun {
    //inisialisasi username & password
    private String username, password;
    
    //constructor non paramater (admin)
    public Akun(){
        //user admin sudah ditentukan username & password nya
        username = "admin";
        password = "admin";
    }
    
    //constructor paramater (akun baru)
    public Akun(String u, String p){
        u = "user";
        password = p;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
