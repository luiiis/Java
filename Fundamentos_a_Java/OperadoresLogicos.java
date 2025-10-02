package Fundamentos_a_Java;
/*
 * Lógicos

Se usan con valores boolean.
 */
public class OperadoresLogicos {
    public static void main(String[] args) {
        boolean esMayor = true;
        boolean tienePermiso = false;
        
        System.out.println(esMayor && tienePermiso); // false (AND)
        System.out.println(esMayor || tienePermiso); // true (OR)
        System.out.println(!esMayor); // false (NOT)
    }
}