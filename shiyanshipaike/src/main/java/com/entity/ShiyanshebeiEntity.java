package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 实验设备
 *
 * @author 
 * @email
 */
@TableName("shiyanshebei")
public class ShiyanshebeiEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public ShiyanshebeiEntity() {

	}

	public ShiyanshebeiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @TableField(value = "id")

    private Integer id;


    /**
     * 设备名称
     */
    @TableField(value = "shiyanshebei_name")

    private String shiyanshebeiName;


    /**
     * 设备图片
     */
    @TableField(value = "shiyanshebei_photo")

    private String shiyanshebeiPhoto;


    /**
     * 设备类型
     */
    @TableField(value = "shiyanshebei_types")

    private Integer shiyanshebeiTypes;


    /**
     * 设备数量
     */
    @TableField(value = "shiyanshebei_number")

    private Integer shiyanshebeiNumber;


    /**
     * 实验室
     */
    @TableField(value = "shiyanshi_id")

    private Integer shiyanshiId;


    /**
     * 设备详情
     */
    @TableField(value = "shiyanshebei_content")

    private String shiyanshebeiContent;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：设备名称
	 */
    public String getShiyanshebeiName() {
        return shiyanshebeiName;
    }


    /**
	 * 获取：设备名称
	 */

    public void setShiyanshebeiName(String shiyanshebeiName) {
        this.shiyanshebeiName = shiyanshebeiName;
    }
    /**
	 * 设置：设备图片
	 */
    public String getShiyanshebeiPhoto() {
        return shiyanshebeiPhoto;
    }


    /**
	 * 获取：设备图片
	 */

    public void setShiyanshebeiPhoto(String shiyanshebeiPhoto) {
        this.shiyanshebeiPhoto = shiyanshebeiPhoto;
    }
    /**
	 * 设置：设备类型
	 */
    public Integer getShiyanshebeiTypes() {
        return shiyanshebeiTypes;
    }


    /**
	 * 获取：设备类型
	 */

    public void setShiyanshebeiTypes(Integer shiyanshebeiTypes) {
        this.shiyanshebeiTypes = shiyanshebeiTypes;
    }
    /**
	 * 设置：设备数量
	 */
    public Integer getShiyanshebeiNumber() {
        return shiyanshebeiNumber;
    }


    /**
	 * 获取：设备数量
	 */

    public void setShiyanshebeiNumber(Integer shiyanshebeiNumber) {
        this.shiyanshebeiNumber = shiyanshebeiNumber;
    }
    /**
	 * 设置：实验室
	 */
    public Integer getShiyanshiId() {
        return shiyanshiId;
    }


    /**
	 * 获取：实验室
	 */

    public void setShiyanshiId(Integer shiyanshiId) {
        this.shiyanshiId = shiyanshiId;
    }
    /**
	 * 设置：设备详情
	 */
    public String getShiyanshebeiContent() {
        return shiyanshebeiContent;
    }


    /**
	 * 获取：设备详情
	 */

    public void setShiyanshebeiContent(String shiyanshebeiContent) {
        this.shiyanshebeiContent = shiyanshebeiContent;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Shiyanshebei{" +
            "id=" + id +
            ", shiyanshebeiName=" + shiyanshebeiName +
            ", shiyanshebeiPhoto=" + shiyanshebeiPhoto +
            ", shiyanshebeiTypes=" + shiyanshebeiTypes +
            ", shiyanshebeiNumber=" + shiyanshebeiNumber +
            ", shiyanshiId=" + shiyanshiId +
            ", shiyanshebeiContent=" + shiyanshebeiContent +
            ", createTime=" + createTime +
        "}";
    }
}
