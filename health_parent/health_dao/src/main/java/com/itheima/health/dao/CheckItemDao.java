package com.itheima.health.dao;

import com.itheima.health.pojo.CheckItem;
import org.apache.poi.ss.formula.functions.T;

import java.util.List;

public interface CheckItemDao {
    List<CheckItem> findAll();
}
