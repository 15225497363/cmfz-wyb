import com.baizhi.CmfzApp;
import com.baizhi.dao.MenuDao;
import com.baizhi.entity.Admin;
import com.baizhi.service.AdminService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by 王云博 on 2018/10/23.
 */
@SpringBootTest(classes = CmfzApp.class)
@RunWith(SpringRunner.class)
public class AdminTest {
    @Autowired
    private AdminService adminService;
    @Autowired
    private MenuDao menuDao;
    Admin admin = new Admin();

    @Test
    public void test() {

        //Admin admin = adminService.login("admin", "123456");
        System.out.println(admin);
    }

    @Test
    public void test1() {
        System.out.println(menuDao.queryAll());
    }
}
