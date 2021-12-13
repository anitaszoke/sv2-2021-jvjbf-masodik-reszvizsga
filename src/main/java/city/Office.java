package city;

public class Office extends Building {

    private static final int SQUARE_METERS_NEED_PER_PERSON = 20;
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
        return (getLevels() * getArea()) / SQUARE_METERS_NEED_PER_PERSON;
    }
}
