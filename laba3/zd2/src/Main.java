//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Введите строку: ");
    String str1 = scanner.nextLine();
    System.out.println("\"" + str1 + "\" — палиндром? " + isPalindrome(str1));
}

public static boolean isPalindrome(String input) {
    if (input == null) return false;
    String cleaned = input.replaceAll("\\s+", "").toLowerCase();
    String reversed = new StringBuilder(cleaned).reverse().toString();
    return cleaned.equals(reversed);
    }

