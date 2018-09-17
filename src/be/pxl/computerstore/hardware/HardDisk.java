package be.pxl.computerstore.hardware;

public class HardDisk extends ComputerComponent {

    private int memory;

    public HardDisk(String vendor, String name, double price, int memory) {
        super(vendor, name, price);
        this.setMemory(memory);
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }
}
