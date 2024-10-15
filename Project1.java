import java.util.Scanner;

public class Project1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean running = true;
        while (running) {

            System.out.println("Witaj w moim programie");
            System.out.println("Wybierz z czego chcesz skorzystać wybierając odpowiednio z opcji:");
            System.out.println("[1] Kalkulator");
            System.out.println("[2] Sprawdzanie parzystości liczb");
            System.out.println("[0] Zamknij program");

            int inputNumber1 = scanner.nextInt();

            if (inputNumber1 == 1) {
                boolean running1 = true;
                while (running1) {
                    System.out.println("Uruchomiłeś program: Kalkulator");
                    System.out.println("Co chcesz wykonać?");
                    System.out.println("[1] Dodawanie");
                    System.out.println("[2] Odejmowanie");
                    System.out.println("[3] Mnożenie");
                    System.out.println("[4] Dzielenie");
                    System.out.println("[0] Wyjdź z kalkulatora");

                    int inputNumber2 = scanner.nextInt();

                    switch (inputNumber2) {
                        case 1:
                            System.out.println("Wprowadź pierwszą wartość:");
                            int value1 = scanner.nextInt();
                            System.out.println("Wprowadź drugą wartość:");
                            int value2 = scanner.nextInt();
                            System.out.println("Suma liczb wynosi: " + (value1 + value2));
                            break;

                        case 2:
                            System.out.println("Wprowadź pierwszą wartość:");
                            value1 = scanner.nextInt();
                            System.out.println("Wprowadź drugą wartość:");
                            value2 = scanner.nextInt();
                            System.out.println("Różnica liczb wynosi: " + (value1 - value2));
                            break;

                        case 3:
                            System.out.println("Wprowadź pierwszą wartość:");
                            value1 = scanner.nextInt();
                            System.out.println("Wprowadź drugą wartość:");
                            value2 = scanner.nextInt();
                            System.out.println("Iloczyn liczb wynosi: " + (value1 * value2));
                            break;

                        case 4:
                            System.out.println("Wprowadź pierwszą wartość:");
                            value1 = scanner.nextInt();
                            System.out.println("Wprowadź drugą wartość:");
                            value2 = scanner.nextInt();
                            if (value2 != 0) {
                                System.out.println("Wynik dzielenia wynosi: " + (value1 / (double) value2));
                            } else {
                                System.out.println("Nie można dzielić przez zero!");
                            }
                            break;

                        case 0:
                            running1 = false;
                            break;

                        default:
                            System.out.println("Nieznana opcja. Spróbuj ponownie.");
                            break;
                    }
                }
            }

            if (inputNumber1 == 2) {
                System.out.println("Uruchomiłeś program: Sprawdzanie parzystości liczb");

                boolean running2 = true;
                while (running2) {
                    System.out.println("Wybierz działanie, które chcesz wykonać:");
                    System.out.println("[1] Sprawdzanie");
                    System.out.println("[0] Powrót do menu");
                    int inputNumber3 = scanner.nextInt();
                    switch (inputNumber3) {
                        case 1:
                            System.out.print("Wprowadź liczbę: ");
                            int value1_1 = scanner.nextInt();
                            if (value1_1 % 2 == 0) {
                                System.out.println("Wprowadzona liczba jest parzysta");
                            } else {
                                System.out.println("Wprowadzona liczba jest nieparzysta");
                            }
                            break;

                        case 0:
                            running2 = false;
                            break;

                        default:
                            System.out.println("Nieznana opcja. Spróbuj ponownie.");
                            break;
                    }
                }

            }

            if (inputNumber1 == 0) {
                running = false;
                break;
            }
        }
    }
}