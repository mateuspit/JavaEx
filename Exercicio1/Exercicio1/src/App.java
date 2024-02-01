//O que é esse número?
//Faça um algoritmo para receber um número qualquer 
//e imprimir na tela se o número é par ou ímpar, positivo ou negativo.

import java.util.logging.Logger;
import java.io.Console;

public class App {
    private static final Logger logger = Logger.getLogger(App.class.getName());

    class Questions {
        private Questions() {
        }

        static Console console = System.console();

        public static double askAnyNumber() {
            if (console != null) {
                String userInput;
                userInput = console.readLine("Entre com um número inteiro qualquer: ");
                try {
                    double number = Double.parseDouble(userInput);

                    if ((number != (int) number)) {
                        console.writer().print("\033[H\033[2J");
                        console.flush();
                        Answers.notAnInteger();
                        return askAnyNumber();
                    }

                    return number;
                } catch (NumberFormatException e) {
                    console.writer().print("\033[H\033[2J");
                    console.flush();
                    Answers.notANumber();
                    return askAnyNumber();
                }
            } else {
                return Double.NaN;
            }
        }
    }

    class Answers {
        private Answers() {
        }

        public static void isEven() {
            logger.info("O número é par");
        }

        public static void isOdd() {
            logger.info("O número é ímpar");
        }

        public static void notANumber() {
            logger.info("Entre novamente com um número inteiro");
        }

        public static void notAnInteger() {
            logger.info("O número deve ser inteiro");
        }
    }

    class IsEvenOrOdd {
        private IsEvenOrOdd() {
        }

        public static void isEvenOrOdd(double number) {
            if (number % 2 == 0) {
                Answers.isEven();
            } else {
                Answers.isOdd();
            }
        }
    }

    public static void main(String[] args) {
        double number = Questions.askAnyNumber();
        IsEvenOrOdd.isEvenOrOdd(number);
    }
}
