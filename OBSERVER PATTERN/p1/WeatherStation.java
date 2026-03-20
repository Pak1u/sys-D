public class WeatherStation {
    public static void main(String[] args) {
        WeatherData wd = new WeatherData();
        CurrentConditionsDisplay cd1 = new CurrentConditionsDisplay(); 
        wd.register(cd1);
        wd.setData(21, 24, 88);
    }    
}
