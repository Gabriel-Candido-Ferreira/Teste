import java.util.Scanner;

public class InverterString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a string");
        String input = scanner.nextLine();

        String invertedString = inverterString(input);

        System.out.println("String invertida: " + invertedString);

        scanner.close();
    }

    public static String inverterString(String str) {
        char[] chars = str.toCharArray();
        int inicio = 0;
        int fim = chars.length - 1;

        while (inicio < fim) {
            char temp = chars[inicio];
            chars[inicio] = chars[fim];
            chars[fim] = temp;
            inicio++;
            fim--;
        }
        return new String(chars);
    }
}
