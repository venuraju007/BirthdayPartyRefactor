package scrap.heap.refactor.constants;

public enum Shape {
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
