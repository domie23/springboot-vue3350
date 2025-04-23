package com.dao;

import com.entity.PaiekequxiaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.PaiekequxiaoView;

/**
 * 排课取消申请 Dao 接口
 *
 * @author 
 */
public interface PaiekequxiaoDao extends BaseMapper<PaiekequxiaoEntity> {

   List<PaiekequxiaoView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
