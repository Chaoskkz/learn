package com.masun.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.masun.pojo.entity.Payment;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author masun
 */
@Mapper
public interface PaymentMapper extends BaseMapper<Payment> {

    /**
     * 根据id查询
     * @param id id of Payment
     * @return Payment
     */
    Payment selectOneById(Long id);

}
