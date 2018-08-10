package fortest;

import com.sc.springboot.fortest.TestBean;
import com.sc.springboot.fortest.TestConfig;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by shichong on 2018/8/10
 * 未成功
 */
@RunWith(SpringJUnit4ClassRunner.class)//在JUnit环境下提供spring TestContext Framework 的功能
@ContextConfiguration(classes = {TestConfig.class})//加载ApplicationContext 其中classes属性用来加载配置类
@ActiveProfiles("dev")//声明活动的profile
public class DemoBeanIntegrationTests {

    @Autowired
    private TestBean testBean;

    @Test
    public void prodBeanShouldInject(){
        String expected ="from production profile";
        String actual =testBean.getContent();
        Assert.assertEquals(expected,actual);
    }

}
