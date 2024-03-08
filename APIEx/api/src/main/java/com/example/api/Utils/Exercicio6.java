package com.example.api.Utils;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Exercicio6 {

    public static final String[] holidaysList = { "01-01-2024", "Confraternização Mundial", "12-02-2024", "Carnaval",
            "13-02-2024", "Carnaval", "29-03-2024", "Sexta-feira Santa", "21-04-2024", "Tiradentes",
            "01-05-2024", "Dia do Trabalho", "30-05-2024", "Corpus Christi", "07-09-2024", "Independência do Brasil",
            "12-10-2024", "Nossa Senhora Aparecida", "02-11-2024", "Finados", "15-11-2024",
            "Proclamação da República", "20-11-2024", "Dia Nacional de Zumbi e da Consciência Negra", "25-12-2024",
            "Natal" };

    private static final Scanner scanner = new Scanner(System.in);

    public static LocalDate askDate() {
        String questionDate = "Qual data quer verificar se é feriado? (Formato: dd-MM-yyyy) ";
        LocalDate date = null;
        boolean entradaValida = false;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        while (!entradaValida) {
            try {
                String entradaUsuario = scanner.nextLine();
                date = LocalDate.parse(entradaUsuario, formatter);
                entradaValida = true;
            } catch (DateTimeParseException e) {
                System.out.println("Formato de data inválido. Por favor, tente novamente.");
                System.out.print(questionDate);
            }
        }
        return date;
    }

    public static String printHolidays() {
        String holidayList = "";

        for (int i = 0; i < holidaysList.length; i += 2) {
            System.out.println(holidaysList[i] + " => " + holidaysList[i + 1]);
            holidayList = holidayList + "\n" + holidaysList[i] + " => " + holidaysList[i + 1];
        }

        return holidayList;
    }

    public static String isHoliday(LocalDate date) {
        List<String> holidayList = Arrays.asList(holidaysList);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String stringDate = date.format(formatter);
        int indexInHolidayList = -1;
        String isHoldayReturn = "";

        if (!stringDate.contains("2024")) {
            String dateWithoutYear = stringDate.substring(0, 5);
            String dateWith2024 = dateWithoutYear + "-2024";
            indexInHolidayList = holidayList.indexOf(dateWith2024);
        } else {
            indexInHolidayList = holidayList.indexOf(stringDate);
        }

        if (indexInHolidayList == -1) {
            System.out.println("O dia " + date + " não é feriado 🥲");
            isHoldayReturn = "O dia " + date + " não é feriado 🥲";
        } else {
            System.out.println("O dia " + date + " é " + holidaysList[indexInHolidayList + 1] + "! 🎉");
            isHoldayReturn = "O dia " + date + " é " + holidaysList[indexInHolidayList + 1] + "! 🎉";
        }

        return isHoldayReturn;
    }

    public static void main(String[] args) {
        System.out.println("Lista de Feriados Disponíveis:");
        printHolidays();
        System.out.println();

        System.out.print("Por favor, insira a data para verificar se é feriado: ");
        LocalDate dataInput = askDate();
        isHoliday(dataInput);
    }
}
