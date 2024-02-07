//Crie uma pirâmide de números, onde você deve imprimir em cada linha separada a quantidade de números que está sendo iterado no momento. 

import java.util.logging.Logger;
import java.io.Console;

public class App {
    private static final Logger logger = Logger.getLogger(App.class.getName());

    class Questions {
        private Questions() {
        }

        static Console console = System.console();

        public static double askSizePyramid() {
            String flushConsoleString = "\033[H\033[2J";
            String questionSizePyramid = "Quantas linhas terá sua piramede de número? ";

            if (console != null) {
                String userInput;
                userInput = console
                        .readLine(questionSizePyramid);
                try {
                    double number = Double.parseDouble(userInput);

                    if ((number != (int) number)) {
                        console.writer().print(flushConsoleString);
                        console.flush();
                        Answers.notAnInteger();
                        return askSizePyramid();
                    }

                    if (number <= 0) {
                        console.writer().print(flushConsoleString);
                        console.flush();
                        Answers.notGreaterThanZero();
                        return askSizePyramid();
                    }

                    return number;
                } catch (NumberFormatException e) {
                    console.writer().print(flushConsoleString);
                    console.flush();
                    Answers.notANumber();
                    return askSizePyramid();
                }
            } else {
                return Double.NaN;
            }
        }
    }

    class Answers {
        private Answers() {
        }

        static String numberMessage = "Entre novamente com um número inteiro";
        static String integerMessage = "O número deve ser inteiro";
        static String notZeroMessage = "O número deve ser maior que zero";

        public static void notANumber() {
            logger.info(numberMessage);
        }

        public static void notAnInteger() {
            logger.info(integerMessage);
        }

        public static void notGreaterThanZero() {
            logger.info(notZeroMessage);
        }
    }

    class PyramidBuilder {
        private PyramidBuilder() {
        }

        public static void buildPyramid(double number) {
            int pyramidSize = (int) number;

            logger.info("Sua piramide de número de tamanho: " + pyramidSize);

            for (int i = 0; i < pyramidSize; i++) {
                int printedNumber = i + 1;
                if (i == 0) {
                    System.out.println(printedNumber);
                } else {
                    System.out.print(printedNumber);
                }
                for (int j = 0; j < i; j++) {
                    if (j == (i - 1)) {
                        System.out.println(printedNumber);
                    } else {
                        System.out.print(printedNumber);
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        double number = Questions.askSizePyramid();
        PyramidBuilder.buildPyramid(number);
    }
}
