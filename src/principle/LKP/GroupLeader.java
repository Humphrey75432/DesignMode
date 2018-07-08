package principle.LKP;

import java.util.List;

/**
 * Created by Hu on 2017/11/12.
 */
public class GroupLeader {
    private List<Girl> girlList;

    public GroupLeader(List<Girl> girlList) {
        this.girlList = girlList;
    }

    public void countGirls() {
        System.out.println("女生的数量是："+this.girlList.size());
    }
}
