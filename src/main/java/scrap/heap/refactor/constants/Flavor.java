package scrap.heap.refactor.constants;

public enum Flavor {
    CHOCOLATE("chocolate"),
    VANILLA("vanilla");

    private String flavor;

    Flavor(String flavor) {
        this.flavor = flavor;
    }

    @Override
    public String toString() {
        return flavor;
    }
}
