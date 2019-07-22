package gof.create.abstractFactory;

/**
 * @author 西邮陈冠希
 * @date 2019/7/22
 **/
public class EnginolaToolkit extends AbstractFactory {
    @Override
    public CPU creatCPU() {
        return new EnginolaCPU();
    }

    @Override
    public MMU creatMMU() {
        return new EnginolaMMU();
    }
}
