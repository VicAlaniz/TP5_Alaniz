/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp5;

/**
 *
 * @author Administrador
 */
public class Arreglo {
    
    public static void sumarLista(int[] arregloSuma) {
        int suma=0;
        float cantidad=0;
        double prom;
        
        for (int i = 0; i < arregloSuma.length; i++) {
            suma += arregloSuma[i];
            cantidad++;
        }
        prom=suma/cantidad;
        System.out.println("La suma es:"+suma);
        System.out.println("El promedio es: " + prom);

    }

    
    public static void buscarMayor(int [][] buscador) {
        int mayor=0;
        
        for (int i=0; i<buscador.length; i++) {
            for (int j=0; j<buscador.length; j++) {
                if (buscador[i][j] > mayor) {
                    mayor = buscador[i][j];     
                }
            }
        }
        System.out.println("El numero mayor es: "+mayor);
    }
    public static void cuentaVocales(String vocales) {
        int cantVocal=0;
        
        for (int i=0; i<vocales.length();i++) {
            
            if ((vocales.charAt(i)=='a') || (vocales.charAt(i)=='e') 
                || (vocales.charAt(i)=='i') || (vocales.charAt(i)=='o') || (vocales.charAt(i)=='u')){
                cantVocal++;   
            }
        }
        System.out.println("La cantidad de vocales es: " + cantVocal);
    }
    public static void cuentaCaracter(String cadena, char caract) {
       
        int contador=0;
        
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i)== caract){
                contador++;
            }
        }
        System.out.println("El caracter "+caract+" se repite "+contador+" veces"); 
    }
}
    

    

