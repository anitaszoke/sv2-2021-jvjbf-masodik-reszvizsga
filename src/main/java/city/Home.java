package city;

public class Home extends Building {

    public static final int SQUARE_METERS_NEED_PER_PERSON = 20;

    public Home(int area, int levels, Address address) {
        super(area, levels, address);
        if (super.getLevels() > 3) {
            throw new IllegalArgumentException("Max level 3");
        }
    }

    public Home(int area, Address address) {
        super(area, address);
        if (super.getLevels() > 3) {
            throw new IllegalArgumentException("Max level 3");
        }
    }


    @Override
    public int getFullArea() {
        return super.getFullArea();
    }

    @Override
    public int calculateNumberOfPeopleCanFit() {
        return getFullArea() / SQUARE_METERS_NEED_PER_PERSON;
    }
}
