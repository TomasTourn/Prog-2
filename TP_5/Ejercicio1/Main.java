package TP_5.Ejercicio1;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        /*Pila de elementos
        * crear un arreglo de objetos e implementar metodos:
        * 1.top()--obtener el ultimo elemento
        * 2.pop()--obtener el ultimo elemento y borrarlo
        * 3.push(Object o)--agregar objeto en el ultimo lugar
        * 4.size()--retornar tamaño del arreglo
        * 5.copy()--copiar el arreglo
        * 6.reverse()--copiar el arreglo en reversa*/


        int a=1;
        int b=2;
        int c=3;






        Pila<Integer> p1= new Pila<>();
        p1.push(a);
        p1.push(b);
        p1.push(c);

        //p1.pop();

        System.out.println("p1");
        System.out.println("ultimo elemento: "+p1.top());
        System.out.println("tamaño: "+p1.size());

        System.out.println("-------------");
        System.out.println("copia");
        Pila<Integer> copia= p1.copy();

        System.out.println("ultimo elemento: "+copia.top());

        System.out.println("-------------");
        System.out.println("copia inversa");
        Pila<Integer> copiaInversa= p1.reverse();

        System.out.println("ultimo elemento: "+copiaInversa.top());

    }
}
