package net.frankheijden.wecompatibility.core;

import org.bukkit.Material;

public class CustomBlock {
    private Vector vector;
    private Material material;

    public CustomBlock(Vector vector, Material material) {
        this.vector = vector;
        this.material = material;
    }

    public Vector getVector() {
        return vector;
    }

    public void setVector(Vector vector) {
        this.vector = vector;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }
}
