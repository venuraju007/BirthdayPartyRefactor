package scrap.heap.refactor.domain;

import scrap.heap.refactor.constants.Color;
import scrap.heap.refactor.constants.Material;

public class Balloon {

    private Color color;
    private Material material;
    private Integer count;

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "Balloons ordered: " + this.color + ", " + this.material  + ", " + this.count;
    }
}
