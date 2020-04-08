package ru.gushchin.ivt.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component("ReturnClass")
public class ReturnClass implements ReturnInterface{
    StringBuilder line; // Строка из файла

    @Autowired
    public ReturnClass(@Qualifier StringBuilder line) {
        this.line = line;
    } // Конструктор, инициализирует строку

    @Override
    public StringBuilder sendBackLine() {
        return line;
    } // Возвращает строку
}
