package com.itrug.mobile.service;

import com.itrug.mobile.model.Mobile;

import java.io.Serializable;
import java.util.List;


public interface GenericService<T, Type extends Serializable> {
    /**
     * 根据id查询实体
     *
     * @param id
     * @return
     */
    T get(Type id);

    /**
     * 查询所有实体
     *
     * @return
     */
    List<T> findAll();

    /**
     * 保存实体
     *
     * @param entity
     * @return
     */
    T save(T entity);

    /**
     * 更新实体
     *
     * @param entity
     * @return
     */
    T update(T entity);

    /**
     * 删除实体
     *
     * @param id
     */
    void delete(Type id);
}
