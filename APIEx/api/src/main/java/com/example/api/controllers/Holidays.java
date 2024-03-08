package com.example.api.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.example.api.Utils.Exercicio6;

import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/holidays")
public class Holidays {

    @GetMapping()
    public String allHolidays() {
        return Exercicio6.printHolidays();
    }

    @GetMapping("/{date}")
    public String getMethodName(@PathVariable("date") String date) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate localDateDate = LocalDate.parse(date, formatter);
        return Exercicio6.isHoliday(localDateDate);
    }

}
