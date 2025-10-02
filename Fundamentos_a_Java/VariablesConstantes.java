package Fundamentos_a_Java;
/*
 * Variables y Constantes

Variable: almacena un valor que puede cambiar.

Constante (final): almacena un valor que no cambia.
 */
public class VariablesConstantes {
    public static void main(String[] args) {
        int edad = 25;                 // variable
        double precio = 99.99;         // variable
        final double PI = 3.1416;      // constante (no se puede modificar)
        
        edad = 30;  // ✔️ permitido
        // PI = 3.15; ❌ ERROR, porque es final
        System.out.println("Edad: " + edad);
        System.out.println("PI: " + PI);
    }
}
