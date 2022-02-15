package com.kodilla.spring.portfolio;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
public class BoardConfigTestSuite {

    @Test
    void addTask() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);

        //When
        Board board = context.getBean(Board.class);

        //Then
        assertNotNull(board);
        assertNotNull(board.getDoneList());


    }
}
