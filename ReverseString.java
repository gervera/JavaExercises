
package ReverseLettersInString;
import java.lang.StringBuilder;

public class ReverseString {

  
    public static void main(String[] args) {
        String str = "5J%.A3$%b13n-Ks";

        StringBuilder st =  new StringBuilder("");
        for(int i=0;i<str.length();i++){
            char caracter = str.toUpperCase().charAt(i);
            if(isLetter(caracter)){
                st.append(str.charAt(i));
            }
        }
        int letras = st.length()-1;
        String nuevoString = "";
        
        for(int i=0;i<str.length();i++){
            char caracter = str.toUpperCase().charAt(i);
            if(isLetter(caracter)){
                nuevoString=nuevoString + st.charAt(letras);
                letras--;
            }else{
                nuevoString= nuevoString + str.charAt(i);
            }
        } 
        System.out.println("Letras: "+ st);
        System.out.println("String Inicial: " + str);
        System.out.println("String Final:   " + nuevoString);

    }
    
    public static boolean isLetter(char c){
        if(c < 65 || c > 90){
            return false;
        }
        return true;
    }
    
}
