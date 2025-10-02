package Fundamentos_a_Java;
/*
 * Aritméticos

Se usan para operaciones matemáticas.
 */
public class OperadoresAritmeticos {
    public static void main(String[] args) {
        int a = 10, b = 3;
        
        System.out.println("Suma: " + (a + b));  // 13
        System.out.println("Resta: " + (a - b)); // 7
        System.out.println("Multiplicación: " + (a * b)); // 30
        System.out.println("División: " + (a / b)); // 3 (solo parte entera)
        System.out.println("Módulo: " + (a % b)); // 1 (residuo de 10/3)
    }
}
