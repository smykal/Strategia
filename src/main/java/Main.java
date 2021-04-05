import com.headfirst.strategy.*;
import com.headfirst.strategy.fly.RocketFlyable;

public class Main {
    public static void main(String[] args) {
        Duck savageDuck = new SavageDuck();
        savageDuck.startFlying();
        savageDuck.startQwack();
        savageDuck.show();

        System.out.println("\n\n\n");

        Duck rocketDuck = new SampleDuck();
        rocketDuck.startFlying();
        rocketDuck.setFlyInterface(new RocketFlyable());
        rocketDuck.startFlying();
    }
}
