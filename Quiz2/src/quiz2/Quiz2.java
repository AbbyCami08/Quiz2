/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quiz2;

/**
 *
 * @author WChavarria
 */
public class Quiz2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Canciones
        Canciones cancion1 = new Canciones(1, "Here Comes The Sun", "The Beatles", "3:05", 1969);
        Canciones cancion2 = new Canciones(2, "Everybody Wants To Rule The World", "Tears to Tears", "4:11", 1985);
        
        //Mostrar la informacion de la primera cancion agregada
        System.out.println("Valores de la cancion 1");
        System.out.println("El titulo de la cancion es : " + cancion1.getTitulo());
        System.out.println("El autor de la cancion es: " + cancion1.getAutor());
        System.out.println("La duracion de esta cancion es de: " + cancion1.getDuracion());
        System.out.println("El año de creacion de esta cancion es: " + cancion1.getAnioCreacion());
        System.out.println();
        
        //Mostrar la informacion de la segunda cancion agregada
        System.out.println("Valores de la cancion 2");
        System.out.println("El titulo de la cancion es : " + cancion2.getTitulo());
        System.out.println("El autor de la cancion es: " + cancion2.getAutor());
        System.out.println("La duracion de esta cancion es de: " + cancion2.getDuracion());
        System.out.println("El año de creacion de esta cancion es: " + cancion2.getAnioCreacion());
        
        
        
        
    }
    
}
