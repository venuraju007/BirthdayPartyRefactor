package scrap.heap.refactor.domain;

import scrap.heap.refactor.constants.Color;
import scrap.heap.refactor.constants.Material;

/**
 * Builder for Balloon object
 */
public class BalloonBuilder {

    private Color color;
    private Material material;
    private Integer count;

    public BalloonBuilder withColor(Color color) {
        this.color = color;
        return this;
    }

    public BalloonBuilder withMaterial(Material material) {
        this.material = material;
        return this;
    }

    public BalloonBuilder withCount(Integer count) {
        this.count = count;
        return this;
    }

    public Balloon build() {
        Balloon balloon = new Balloon();
        balloon.setColor(this.color);
        balloon.setMaterial(this.material);
        balloon.setCount(this.count);
        return balloon;
    }
}
