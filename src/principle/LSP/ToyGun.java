package principle.LSP;

/**
 * Created by Hu on 2017/11/8.
 */
public class ToyGun extends AbstractToy {

    @Override
    public void getShape() {
        System.out.println("玩具枪的形状");
    }

    @Override
    public void getSound() {
        System.out.println("玩具枪的声音");
    }
}
