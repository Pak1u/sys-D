import java.util.ArrayList;

public class WeatherData implements Subject{
    private float temp, humidity, pressure;
    private ArrayList <Observer> subsciberList;
    public WeatherData(){
        subsciberList = new ArrayList<>();
    }
    public void register(Observer o) {
        subsciberList.add(o);
    }
    public void remove(Observer o) {
        int i = subsciberList.indexOf(o);
        if(i >= 0) {
            subsciberList.remove(i);
        }
    }
    public void setData(float temp, float humidity,float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        mynotify();
    }
    public void mynotify() {
        for(Observer u : subsciberList) {
            u.update(temp, humidity , pressure);
        }
    }
}
