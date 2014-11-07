import com.Computer;

/**
 * Created by liangey on 14-11-7.
 */
public class Low extends Computer {
    @Override
    public void setCpu(String cpu) {
        super.setCpu("Low");
    }

    @Override
    public void setScreen(String screen) {
        super.setScreen("Low");
    }
}
