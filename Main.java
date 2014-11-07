import com.Builder;
import com.Computer;

/**
 * Created by liangey on 14-11-7.
 */
public class Main {
    public static void main(String[] args) {
        RealBuilder realBuilder = new RealBuilder();
        realBuilder.setBuilder();
        realBuilder.constructComputer();

        Computer computer = realBuilder.getBuilder();

    }
}
