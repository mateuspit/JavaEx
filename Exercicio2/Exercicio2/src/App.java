//Dado um número inteiro x, imprima uma sequência de Fibonacci de tamanho x.

import java.util.logging.Logger;
import java.io.Console;
import java.util.ArrayList;
import java.util.List;

public class App {
    private static final Logger logger = Logger.getLogger(App.class.getName());

    class Questions {
        private Questions() {
        }

        static Console console = System.console();

        public static double askManyFibonacciNumbers() {
            if (console != null) {
                String userInput;
                console.writer().print("\033[H\033[2J");
                console.flush();
                userInput = console
                        .readLine("Quantos números da sequencia de Fibonacci em ordem crescente você quer? ");
                try {
                    double number = Double.parseDouble(userInput);

                    if ((number != (int) number)) {
                        console.writer().print("\033[H\033[2J");
                        console.flush();
                        Answers.notAnInteger();
                        return askManyFibonacciNumbers();
                    }

                    return number;
                } catch (NumberFormatException e) {
                    console.writer().print("\033[H\033[2J");
                    console.flush();
                    Answers.notANumber();
                    return askManyFibonacciNumbers();
                }
            } else {
                return Double.NaN;
            }
        }
    }

    class Answers {
        private Answers() {
        }

        public static void notANumber() {
            logger.info("Entre novamente com um número inteiro");
        }

        public static void notAnInteger() {
            logger.info("O número deve ser inteiro");
        }
    }

    class FibonacciNumbers {
        private FibonacciNumbers() {
        }

        public static List<Integer> ascOrder(double number) {
            int howManyNumbers = (int) number;
            int lastNumber = 1;
            int penultimateNumber = 0;
            List<Integer> fibonacci = new ArrayList<>();

            for (int i = 0; i < howManyNumbers; i++) {
                if (i == 0) {
                    fibonacci.add(penultimateNumber);
                } else if (i == 1) {
                    fibonacci.add(lastNumber);
                } else {
                    int newLastNumber = penultimateNumber + lastNumber;
                    penultimateNumber = lastNumber;
                    lastNumber = newLastNumber;
                    fibonacci.add(newLastNumber);
                }
            }

            logger.info("Sequencia de Fibonacci" + " de tamanho " + howManyNumbers + ": " + fibonacci);

            return fibonacci;
        }
    }

    public static void main(String[] args) {
        double number = Questions.askManyFibonacciNumbers();
        FibonacciNumbers.ascOrder(number);
    }
}
