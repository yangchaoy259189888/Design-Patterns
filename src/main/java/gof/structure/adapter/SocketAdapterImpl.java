package gof.structure.adapter;

/**
 * @author 西邮陈冠希
 * @date 2019/8/2
 **/
public class SocketAdapterImpl implements SocketAdapter {
    private Socket socket = new Socket();

    private Volt convert(Volt volt, int i) {
        return new Volt(volt.getVolts() / i);
    }

    @Override
    public Volt get2Volt() {
        return convert(socket.getStandardVolt(), 110);
    }

    @Override
    public Volt get10Volt() {
        return convert(socket.getStandardVolt(), 22);
    }

    @Override
    public Volt get220Volt() {
        return socket.getStandardVolt();
    }
}
