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
        if ( getActualArea() + building.getArea() > fullArea) {
            throw new IllegalArgumentException("City can't be larger than " + fullArea);
        }
        buildings.add(building);
    }

    private int getActualArea () {
        int sum = 0;
        for (Building b : buildings) {
            sum += b.getArea();
        }
        return sum;
    }




// calculateNumberOfPeopleCanFit() - ezzel van a hiba
    public boolean isThereBuildingWithMorePeopleThan(int i) {
        for (Building b : buildings) {
            if (b.calculateNumberOfPeopleCanFit() < i) {
                return true;
            }
        }
        return false;
    }
// különbözik a teszt és a leírás
    public Building findHighestBuilding() {
        int max = Integer.MIN_VALUE;
        Building buildingOne = buildings.get(0);
        for (Building b : buildings) {
            if (b.getLevels() > max) {
                max = b.getLevels();
                buildingOne = b;

            }
        }
        return buildingOne;
    }
// contains cserélve equals-ra
    public List<Building> findBuildingsByStreet(String address) {
        List<Building> filteredBuild = new ArrayList<>();
        for (Building b : buildings) {
            if (b.getAddress().getStreet().equals(address)) {
                filteredBuild.add(b);
            }
        }
        return filteredBuild;
    }
}