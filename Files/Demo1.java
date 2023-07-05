import java.io.BufferedReader;

import java.io.InputStreamReader;

 

public class Demo1 {

 

    public static void main(String[] args) {

        // TODO Auto-generated method stub

        try {

            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

            System.out.println("enter id: ");

            int id=Integer.parseInt(br.readLine());

            System.out.println("enter first name: ");

            String fname=br.readLine();

            System.out.println("enter last name: ");

            String lname=br.readLine();

            System.out.println(id);

            System.out.println(fname);

            System.out.println(lname);

        }

        catch(Exception e) {

            System.out.println(e);

        }

 

    }

 

}