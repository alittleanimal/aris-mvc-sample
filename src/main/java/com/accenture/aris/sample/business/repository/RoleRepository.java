package com.accenture.aris.sample.business.repository;

import com.accenture.aris.sample.business.entity.RoleEntity;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_role
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_role
     *
     * @mbggenerated
     */
    int insert(RoleEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_role
     *
     * @mbggenerated
     */
    int insertSelective(RoleEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_role
     *
     * @mbggenerated
     */
    RoleEntity selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_role
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(RoleEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_role
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(RoleEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_role
     *
     * @mbggenerated Thu Jul 10 11:58:28 JST 2014
     */
    List<RoleEntity> selectByEntity(RoleEntity entity);
}