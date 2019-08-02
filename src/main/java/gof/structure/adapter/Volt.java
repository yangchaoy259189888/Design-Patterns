package gof.structure.adapter;

/**
 * 电压类
 *
 * @author 西邮陈冠希
 * @date 2019/8/2
 **/
public class Volt {
    private int volts;

    public Volt(int volts) {
        this.volts = volts;
    }

    public int getVolts() {
        return volts;
    }

    public void setVolts(int volts) {
        this.volts = volts;
    }
}
