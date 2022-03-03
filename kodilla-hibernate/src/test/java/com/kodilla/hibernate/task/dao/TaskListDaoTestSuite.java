package com.kodilla.hibernate.task.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class TaskListDaoTestSuite {
    private static final String DESCRIPTION = "Test: Learn Hibernate";

    @Autowired
    private TaskListDao taskListDao;

    @Test
    void testFindByListName() {
        //Given
        TaskList taskList = new TaskList(DESCRIPTION, "To-do List");
        taskListDao.save(taskList);

        //When
        List<TaskList> toDoList = taskListDao.findByListName("To-do List");

        //Then
        int id = taskList.getId();
        assertEquals(1, toDoList.size());

        //CleanUp
        taskListDao.deleteById(id);
    }

}
