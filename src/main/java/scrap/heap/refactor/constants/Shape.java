package scrap.heap.refactor.constants;

public enum Shape {
    EMPTY(""),
    SQUARE("square"),
    CIRCLE("circle");

    private String shape;

    Shape(String shape) {
        this.shape = shape;
    }

    @Override
    public String toString() {
        return shape;
    }
}
