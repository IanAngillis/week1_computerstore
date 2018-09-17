package be.pxl.computerstore.hardware;

import be.pxl.computerstore.util.Dimension;

public class ComputerCase extends ComputerComponent {

    private Dimension dimension;
    private double weight;

    public ComputerCase(String vendor, String name, double price){
       super(vendor, name, price);
    }

    @Override
    public String getFullDescription() {
        StringBuilder temp = new StringBuilder(super.getFullDescription());
        temp.append(dimension.toString());
        temp.append("Weight = ").append(getWeight()).append("kg");
        return temp.toString();
    }

    public Dimension getDimension() {
        return dimension;
    }

    public void setDimension(Dimension dimension) {
        this.dimension = dimension;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
