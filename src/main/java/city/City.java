package city;

import java.util.ArrayList;
import java.util.List;

public class City {
    private String name;
    private long fullArea;
    private List<Building> buildings = new ArrayList<>();


    public City(String name, long fullArea) {
        this.name = name;
        this.fullArea = fullArea;
    }

    public String getName() {
        return name;
    }

    public long getFullArea() {
        return fullArea;
    }

    public List<Building> getBuildings() {
        return buildings;
    }

    public void addBuilding(Building building) {
        buildings.add(building);
    }

    public Building findHighestBuilding() {
        int max = Integer.MIN_VALUE;
        Building building1 = buildings.get(0);
        for (Building b : buildings) {
            if (b.getLevels() > max) {
                max = b.getLevels();
                building1 = b;

            }
        }
        return building1;
    }

    public List<Building> findBuildingsByStreet(String address) {
        List<Building> filteredBuild = new ArrayList<>();

        for (Building b : buildings) {

            if (b.getAddress().getStreet().contains(address)) {
            filteredBuild.add(b);
        }

    }
        return filteredBuild;
}

    public boolean isThereBuildingWithMorePeopleThan(int i) {
        for (Building b : buildings) {
            if (b.calculateNumberOfPeopleCanFit() > i) {
                return true;
            }
        }
        return false;
    }
}
