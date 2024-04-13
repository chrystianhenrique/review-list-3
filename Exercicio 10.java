public class SomaNumerosPares {
    public static void main(String[] args) {
        int soma = 0;
        
        System.out.println("Números pares de 1 a 100:");
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
                soma += i;
            }
        }
        
        System.out.println("\n\nA soma dos números pares de 1 a 100 é: " + soma);
    }
}