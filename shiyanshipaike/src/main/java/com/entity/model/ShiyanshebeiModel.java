package com.entity.model;

import com.entity.ShiyanshebeiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 实验设备
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class ShiyanshebeiModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 设备名称
     */
    private String shiyanshebeiName;


    /**
     * 设备图片
     */
    private String shiyanshebeiPhoto;


    /**
     * 设备类型
     */
    private Integer shiyanshebeiTypes;


    /**
     * 设备数量
     */
    private Integer shiyanshebeiNumber;


    /**
     * 实验室
     */
    private Integer shiyanshiId;


    /**
     * 设备详情
     */
    private String shiyanshebeiContent;


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
	 * 获取：设备名称
	 */
    public String getShiyanshebeiName() {
        return shiyanshebeiName;
    }


    /**
	 * 设置：设备名称
	 */
    public void setShiyanshebeiName(String shiyanshebeiName) {
        this.shiyanshebeiName = shiyanshebeiName;
    }
    /**
	 * 获取：设备图片
	 */
    public String getShiyanshebeiPhoto() {
        return shiyanshebeiPhoto;
    }


    /**
	 * 设置：设备图片
	 */
    public void setShiyanshebeiPhoto(String shiyanshebeiPhoto) {
        this.shiyanshebeiPhoto = shiyanshebeiPhoto;
    }
    /**
	 * 获取：设备类型
	 */
    public Integer getShiyanshebeiTypes() {
        return shiyanshebeiTypes;
    }


    /**
	 * 设置：设备类型
	 */
    public void setShiyanshebeiTypes(Integer shiyanshebeiTypes) {
        this.shiyanshebeiTypes = shiyanshebeiTypes;
    }
    /**
	 * 获取：设备数量
	 */
    public Integer getShiyanshebeiNumber() {
        return shiyanshebeiNumber;
    }


    /**
	 * 设置：设备数量
	 */
    public void setShiyanshebeiNumber(Integer shiyanshebeiNumber) {
        this.shiyanshebeiNumber = shiyanshebeiNumber;
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
	 * 获取：设备详情
	 */
    public String getShiyanshebeiContent() {
        return shiyanshebeiContent;
    }


    /**
	 * 设置：设备详情
	 */
    public void setShiyanshebeiContent(String shiyanshebeiContent) {
        this.shiyanshebeiContent = shiyanshebeiContent;
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
