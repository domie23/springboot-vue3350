package com.entity.model;

import com.entity.ShiyanshishenqingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 实验室申请
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class ShiyanshishenqingModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 实验室
     */
    private Integer shiyanshiId;


    /**
     * 教师
     */
    private Integer jiaoshiId;


    /**
     * 审核结果
     */
    private Integer shiyanshishenqingYesnoTypes;


    /**
     * 审核原因
     */
    private String shiyanshishenqingYesnoText;


    /**
     * 创建时间 show1 show2 photoShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：实验室
	 */
    public Integer getShiyanshiId() {
        return shiyanshiId;
    }


    /**
	 * 设置：实验室
	 */
    public void setShiyanshiId(Integer shiyanshiId) {
        this.shiyanshiId = shiyanshiId;
    }
    /**
	 * 获取：教师
	 */
    public Integer getJiaoshiId() {
        return jiaoshiId;
    }


    /**
	 * 设置：教师
	 */
    public void setJiaoshiId(Integer jiaoshiId) {
        this.jiaoshiId = jiaoshiId;
    }
    /**
	 * 获取：审核结果
	 */
    public Integer getShiyanshishenqingYesnoTypes() {
        return shiyanshishenqingYesnoTypes;
    }


    /**
	 * 设置：审核结果
	 */
    public void setShiyanshishenqingYesnoTypes(Integer shiyanshishenqingYesnoTypes) {
        this.shiyanshishenqingYesnoTypes = shiyanshishenqingYesnoTypes;
    }
    /**
	 * 获取：审核原因
	 */
    public String getShiyanshishenqingYesnoText() {
        return shiyanshishenqingYesnoText;
    }


    /**
	 * 设置：审核原因
	 */
    public void setShiyanshishenqingYesnoText(String shiyanshishenqingYesnoText) {
        this.shiyanshishenqingYesnoText = shiyanshishenqingYesnoText;
    }
    /**
	 * 获取：创建时间 show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间 show1 show2 photoShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
