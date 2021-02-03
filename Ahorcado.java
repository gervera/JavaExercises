
package ahorcado;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ahorcado {

    public static void main(String[] args) {
        String palabra;
        do{
            System.out.println(" Ingresa una palabra: ");
            palabra = Read.readLine(); 
        }while(validarPalabra(palabra)); 
        
        System.out.println("Trata de adivinar la palabra, Solo puedes ingresar 1 letra a la  vez: ");
        StringBuilder palabraAdivinar = new StringBuilder(palabra);
        char letra;
        do{
            System.out.println(" Ingresa una letra: ");
            letra = Read.readChar();
            palabraAdivinar = palabraAdivinarContiene(palabraAdivinar,letra);   
        }while(palabraAdivinar.length()!=0);
        
        System.out.println("\nFelicidades!!, lograste adivinar la palabra: "+palabra + "\n");
        
    }

    private static boolean validarPalabra(String palabra) {
        for(int i =0;i<palabra.length();i++){
            if(!isLetter(palabra.toUpperCase().charAt(i))){
                return true;
            }
        }
        return false;
    }
    
    public static boolean isLetter(char c){
           if(c < 65 || c > 90 ){
               return false;
           }
           return true;
       }

    private static StringBuilder palabraAdivinarContiene(StringBuilder palabra,char letra) {
        int position;
        for(int i=0;i<palabra.length();i++){
            if(palabra.charAt(i) == letra){
                System.out.println("La palabra oculta contenia la letra ingresada: " +letra );
                palabra.deleteCharAt(i);
                return palabra;
            }
        }
        return palabra;
    }
}
