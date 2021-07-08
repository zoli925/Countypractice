import java.util.ArrayList;
import java.util.List;

public class Country {
    public static void main(String[] args) {
        List<Locality> localities = new ArrayList<Locality>();
        LocalityFactory localityFactory = new LocalityFactory();
        Locality telepules;
        telepules = localityFactory.Create("Budapest", LocalityType.TOWN);
        telepules.setGps("1122");
        localities.add(telepules);
        telepules = localityFactory.Create("Nagykanizsa", LocalityType.TOWN);
        telepules.setGps("1123");
        localities.add(telepules);
        telepules = localityFactory.Create("Kukutyin", LocalityType.VILLAGE);
        telepules.setGps("1124");
        localities.add(telepules);

        String[] varos = {"szeged", "pecs", "debrecen"};

        for (Integer i = 0; i < varos.length; i++) {
            telepules = localityFactory.Create(varos[i], LocalityType.TOWN);
            telepules.setGps("123" + i.toString());
            localities.add(telepules);

        }
        for (int i = 0; i < localities.size(); i++) {
            System.out.println(localities.get(i).getName() + " " + localities.get(i).getGps());

        }
    }

}
