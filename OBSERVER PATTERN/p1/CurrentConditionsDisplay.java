public class CurrentConditionsDisplay implements Observer, DisplayElement{
    private float temp, humidity, pressure;
    public void update(float temp , float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        mydisplay();
    }
    public void mydisplay() {
        System.out.println("Refreshed!!");
        System.out.println("Temp"+temp + "humidity" + humidity + "pressure" + pressure);
    }
}
