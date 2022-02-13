package com.kodilla.spring.portfolio;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class BoardConfig {

    Board board;

    /*
    @Bean
    public Board getBoard() {
        //return new Board(toDoList.add("xxx"));
        List<TaskList> toDoList1 = new ArrayList<>();
        toDoList1.add("Drink water");
        List<String> inProgressList1 = new ArrayList<>();
        inProgressList1 .add("Bootcamp");
        List<String> doneList1 = new ArrayList<>();
        doneList1.add("Sleep");
        return new Board(toDoList1, inProgressList1, doneList1)
    }

     */

}
