package be.pxl.computerstore.hardware;

import be.pxl.computerstore.util.KeyboardLayout;

public class Keyboard extends Peripheral {

    private KeyboardLayout layout;

    public Keyboard(String vendor, String name, double price, KeyboardLayout layout) {
        super(vendor, name, price);
        this.setLayout(layout);
    }

    public KeyboardLayout getLayout() {
        return layout;
    }

    public void setLayout(KeyboardLayout layout) {
        this.layout = layout;
    }
}
