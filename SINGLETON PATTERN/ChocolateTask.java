class ChocolateTask implements Runnable {

    @Override
    public void run() {
        ChocolateMachine machine = ChocolateMachine.makeMachine();

        String name = Thread.currentThread().getName();
        System.out.println(name + " got machine: " + machine);

        machine.fillUp();
        System.out.println(name + " filled");

        machine.boil();
        System.out.println(name + " boiled");

        machine.drain();
        System.out.println(name + " drained");
    }
}