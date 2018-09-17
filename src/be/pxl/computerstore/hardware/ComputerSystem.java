package be.pxl.computerstore.hardware;

import be.pxl.computerstore.util.TooManyPeripheralsException;
import be.pxl.computerstore.util.Computable;

public class ComputerSystem implements Computable {

    //Variables
    private Processor processor;
    private HardDisk hardDisk;
    private ComputerCase computerCase;
    private Peripheral [] peripherals = new Peripheral[2];
    public static final int MAX_PERIPHERAL = 3;

    //Constructor
    public ComputerSystem() {

    }

    //Interface implementations


    @Override
    public double totalPriceExcl() {
        double price = 0;

        price += processor.getPrice();
        price += computerCase.getPrice();

        for(Peripheral peripheral: peripherals){

            if(peripheral != null) {
                price += peripheral.getPrice();
            }
        }

        return price;
    }

    //Functions
    public void addPeripheral(Peripheral peripheral) throws TooManyPeripheralsException {

        if(getNumberOfPeripherals() >= MAX_PERIPHERAL){
            throw new TooManyPeripheralsException("Aantal toegelaten Peripheral objecten overschreden (max 3)");
        }

        for(int i = 0; i < peripherals.length; i++){

            if(peripherals[i] == null){
                peripherals[i] = peripheral;
                return;
            }
        }
    }

    public void removePeripheral(String articleNumber){

        for(int i = 0; i < peripherals.length; i++){

            if( peripherals[i] != null && peripherals[i].getArticleNumber().equals(articleNumber)){
                peripherals[i] = null;
            }
        }
    }

    public int getNumberOfPeripherals(){ //can be done in a more effective way, loop until you hit null or not. Then return a bool.
        int numberOfPeripherals = 0;

        for(int i = 0; i < peripherals.length; i++){

            if(peripherals[i] != null){
                numberOfPeripherals++;
            }
        }
        return numberOfPeripherals;
    }

    //Getters & Setters
    public Processor getProcessor() {
        return processor;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public HardDisk getHardDisk() {
        return hardDisk;
    }

    public void setHardDisk(HardDisk hardDisk) {
        this.hardDisk = hardDisk;
    }

    public ComputerCase getComputerCase() {
        return computerCase;
    }

    public void setComputerCase(ComputerCase computerCase) {
        this.computerCase = computerCase;
    }

    public Peripheral[] getPeripherals() {
        return peripherals;
    }

    public void setPeripherals(Peripheral[] peripherals) {
        this.peripherals = peripherals;
    }
}
