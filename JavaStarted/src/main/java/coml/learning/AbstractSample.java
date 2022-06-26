package coml.learning;

abstract class Bike {
    abstract void run();
}

class Honda extends Bike {

    @Override
    void run() {
        System.out.println("Running safely");
    }

    public static void main(String[] args) {
        Bike bike = new Honda();
        bike.run();
    }
}

abstract class Abs {
    //method which is declared as abstract and does not have any implementation is known as an abstract method
    abstract void printStatus();
}

public class AbstractSample {

}
