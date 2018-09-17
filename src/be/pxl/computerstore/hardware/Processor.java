package be.pxl.computerstore.hardware;

public class Processor extends ComputerComponent {
    private double clockspeed;
    private static final double  MIN_CLOCKSPEED = 0.7;

    public Processor(String vendor, String name, double price, double clockspeed){
        super(vendor, name, price);

        this.setClockspeed(clockspeed);
    }

    @Override
    public String getFullDescription() {
        StringBuilder temp = new StringBuilder(super.getFullDescription());
        temp.append("Clock speed = ").append(getClockspeed()).append("GHz");
        return temp.toString();
    }

    public double getClockspeed() {

        return clockspeed;
    }

    public void setClockspeed(double clockspeed) {

        if(clockspeed < MIN_CLOCKSPEED){
            clockspeed = MIN_CLOCKSPEED;
        }

        this.clockspeed = clockspeed;
    }
}
