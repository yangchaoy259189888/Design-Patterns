package gof.structure.adapter;

/**
 * @author 西邮陈冠希
 * @date 2019/8/2
 **/
public class Demo {
    public static void main(String[] args) {
        SocketAdapter socketAdapter = new SocketAdapterImpl();
        Volt v2 = getVolt(socketAdapter, SocketAdapter.TWO);
        System.out.println(v2.getVolts());

        Volt v10 = getVolt(socketAdapter, SocketAdapter.TEN);
        System.out.println(v10.getVolts());

        Volt v220 = getVolt(socketAdapter, SocketAdapter.STANDARD);
        System.out.println(v220.getVolts());
    }

    private static Volt getVolt(SocketAdapter socketAdapter, int i) {
        switch (i) {
            case SocketAdapter.TWO:
                return socketAdapter.get2Volt();
            case SocketAdapter.TEN:
                return socketAdapter.get10Volt();
            default:
                return socketAdapter.get220Volt();
        }
    }
}
