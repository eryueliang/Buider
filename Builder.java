/**
 * Created by liangey on 14-11-7.
 */
public abstract class Builder {
    protected com.Computer computer;

    Computer Computer = new Computer();

    public void createComputer(com.Computer computer) {

        computer = new com.Computer();
    }

    public abstract void buildScreen();
    public abstract void build_cpu();

}
