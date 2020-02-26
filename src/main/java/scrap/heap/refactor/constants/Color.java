package scrap.heap.refactor.constants;

public enum Color {
    RED("red"),
    BLUE("blue"),
    YELLOW("yellow"),
    BROWN("brown");

    private String color;

    Color(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return color;
    }
}
