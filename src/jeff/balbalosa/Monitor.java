package jeff.balbalosa;

public class Monitor {
    private String model;
    private String manufacturerl;
    private  int size;
    private Resolution nativeResolution; //OOP - Composition


    public Monitor(String model, String manufacturerl, int size, Resolution nativeResolution) {
        this.model = model;
        this.manufacturerl = manufacturerl;
        this.size = size;
        this.nativeResolution = nativeResolution;
    }

    public void drawPixelAt(int x, int y, String color){
        System.out.println("Drawing pixel at" + x + ", " + y + " in colour " + color);
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturerl;
    }

    public int getSize() {
        return size;
    }

    public Resolution getNativeResolution() {
        return nativeResolution;
    }
}
