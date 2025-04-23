package com.entity.model;

import com.entity.PaiekequxiaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 排课取消申请
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class PaiekequxiaoModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 教师
     */
    private Integer jiaoshiId;


    /**
     * 课程
     */
    private Integer kechengId;


    /**
     * 排课取消审核
     */
    private Integer paiekequxiaoYesnoTypes;


    /**
     * 审核原因
     */
    private String paiekequxiaoYesnoText;


    /**
     * 课程详情
     */
    private String kechengContent;


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
	 * 获取：课程
	 */
    public Integer getKechengId() {
        return kechengId;
    }


    /**
	 * 设置：课程
	 */
    public void setKechengId(Integer kechengId) {
        this.kechengId = kechengId;
    }
    /**
	 * 获取：排课取消审核
	 */
    public Integer getPaiekequxiaoYesnoTypes() {
        return paiekequxiaoYesnoTypes;
    }


    /**
	 * 设置：排课取消审核
	 */
    public void setPaiekequxiaoYesnoTypes(Integer paiekequxiaoYesnoTypes) {
        this.paiekequxiaoYesnoTypes = paiekequxiaoYesnoTypes;
    }
    /**
	 * 获取：审核原因
	 */
    public String getPaiekequxiaoYesnoText() {
        return paiekequxiaoYesnoText;
    }


    /**
	 * 设置：审核原因
	 */
    public void setPaiekequxiaoYesnoText(String paiekequxiaoYesnoText) {
        this.paiekequxiaoYesnoText = paiekequxiaoYesnoText;
    }
    /**
	 * 获取：课程详情
	 */
    public String getKechengContent() {
        return kechengContent;
    }


    /**
	 * 设置：课程详情
	 */
    public void setKechengContent(String kechengContent) {
        this.kechengContent = kechengContent;
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
