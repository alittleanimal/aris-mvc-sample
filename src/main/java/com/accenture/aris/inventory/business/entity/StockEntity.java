package com.accenture.aris.inventory.business.entity;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class StockEntity {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_stock.id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_stock.dvd_id
     *
     * @mbggenerated
     */
    private Integer dvdId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_stock.warehouse_id
     *
     * @mbggenerated
     */
    private String warehouseId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_stock.quantity
     *
     * @mbggenerated
     */
    private Integer quantity;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_stock.id
     *
     * @return the value of t_stock.id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_stock.id
     *
     * @param id the value for t_stock.id
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_stock.dvd_id
     *
     * @return the value of t_stock.dvd_id
     *
     * @mbggenerated
     */
    public Integer getDvdId() {
        return dvdId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_stock.dvd_id
     *
     * @param dvdId the value for t_stock.dvd_id
     *
     * @mbggenerated
     */
    public void setDvdId(Integer dvdId) {
        this.dvdId = dvdId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_stock.warehouse_id
     *
     * @return the value of t_stock.warehouse_id
     *
     * @mbggenerated
     */
    public String getWarehouseId() {
        return warehouseId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_stock.warehouse_id
     *
     * @param warehouseId the value for t_stock.warehouse_id
     *
     * @mbggenerated
     */
    public void setWarehouseId(String warehouseId) {
        this.warehouseId = warehouseId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_stock.quantity
     *
     * @return the value of t_stock.quantity
     *
     * @mbggenerated
     */
    public Integer getQuantity() {
        return quantity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_stock.quantity
     *
     * @param quantity the value for t_stock.quantity
     *
     * @mbggenerated
     */
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_stock
     *
     * @mbggenerated Mon Oct 16 15:23:39 CST 2017
     */
    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }
}