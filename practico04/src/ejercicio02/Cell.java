package ejercicio02;

public class Cell {

    private Integer value;
    private Boolean north;
    private Boolean east;
    private Boolean south;
    private Boolean west;

    public Cell(Integer value, Boolean north, Boolean east, Boolean south, Boolean west) {
        this.value = value;
        this.north = north;
        this.east = east;
        this.south = south;
        this.west = west;
    }

    public Integer getValue() {
        return value;
    }

    public Boolean getNorth() {
        return north;
    }

    public Boolean getEast() {
        return east;
    }

    public Boolean getSouth() {
        return south;
    }

    public Boolean getWest() {
        return west;
    }

    @Override
    public String toString() {
        return "Cell{" + value + '}';
    }
}
