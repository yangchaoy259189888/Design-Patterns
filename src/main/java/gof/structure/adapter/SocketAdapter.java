package gof.structure.adapter;

/**
 * 插座适配器，调用不同的方法，获得不同的电压。即把电压和插座两个不相关的类关联起来
 *
 * @author 西邮陈冠希
 * @date 2019/8/2
 **/
public interface SocketAdapter {
    int TWO = 2;
    int TEN = 10;
    int STANDARD = 220;

    Volt get2Volt();

    Volt get10Volt();

    Volt get220Volt();
}
