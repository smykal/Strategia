import com.headfirst.strategy.Duck;
import com.headfirst.strategy.SavageDuck;

public class Main {
    public static void main(String[] args) {
        Duck savageDuck = new SavageDuck();
        savageDuck.startFlying();
        savageDuck.startQwack();
        savageDuck.show();
    }
}
