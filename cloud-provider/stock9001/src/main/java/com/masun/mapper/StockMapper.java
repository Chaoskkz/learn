package com.masun.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.masun.pojo.entity.Stock;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author masun
 */
@Mapper
public interface StockMapper extends BaseMapper<Stock> {
}
