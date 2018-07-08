package principle.LSP;

/**
 * Created by Hu on 2017/11/8.
 */
public class Solider {

    private AbstractGun gun;
    private AbstractToy toy = new ToyGun();

    public void setGun(AbstractGun gun) {
        this.gun = gun;
    }

    public void setGun(AbstractToy toy) {
        this.toy = toy;
    }

    public void killEnemy() {
        System.out.println("士兵开始射杀敌人...");
        gun.shoot();
    }

    public void useToyGun() {
        toy.getSound();
        toy.getShape();
    }

}
