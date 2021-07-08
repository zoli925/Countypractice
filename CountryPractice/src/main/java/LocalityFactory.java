public class LocalityFactory {
    public Locality Create(String name, LocalityType type) {
        switch (type) {
            case TOWN:
                return new Town(name);

            case VILLAGE:
                return new Village(name);
            default:
                return null;
        }
    }
}
