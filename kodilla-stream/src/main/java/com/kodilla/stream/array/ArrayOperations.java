package com.kodilla.stream.array;

import java.util.stream.IntStream;

public interface ArrayOperations {
    public static double getAverage(int[] numbers) {
        return IntStream.range(0, numbers.length)
        .map(index -> numbers[index])
        .average().orElse(0.0);
    };
}
