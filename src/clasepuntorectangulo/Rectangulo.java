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
public class Rectangulo {
    private Punto si;
    private Punto id;

    public Rectangulo () {
        this.si =  new Punto(0, 0);
        this.id = new Punto(10, 10);
    }
    
    public Rectangulo(Punto si, Punto id){
        this.si=si;
        this.id=id;
          
    }
    
    public void dibuja(){
    int ejex=    si.getX() - id.getX();
    int ejey = si.getX() - id.getY();
    /*    System.out.println(ejex);
        System.out.println(ejey);*/
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j > ejex; j--) {
                System.out.print("*");
                
            }
            System.out.println("");
            for (int j = 0; j > ejey; j--) {
                System.out.print("*");
                
            }
            System.out.println("");
        }
        
        
    }
     
    public int area(){
           int ejex=    si.getX() - id.getX();
    int ejey = si.getX() - id.getY();
    int resultado = ejex*ejey;
    return resultado;
    }
    
    
    
}
