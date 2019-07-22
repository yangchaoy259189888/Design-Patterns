package gof.create.abstractFactory;

/**
 * @author 西邮陈冠希
 * @date 2019/7/22
 **/
public abstract class AbstractFactory {
    private static final EmberToolkit EMBER_TOOLKIT = new EmberToolkit();
    private static final EnginolaToolkit ENGINOLA_TOOLKIT = new EnginolaToolkit();

    static AbstractFactory getFactory(Architecture architecture) {
        AbstractFactory factory = null;
        switch (architecture) {
            case EMBER:
                factory = EMBER_TOOLKIT;
                break;
            case ENGINOLA:
                factory = ENGINOLA_TOOLKIT;
                break;
        }

        return factory;
    }

    public abstract CPU creatCPU();
    public abstract MMU creatMMU();
}
