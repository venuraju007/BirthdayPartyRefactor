package scrap.heap.refactor.domain;

import scrap.heap.refactor.constants.*;

public class Cake {

    private Flavor flavor;
    private FrostingFlavor frostingFlavor;
    private Shape shape;
    private Size size;
    private Color color;

    public Flavor getFlavor() {
        return flavor;
    }

    public void setFlavor(Flavor flavor) {
        this.flavor = flavor;
    }

    public FrostingFlavor getFrostingFlavor() {
        return frostingFlavor;
    }

    public void setFrostingFlavor(FrostingFlavor frostingFlavor) {
        this.frostingFlavor = frostingFlavor;
    }

    public Shape getShape() {
        return shape;
    }

    public void setShape(Shape shape) {
        this.shape = shape;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Cake ordered: " + this.flavor + ", " + this.frostingFlavor  + ", " + this.shape + ", " + this.size + ", " + this.color;
    }
}
