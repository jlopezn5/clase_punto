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
public class Punto {
    private int x;
     private int y;

    public Punto() {
        int x = 0;
        int y = 0;
    }

     
     
    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    
    public void desplaza(int x, int y){
        this.x = this.x - x;
        this.y = this.y - y;
    }

    @Override
    public String toString() {
        return "Punto{" + "x=" + x + ", y=" + y + '}';
    }
    
     
}
