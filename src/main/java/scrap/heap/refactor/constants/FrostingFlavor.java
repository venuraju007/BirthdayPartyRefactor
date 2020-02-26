package scrap.heap.refactor.constants;

public enum FrostingFlavor {
    EMPTY(""),
    CHOCOLATE("chocolate"),
    VANILLA("vanilla");

    private String frostingFlavor;

    FrostingFlavor(String frostingFlavor) {
        this.frostingFlavor = frostingFlavor;
    }

    @Override
    public String toString() {
        return frostingFlavor;
    }
}
