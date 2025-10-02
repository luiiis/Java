package Fundamentos_a_Java;
/*
 * Relacionales

Comparan valores y devuelven true o false.
 */
public class OperadoresRelacionales {
    public static void main(String[] args) {
        int x = 10, y = 20;
        
        System.out.println(x == y); // false
        System.out.println(x != y); // true
        System.out.println(x > y);  // false
        System.out.println(x < y);  // true
        System.out.println(x >= 10); // true
        System.out.println(y <= 15); // false
    }
}
