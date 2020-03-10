/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasepuntorectangulo;

/**
 *
 * @author alumno
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Punto p1 = new Punto(5, 5);
        Punto p2 = new Punto(15, 20);
         p1.desplaza(5, 0);
        p2.desplaza(0, 3);
         Rectangulo r1 = new Rectangulo(p1, p2);
         r1.dibuja();
         System.out.println(r1.area());
         
        
    }
    
}
