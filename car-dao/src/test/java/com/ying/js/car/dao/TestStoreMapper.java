package com.ying.js.car.dao;

import com.ying.js.car.dao.mapper.ConsumerDAO;
import com.ying.js.car.dao.model.ConsumerDO;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by IntelliJ IDEA.
 * User: chengjing
 * Date: 16/9/6
 * Time: 下午5:49
 * CopyRight: ying
 * Descrption:
 */

//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(locations = {"classpath*:/spring-dao.xml"})
//@MapperScan("com.ying.js.car.dao.mybatis.mapper")
public class TestStoreMapper extends CarBaseTestBoot {

    @Autowired
    ConsumerDAO consumerDAO;

    @Test
    public void getGet() {
        Long id = 1L;
        ConsumerDO storeDO = consumerDAO.selectByPrimaryKey(id);
        CarBaseTestBoot.logger.debug("storeDo=" + storeDO.toString());
    }

}
