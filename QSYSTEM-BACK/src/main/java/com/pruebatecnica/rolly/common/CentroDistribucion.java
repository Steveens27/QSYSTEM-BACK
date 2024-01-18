package com.pruebatecnica.rolly.common;

public enum CentroDistribucion {

    LURIN("LURIN"),
    ICA("ICA"),
    TRUJILLO("TRUJILLO"),
    HUANUCO("HUANUCO");

    private final String functioning;

    CentroDistribucion(final String functioning) {
        this.functioning = functioning;
    }

    public String getValue() {
        return functioning;
    }
}
