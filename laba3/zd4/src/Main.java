//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    String text = "One two three раз два три one1 two2 123 ";
    String[] words = text.trim().split("\\s+");
    int latinWordCount = 0;
    System.out.println("Слова, содержащие только латинские буквы:");
    for (String word : words) {
        if (word.matches("^[a-zA-Z]+$")) {
            System.out.println(word);
            latinWordCount++;
        }
    }

    System.out.println("\nКоличество слов, содержащих только латинские буквы: " + latinWordCount);
}

