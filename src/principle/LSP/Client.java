package principle.LSP;

/**
 * Created by Hu on 2017/11/8.
 */
public class Client {

    public static void main(String[] args) {
        Solider sanMao = new Solider();
        sanMao.setGun(new Rifle());
        sanMao.killEnemy();

        Solider wuMao = new Solider();
        wuMao.setGun(new ToyGun());
        wuMao.useToyGun();
    }
}
