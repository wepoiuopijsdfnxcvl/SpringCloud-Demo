package com.xiao.stock.demo.mapper;

import com.xiao.stock.demo.entity.StockDemo;
import org.apache.ibatis.annotations.Param;

/**
 * Created by Mybatis Generator on 2019/10/17
 */
public interface StockDemoMapper
{
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_stock_demo
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_stock_demo
     */
    int insert(StockDemo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_stock_demo
     */
    int insertSelective(StockDemo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_stock_demo
     */
    StockDemo selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_stock_demo
     */
    int updateByPrimaryKeySelective(StockDemo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_stock_demo
     */
    int updateByPrimaryKey(StockDemo record);

    /**
     * [简要描述]:商品店铺查询库存数据<br/>
     * [详细描述]:<br/>
      * @param productNo :
     * @param shopCode :
     * @param random :
     * @return
     * llxiao  2019/10/18 - 14:39
     **/
    StockDemo queryByProduct(@Param("productNo") String productNo, @Param("shopCode") String shopCode,
            @Param("random") int random);

    /**
     * 预占库存<br>
     *
     * @param tempStock
     * @return
     */
    int preStock(StockDemo tempStock);
}