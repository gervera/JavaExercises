
package ReverseLettersInString;
import java.lang.StringBuilder;
import java.util.Arrays;

public class ReverseString {

  
    public static void main(String[] args) {
        String str = "3Aa323# %&!a4 B%$ 4C2";
        System.out.println("String Inicial: " + str);
        str = reverseString(str);
        System.out.println("\nString Final:   " + str);
    }
    
    public static String reverseString(String string){
        
        StringBuilder st =  new StringBuilder("");
        for(int i=0;i<string.length();i++){
            char caracter = string.toUpperCase().charAt(i);
            if(isLetter(caracter)){
                st.append(string.charAt(i));
            }
        }
        int letras = st.length()-1;
        StringBuilder nuevoString = new StringBuilder("");
        System.out.print(st.toString()+ " => ");
        
        for(int i=0;i<string.length();i++){
            char caracter = string.toUpperCase().charAt(i);
            if(isLetter(caracter)){
                System.out.print(st.charAt(letras));
                nuevoString.append(st.charAt(letras));
                letras--;
            }else{
                nuevoString.append(string.charAt(i));
            }
        } 
        return nuevoString.toString();
    }
    
    public static boolean isLetter(char c){
        if(c < 65 || c > 90 ){
            return false;
        }
        return true;
    }
    
}
