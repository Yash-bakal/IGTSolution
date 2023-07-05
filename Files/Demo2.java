import java.util.*;
import java.io.*;
class Demo2 {

 

    public static void main(String[] args) {

        String line = null;


        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

 

            System.out.println("Enter file name: ");
            String name = br.readLine();

 

            File f = new File(name);

 

            if(f.exists()) {
                BufferedReader fr = new BufferedReader(new FileReader(name));
                while((line = fr.readLine()) != null) {
                    System.out.println(line);
                }
            }
            else {
                System.out.println("Sorry, File not found....!");
            }
        } 
        catch(Exception e) {
            System.out.println(e);
        }
    }
}