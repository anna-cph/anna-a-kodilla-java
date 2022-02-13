package com.kodilla.spring.reader;

import org.springframework.context.annotation.ConditionContext;
import org.springframework.context.annotation.Condition;
import org.springframework.core.type.AnnotatedTypeMetadata;

import java.lang.reflect.AnnotatedType;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class IfDayIsOddCondition implements Condition {

    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        return LocalDate.now().getDayOfMonth() %2 != 0;
    }
}
