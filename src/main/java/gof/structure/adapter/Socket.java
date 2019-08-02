package gof.structure.adapter;

/**
 * 插座，标准电压为220V
 *
 * @author 西邮陈冠希
 * @date 2019/8/2
 **/
public class Socket {
    Volt getStandardVolt() {
        return new Volt(220);
    }
}
