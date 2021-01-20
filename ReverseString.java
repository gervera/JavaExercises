
package ReverseLettersInString;
import java.lang.StringBuilder;

public class ReverseString {

  
    public static void main(String[] args) {
        String str = "5J%.A3$%b13n-Ks";
        System.out.println("String Inicial: " + str);
        str = reverseString(str);
        System.out.println("String Final:   " + str);
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
        String nuevoString = "";
        
        for(int i=0;i<string.length();i++){
            char caracter = string.toUpperCase().charAt(i);
            if(isLetter(caracter)){
                nuevoString=nuevoString + st.charAt(letras);
                letras--;
            }else{
                nuevoString= nuevoString + string.charAt(i);
            }
        } 
        return nuevoString;
    }
    
    public static boolean isLetter(char c){
        if(c < 65 || c > 90){
            return false;
        }
        return true;
    }
    
}
