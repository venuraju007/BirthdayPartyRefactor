package scrap.heap.refactor.constants;

public enum Material {
    MYLAR("mylar"),
    LATEX("latex");

    private String material;

    Material(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return material;
    }
}
