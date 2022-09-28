package Constructor1;
import java.io.*;

public class MainClass {

    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        
        //object (instance of class)
        //karena ada 2 constructor maka dibuat 2 object
        //1. admin
        //2. akun baru
        Akun admin = new Akun();
        Akun akunBaru = new Akun("","");
        
        //variabel
        String username, password;
        
        //menu
        do{
            System.out.println("--- Login ---");
            System.out.println("1. Login Admin");
            System.out.println("2. Buat akun baru");
            System.out.println("3. Lihat akun");
            System.out.println("4. Ubah password");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu : ");
            int menu = Integer.parseInt(br.readLine());
            switch(menu){
                case 1:
                    System.out.println("--- Login Admin ---");
                    System.out.print("Masukan Username : ");
                    username = br.readLine();
                    System.out.print("Masukan Password : ");
                    password = br.readLine();
                    
                    //mencocokan username dan password 
                    if(username.equalsIgnoreCase(admin.getUsername()) && password.equals(admin.getPassword()))
                    {
                        System.out.println("Sukses");
                    }
                    else
                    {
                        System.err.println("Gagal");
                    }
                break;
                
                case 2:
                    System.out.println("--- Buat Akun ---");
//                    System.out.print("Masukan Username : ");
//                    username = br.readLine();
                    System.out.print("Masukan Password : ");
                    password = br.readLine();
                    
                    //memasukan variabel ke dalam constructor 
                    akunBaru = new Akun("", password);
                break;
                
                case 3:
                    System.out.println("--- Lihat Akun ---");
                    System.out.println("1. Admin");
                    System.out.println("Username : " + admin.getUsername());
                    System.out.println("Password : " + admin.getPassword());
                    System.out.println("");
                    System.out.println("2. Akun Baru");
                    System.out.println("Username : " + akunBaru.getUsername());
                    System.out.println("Password : " + akunBaru.getPassword());
                break;
                
                case 4:
                    System.out.println("--- Ubah Password ---");
                    //masukan pass lama 
                    System.out.print("Masukan Password Lama : ");
                    String passLama = br.readLine();
                    
                    //masukan pass baru
                        System.out.print("Masukan Password Baru : ");
                        password = br.readLine();
                    
                    //cocokan pass lama dengan data yg sdh ada
                    if(passLama.equals(akunBaru.getPassword()))
                    {
                    akunBaru.setPassword(password);
                    System.out.println("Sukses Rubah Password");
                    }
                    else{
                        System.err.println("Gagal");
                        password = "";
                    }
                break;
                
                case 5:
                    System.exit(0);
                break;
            }
        }while(true);
    }
    
}
