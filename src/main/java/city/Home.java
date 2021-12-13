package city;

public class Home extends Building {

    public static final int SQUARE_METERS_NEED_PER_PERSON = 20;

    public Home(int area, int levels, Address address) {
        super(area, levels, address);
    }

    public Home(int area, Address address) {
        super(area, address);
        if (super.getLevels() > 3) {
            throw new IllegalStateException("Max level 3");
        }
    }




    @Override
    public int calculateNumberOfPeopleCanFit() {
        return SQUARE_METERS_NEED_PER_PERSON;
    }
}
