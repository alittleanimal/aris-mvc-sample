package com.accenture.aris.inventory.business.repository;

import com.accenture.aris.inventory.business.entity.StockEntity;
import com.accenture.aris.inventory.business.entity.StockInfoEntity;

import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Repository;

@Repository
public interface StockRepository {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_stock
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_stock
     *
     * @mbggenerated
     */
    int insert(StockEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_stock
     *
     * @mbggenerated
     */
    int insertSelective(StockEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_stock
     *
     * @mbggenerated
     */
    StockEntity selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_stock
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(StockEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_stock
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(StockEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_stock
     *
     * @mbggenerated Mon Oct 16 15:23:39 CST 2017
     */
    List<StockEntity> selectByEntity(StockEntity entity);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_stock
     *
     * @mbggenerated Mon Oct 16 15:23:39 CST 2017
     */
    int countByEntity(StockEntity entity);
    
    /**
     * 
     * @param entity
     * @return int
     */
    int countByStockInfoEntity(StockInfoEntity entity);
    
    /**
     * 
     * @param entity
     * @param rowBounds
     * @return list
     */
    List<StockInfoEntity> selectByStockInfoEntity(StockInfoEntity entity,RowBounds rowBounds);
    
    StockInfoEntity selectByIdDetailedInfo(int id);
}