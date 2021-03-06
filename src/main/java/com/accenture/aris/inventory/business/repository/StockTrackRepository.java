package com.accenture.aris.inventory.business.repository;

import com.accenture.aris.inventory.business.entity.StockTrackEntity;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public interface StockTrackRepository {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_stock_track
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_stock_track
     *
     * @mbggenerated
     */
    int insert(StockTrackEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_stock_track
     *
     * @mbggenerated
     */
    int insertSelective(StockTrackEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_stock_track
     *
     * @mbggenerated
     */
    StockTrackEntity selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_stock_track
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(StockTrackEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_stock_track
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(StockTrackEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_stock_track
     *
     * @mbggenerated Mon Oct 16 15:23:39 CST 2017
     */
    List<StockTrackEntity> selectByEntity(StockTrackEntity entity);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_stock_track
     *
     * @mbggenerated Mon Oct 16 15:23:39 CST 2017
     */
    int countByEntity(StockTrackEntity entity);
}