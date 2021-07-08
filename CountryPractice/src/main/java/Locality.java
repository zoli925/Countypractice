public abstract class Locality {
    private String name;

    public void setType(LocalityType type) {
        this.type = type;
    }

    private LocalityType type;
    private String gps;

    public LocalityType getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGps() {
        return gps;
    }

    public void setGps(String gps) {
        this.gps = gps;
    }


    public Locality(String nm) {
        this.name = nm;

    }
}

