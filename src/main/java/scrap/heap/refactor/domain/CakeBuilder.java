package scrap.heap.refactor.domain;

import scrap.heap.refactor.constants.*;

/**
 * Builder for Cake object
 */
public class CakeBuilder {

    private Flavor flavor = Flavor.EMPTY;
    private FrostingFlavor frostingFlavor = FrostingFlavor.EMPTY;
    private Shape shape = Shape.EMPTY;
    private Size size = Size.EMPTY;
    private Color color = Color.EMPTY;

    public CakeBuilder withFlavor(Flavor flavor) {
        this.flavor = flavor;
        return this;
    }

    public CakeBuilder withFrostingFlavor(FrostingFlavor frostingFlavor) {
        this.frostingFlavor = frostingFlavor;
        return this;
    }

    public CakeBuilder withShape(Shape shape) {
        this.shape = shape;
        return this;
    }

    public CakeBuilder withSize(Size size) {
        this.size = size;
        return this;
    }

    public CakeBuilder withColor(Color color) {
        this.color = color;
        return this;
    }

    public Cake build() {
        Cake cake = new Cake();
        cake.setFlavor(this.flavor);
        cake.setFrostingFlavor(this.frostingFlavor);
        cake.setShape(this.shape);
        cake.setSize(this.size);
        cake.setColor(this.color);
        return cake;
    }
}
