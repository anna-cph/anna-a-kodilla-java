package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class World {
    private final List<Continent> theContinentList = new ArrayList<>();

    public void addContinent(Continent continent) {

        theContinentList.add(continent);
    }

    public BigDecimal getPeopleQuantity() {
        return theContinentList.stream()
                .flatMap(continent -> continent.getList().stream())
                .map(country->country.getPeopleQuantity())
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));
    }
}
