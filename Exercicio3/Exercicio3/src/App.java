//Escreva um código que deve imprimir a tabela de multiplicação de algum número fornecido além de exibir um cabeçalho com o nome Tabela de multiplicação de X, onde X é o número a ser multiplicado.

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

        public static double askMultiplicationTableNumber() {
            String flushConsoleString = "\033[H\033[2J";

            if (console != null) {
                String userInput;
                console.writer().print(flushConsoleString);
                console.flush();
                userInput = console
                        .readLine("Você quer a tabuado de qual número? ");
                try {
                    double number = Double.parseDouble(userInput);

                    if ((number != (int) number)) {
                        console.writer().print(flushConsoleString);
                        console.flush();
                        Answers.notAnInteger();
                        return askMultiplicationTableNumber();
                    }

                    return number;
                } catch (NumberFormatException e) {
                    console.writer().print(flushConsoleString);
                    console.flush();
                    Answers.notANumber();
                    return askMultiplicationTableNumber();
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

    class MultiplicationTable {
        private MultiplicationTable() {
        }

        public static void multiplicationTable(double number) {
            int multiplicationTableNumber = (int) number;

            logger.info("Tabela de multiplicação de " + multiplicationTableNumber);

            for (int i = 0; i < 11; i++) {
                int multiplicationNumber = multiplicationTableNumber * i;
                logger.info(multiplicationTableNumber + " x " + i + " = " + multiplicationNumber);
            }
        }
    }

    public static void main(String[] args) {
        double number = Questions.askMultiplicationTableNumber();
        MultiplicationTable.multiplicationTable(number);
    }
}
