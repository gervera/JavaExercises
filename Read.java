

package ReverseLettersInString;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Read {
    
    String readLine(){
        String str = "";
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try{
            str = br.readLine();
        }catch(IOException e){
            System.out.println("Wrong Input.");
        }
        return str;
    }
    
    int readInt(){
        boolean b;
        int num = 0;
        
        do{
            try{
                num = Integer.parseInt(readLine());
                b = true;
            }catch(Exception e){
                System.out.println("Wrong Input, put in a valid input.");
                b = false;
            }
        }while(!b);
        
        return num;
    }
    
    double readDouble(){
        boolean b;
        double num = 0;
        
        do{
            try{
                num = Double.parseDouble(readLine());
                b = true;
            }catch(Exception e){
                System.out.println("Wrong Input, put in a valid input.");
                b = false;
            }
        }while(!b);
        
        return num;
    }
    
    float readFloat(){
        boolean b;
        float num = 0;
        
        do{
            try{
                num = Float.parseFloat(readLine());
                b = true;
            }catch(Exception e){
                System.out.println("Wrong Input, put in a valid input.");
                b = false;
            }
        }while(!b);
        
        return num;
    }

}
