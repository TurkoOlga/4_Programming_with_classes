package task13;
/*
3. Создать объект класса Государство, используя классы Область, Район, Город. Методы: вывести на консоль
столицу, количество областей, площадь, областные центры.
 */

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Country country = createCountry();
        country.getSquare();
        country.getCapital();
        country.getNumberOfRegions();
        country.getRegionTowns();
    }

    public static Country createCountry() {
        Region regionVitebsk = getVitebskRegion();
        Region regionMogilev = createMogilevRegion();

        List<Region> regions = new ArrayList<>();
        regions.add(regionVitebsk);
        regions.add(regionMogilev);
        return new Country("Belarus", regions);
    }

    private static Region createMogilevRegion() {
        Town mogilev = new Town("Mogilev", 2342, false, true);
        List<Town> townsInMogilevDistrict = new ArrayList<>();
        townsInMogilevDistrict.add(mogilev);
        District districtMogilev = new District("Mogilev district", townsInMogilevDistrict);
        List<District> districtsMogilev = new ArrayList<>();
        districtsMogilev.add(districtMogilev);

        return new Region("Mogilev region", districtsMogilev);
    }

    private static Region getVitebskRegion() {
        Town glubokoe = new Town("Glubokoe", 234, false, false);
        List<Town> townsInGlubokoeDistrict = new ArrayList<>();
        townsInGlubokoeDistrict.add(glubokoe);
        District districtGlubokoe = new District("Glubokoe", townsInGlubokoeDistrict);
        List<District> districtsGlubokoe = new ArrayList<>();
        districtsGlubokoe.add(districtGlubokoe);

        return new Region("Vitebsk region", districtsGlubokoe);
    }
}
