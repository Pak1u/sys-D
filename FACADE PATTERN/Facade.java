public class Facade {
    AC ac;
    DVDPlayer dvd;
    PopcornMachine machine;
    TV tv;
    public Facade(AC ac , DVDPlayer dvd , PopcornMachine machine, TV tv) {
        this.ac = ac;
        this.dvd = dvd;
        this.machine = machine;
        this.tv = tv;
    }    
    public void MovieNightStart(){
        tv.on();
        dvd.on();
        machine.on();
        ac.on();
    }
    public void MovieNightEnd(){
        tv.off();
        dvd.off();
        machine.off();
        ac.off();
    }
    public void hungry(){
        machine.on();
    }
}
