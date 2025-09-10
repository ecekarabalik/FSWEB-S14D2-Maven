package org.example.model;

import org.example.model.enums.LampType;

public class Lamp {
    private LampType style;
    private boolean battery;
    private int globRating; // <- testin beklediği isim

    public Lamp(LampType style, boolean battery, int globRating) {
        this.style = style;
        this.battery = battery;
        this.globRating = globRating;
    }

    public void turnOn() {
        System.out.println("Lamp is being turned on.");
    }

    public LampType getStyle() {
        return style;
    }

    public boolean isBattery() {
        return battery;
    }

    // Testin çağırdığı getter
    public int getGlobRating() {
        return globRating;
    }

    // (İstersen geriye dönük uyumluluk için bunu da bırakabilirsin)
    public int getGlobalRating() {
        return globRating;
    }
}