package org.launchcode.enumerableplanets.data;

public enum Planets {


    MERCURY("Mercury", 88),
    VENUS("Venus", 225),
    EARTH("Earth", 365),
    MARS("Mars", 687),
    JUPITER("Jupiter", 4333),
    SATURN("Saturn", 10759),
    URANUS("Uranus", 30687),
    NEPTUNE("Neptune", 60200);

    private final String name;
    private final int yearsLength;

    Planets(String aName, int aYearsLength) {
        this.name = aName;
        this.yearsLength = aYearsLength;
    }

    public String getName() {
        return name;
    }

    public int getYearsLength() {
        return yearsLength;
    }
}
