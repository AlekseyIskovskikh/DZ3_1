public class pressure {
    private int upPressure;
    private int dwnPressure;
    private  int puls;
    private double time; //дата и время

    public pressure(int upPressure, int dwnPressure, int puls, double time) {
        this.upPressure = upPressure;
        this.dwnPressure = dwnPressure;
        this.puls = puls;
        this.time = time;
    }

    public int getUpPressure() {
        return upPressure;
    }

    public void setUpPressure(int upPressure) {
        this.upPressure = upPressure;
    }

    public int getDwnPressure() {
        return dwnPressure;
    }

    public void setDwnPressure(int dwnPressure) {
        this.dwnPressure = dwnPressure;
    }

    public int getPuls() {
        return puls;
    }

    public void setPuls(int puls) {
        this.puls = puls;
    }

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }
}
