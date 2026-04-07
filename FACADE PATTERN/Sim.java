public class Sim {
    public static void main(String[] args) {
        AC ac = new AC();
        DVDPlayer dvd = new DVDPlayer();
        PopcornMachine machine = new PopcornMachine();
        TV tv = new TV();
        Facade f1 = new Facade(ac, dvd , machine ,tv);
        f1.MovieNightStart();
        f1.MovieNightEnd();
        f1.hungry();
    }    
}
