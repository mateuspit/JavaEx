import java.util.Arrays;
import java.util.List;
import java.io.Console;

public class App {

    private static final String[] holidaysList = { "01-01-2024", "Confraternização Mundial", "12-02-2024", "Carnaval",
            "13-02-2024", "Carnaval", "29-03-2024", "Sexta-feira Santa", "21-04-2024", "Tiradentes", "01-05-2024",
            "Dia do Trabalho", "30-05-2024", "Corpus Christi", "07-09-2024", "Independência do Brasil",
            "12-10-2024", "Nossa Senhora Aparecida", "02-11-2024", "Finados", "15-11-2024",
            "Proclamação da República", "20-11-2024", "Dia Nacional de Zumbi e da Consciência Negra", "25-12-2024",
            "Natal" };

    public static String askDate() {
        Console console = System.console();
        String questionDate = "Qual data quer analisar se é feriado? ";

        return parseInput(console.readLine(questionDate));
    }

    public static String parseInput(String date) {
        int dateSize = date.length();
        boolean rightSeparator = date.contains("-");

        if (dateSize != 10 || !rightSeparator) {
            System.out.println(
                    "Números que representam dia e mês devem ter dois digitos e ano quatro digitos separados por -");
            System.out.println("Ex: 01-01-2024");
            askDate();

        }
        return date;
    }

    public static void printHolidays() {
        for (int i = 0; i < holidaysList.length; i++) {
            if (i % 2 == 0) {
                System.out.print(holidaysList[i] + " => ");
            } else {
                System.out.println(holidaysList[i]);
            }
        }
    }

    public static void isHoliday(String date) {
        List<String> holidayList = Arrays.asList(holidaysList);
        int indexInHolidayList = -1;
        if (!date.contains("2024")) {
            String dateWithoutYear = date.substring(0, 5);
            String dateWith2024 = dateWithoutYear + "-2024";
            indexInHolidayList = holidayList.indexOf(dateWith2024);
        } else {
            indexInHolidayList = holidayList.indexOf("12-10");
        }

        if (indexInHolidayList == -1) {
            System.out.println("Dia " + date + " não é feriado 🥲");
        } else {
            System.out.println("Dia " + date + " é " + holidayList.get(indexInHolidayList + 1) + "! 🎉");
        }
    }

    public static void main(String[] args) {
        isHoliday(askDate());
    }
}
