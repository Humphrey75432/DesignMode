package principle.LKP;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Hu on 2017/11/12.
 */
public class Client {

    public static void main(String[] args) {
        List<Girl> girlList = new ArrayList<Girl>();
        for (int i = 0; i < 20; i++) {
            girlList.add(new Girl());
        }
        Teacher teacher = new Teacher();
        teacher.commond(new GroupLeader(girlList));
    }
}
