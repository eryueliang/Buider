import com.Computer;

/**
 * Created by liangey on 14-11-7.
 */
public class High extends Computer {
    @Override
    public void setCpu(String cpu) {
        super.setCpu("High");
    }

    @Override
    public void setScreen(String screen) {
        super.setScreen("Good");
    }
}
