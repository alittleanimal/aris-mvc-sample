package com.accenture.aris.inventory.business.entity;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class WarehouseEntity {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_warehouse.id
     *
     * @mbggenerated
     */
    private String id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_warehouse.name
     *
     * @mbggenerated
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_warehouse.capacity
     *
     * @mbggenerated
     */
    private Integer capacity;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_warehouse.address
     *
     * @mbggenerated
     */
    private String address;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_warehouse.tel
     *
     * @mbggenerated
     */
    private String tel;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_warehouse.id
     *
     * @return the value of t_warehouse.id
     *
     * @mbggenerated
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_warehouse.id
     *
     * @param id the value for t_warehouse.id
     *
     * @mbggenerated
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_warehouse.name
     *
     * @return the value of t_warehouse.name
     *
     * @mbggenerated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_warehouse.name
     *
     * @param name the value for t_warehouse.name
     *
     * @mbggenerated
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_warehouse.capacity
     *
     * @return the value of t_warehouse.capacity
     *
     * @mbggenerated
     */
    public Integer getCapacity() {
        return capacity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_warehouse.capacity
     *
     * @param capacity the value for t_warehouse.capacity
     *
     * @mbggenerated
     */
    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_warehouse.address
     *
     * @return the value of t_warehouse.address
     *
     * @mbggenerated
     */
    public String getAddress() {
        return address;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_warehouse.address
     *
     * @param address the value for t_warehouse.address
     *
     * @mbggenerated
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_warehouse.tel
     *
     * @return the value of t_warehouse.tel
     *
     * @mbggenerated
     */
    public String getTel() {
        return tel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_warehouse.tel
     *
     * @param tel the value for t_warehouse.tel
     *
     * @mbggenerated
     */
    public void setTel(String tel) {
        this.tel = tel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_warehouse
     *
     * @mbggenerated Mon Oct 16 15:23:39 CST 2017
     */
    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }
}