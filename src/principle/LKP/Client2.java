package principle.LKP;

/**
 * Created by Hu on 2017/11/12.
 */
public class Client2 {

    public static void main(String[] args) {
        InstallSoftware invoker = new InstallSoftware();
        invoker.installWizard(new Wizard());
    }
}
