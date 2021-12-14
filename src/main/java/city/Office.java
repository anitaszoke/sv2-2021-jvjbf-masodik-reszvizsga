package city;

import static city.Home.SQUARE_METERS_NEED_PER_PERSON;

public class Office extends Building {

    private String company;
    private int numberOfTablesPerLevel;

    public Office(int area, int levels, Address address, String company, int numberOfTablesPerLevel) {
        super(area, levels, address);
        this.company = company;
        this.numberOfTablesPerLevel = numberOfTablesPerLevel;

    }

    public String getCompany() {
        return company;
    }

    public int getNumberOfTablesPerLevel() {
        return numberOfTablesPerLevel;
    }

    @Override
    public int getFullArea() {
        return getLevels() * getArea();
    }

    @Override
    public int calculateNumberOfPeopleCanFit() {
        return (getFullArea()/ SQUARE_METERS_NEED_PER_PERSON);
    }
}
