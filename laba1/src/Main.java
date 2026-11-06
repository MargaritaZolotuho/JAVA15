//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Выберите номер задания (1, 2, 3) Выход -0: ");
    int taskChoice = scanner.nextInt();
    while (taskChoice != 0) {
        switch (taskChoice) {
            case 1: {
                System.out.println("Частное двухх чисел");
                System.out.print("Введите первое число: ");
                double first = scanner.nextDouble();
                System.out.print("Введите второе число: ");
                double second = scanner.nextDouble();
                if (second != 0) {
                    double result = first / second;
                    System.out.println("Частное: " + result);
                } else {
                    System.out.println("Второе число не должно быть нулем");
                }
                break;
            }
            case 2: {
                System.out.println("Большее из трех чисел");
                System.out.print("Введите первое число: ");
                double a = scanner.nextDouble();
                System.out.print("Введите второе число: ");
                double b = scanner.nextDouble();
                System.out.print("Введите третье число: ");
                double c = scanner.nextDouble();
                double max = a;
                if (b > max) {
                    max = b;
                }
                if (c > max) {
                    max = c;
                }
                System.out.println("Наибольшее число: " + max);
                break;
            }
            case 3: {
                System.out.println("Произведение от 1 до N");
                System.out.print("Введите число N: ");
                int n = scanner.nextInt();
                long pervyi = 1;
                int incr = 1;
                while (incr <= n){
                    pervyi=incr*pervyi;
                    incr++;
                }
                System.out.println("Результат: " + pervyi);
                break;
            }
            default:
                System.out.println("Неверный выбор!");
                break;
        }
        System.out.println("Выберите номер задания (1, 2, 3) или 0 для выхода:");
        taskChoice = scanner.nextInt();
    }
        scanner.close();
}


