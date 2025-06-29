import java.util.Scanner;

public class palindromeChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma palavra ou frase para verificar se é um palíndromo:");
        String input = scanner.nextLine();

        if (isPalindrome(input)) {
            System.out.println("'" + input + "' é um palíndromo.");
        } else {
            System.out.println("'" + input + "' não é um palíndromo.");
        }

        scanner.close();
    }

    public static boolean isPalindrome(String text) {
        // 1. Converte a string para minúsculas para ignorar diferenças de maiúsculas/minúsculas
        // 2. Remove todos os caracteres que não são letras ou números (espaços, pontuações, etc.)
        String cleanText = text.toLowerCase().replaceAll("[^a-z0-9]", "");

        // Converte a string limpa em um array de caracteres
        char[] charArray = cleanText.toCharArray();

        // Inicializa dois ponteiros: um no início e outro no final da string
        int left = 0;
        int right = charArray.length - 1;

        // Itera enquanto o ponteiro da esquerda for menor que o ponteiro da direita
        while (left < right) {
            // Se os caracteres nos ponteiros esquerdo e direito forem diferentes, não é um palíndromo
            if (charArray[left] != charArray[right]) {
                return false;
            }
            // Move os ponteiros para o centro
            left++;
            right--;
        }

        // Se o loop for concluído, significa que todos os caracteres correspondiam, então é um palíndromo
        return true;
    }
}
