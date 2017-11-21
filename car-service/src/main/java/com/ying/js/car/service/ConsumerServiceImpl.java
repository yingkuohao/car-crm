package com.ying.js.car.service;

import com.ying.js.car.dao.mapper.ConsumerDAO;
import com.ying.js.car.dao.model.ConsumerDO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by IntelliJ IDEA.
 * User: chengjing
 * Date: 17/11/14
 * Time: 下午2:45
 * CopyRight: ying
 * Descrption:
 */
@Service
public class ConsumerServiceImpl implements ConsumerService {

    @Autowired
    ConsumerDAO consumerDAO;

    @Override
    public ConsumerVO getConsumerById(Long consumerId) {
        ConsumerVO consumerVO = new ConsumerVO();
        ConsumerDO storeDO = consumerDAO.selectByPrimaryKey(consumerId);
        if (storeDO != null) {
            consumerVO.setName(storeDO.getName());
            consumerVO.setPhone(storeDO.getPhone());
            consumerVO.setId(storeDO.getId());
            consumerVO.setAddress(storeDO.getAddress());
            consumerVO.setCarFrameNum(storeDO.getCarFrameNum());
            consumerVO.setCarLicenseNum(storeDO.getCarLicenseNum());
            consumerVO.setCarType(storeDO.getCarType());
            consumerVO.setContent(storeDO.getContent());
        }
        return consumerVO;
    }
}
