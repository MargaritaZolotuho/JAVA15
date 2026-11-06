//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Выберите номер задания (1, 2) Выход -0: ");
    int taskChoice = scanner.nextInt();
    while (taskChoice != 0) {
        switch (taskChoice) {
            case 1: {
                int[] array = {14, 21, 0, 9, 88, 1, 8};
                int max = array[0];
                for (int i = 1; i < array.length; i++) {
                    if (array[i] > max) {
                        max = array[i];
                    }
                }
                System.out.println("Исходный массив: ");
                for(int i = 0; i < array.length; i++) {
                    System.out.print(array[i] + " ");
                }
                System.out.println("\nМаксимальный элемент в массиве: " + max);
                break;
            }
            case 2: {
                int rows = 4;
                int cols = 4;
                int[][] matrix = new int[rows][cols];
                Random random = new Random();
                System.out.println("Матрица:");
                for (int i = 0; i < matrix.length; i++) {
                    for (int j = 0; j < matrix[i].length; j++) {
                        matrix[i][j] = random.nextInt(-30,30 + 1);
                        System.out.print(" "+ matrix[i][j]);
                    }
                    System.out.println();
                }

                System.out.println("Минимальные элементы в каждой строке:");
                for (int i = 0; i < matrix.length; i++) {
                    int minInRow = matrix[i][0];
                    for (int j = 1; j < matrix[i].length; j++) {
                        if (matrix[i][j] < minInRow) {
                            minInRow = matrix[i][j];
                        }
                    }
                    System.out.println("Строка " + i + ": " + minInRow);
                }
                break;
            }
            default:
                System.out.println("Неверный выбор!");
                break;
        }
        System.out.println("Выберите номер задания (1, 2) или 0 для выхода:");
        taskChoice = scanner.nextInt();
    }
    scanner.close();
}
