package scrap.heap.refactor.constants;

public enum Size {
    EMPTY(""),
    SMALL("small"),
    MEDIUM("medium"),
    LARGE("large");

    private String size;

    Size(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return size;
    }
}
