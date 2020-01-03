/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadorthis;

/**
 *
 * @author Walter Gdmz
 */
class CalculoMatematico{
        //atributos de la clase
        int a;
        int b;
        //Constructor Vacio
        CalculoMatematico(){
        }
        //constructor no vacio
        //El operador this hace referencia que a y b son atributos de la clase
        //ambiguedad los argumentos del metodo pueden ser nombrados igual a y b sin generar un error
        CalculoMatematico(int a, int b){
            this.a = a;
            this.b = b;
        }
        
        int sumar(){
            return a+b;
        }
}
public class OperadorThis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CalculoMatematico obj2 = new CalculoMatematico(8,8);
        
        int resultado = obj2.sumar();
        System.out.println("El resultado es: "+resultado);
    }
    
}
