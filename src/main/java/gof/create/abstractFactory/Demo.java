package gof.create.abstractFactory;

/**
 * @author 西邮陈冠希
 * @date 2019/7/22
 **/
public class Demo {
    public static void main(String[] args) {
        AbstractFactory emberFactory = AbstractFactory.getFactory(Architecture.EMBER);
        CPU cpu = emberFactory.creatCPU();
        System.out.println(cpu);

        AbstractFactory enginolaFactory = AbstractFactory.getFactory(Architecture.ENGINOLA);
        MMU mmu = enginolaFactory.creatMMU();
        System.out.println(mmu);
    }
}
