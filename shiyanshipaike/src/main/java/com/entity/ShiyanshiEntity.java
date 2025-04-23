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
 * 实验室信息
 *
 * @author 
 * @email
 */
@TableName("shiyanshi")
public class ShiyanshiEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public ShiyanshiEntity() {

	}

	public ShiyanshiEntity(T t) {
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
     * 实验室名称
     */
    @TableField(value = "shiyanshi_name")

    private String shiyanshiName;


    /**
     * 实验室图片
     */
    @TableField(value = "shiyanshi_photo")

    private String shiyanshiPhoto;


    /**
     * 实验室类型
     */
    @TableField(value = "shiyanshi_types")

    private Integer shiyanshiTypes;


    /**
     * 实验室状态
     */
    @TableField(value = "status_types")

    private Integer statusTypes;


    /**
     * 实验室详情
     */
    @TableField(value = "shiyanshi_content")

    private String shiyanshiContent;


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
	 * 设置：实验室名称
	 */
    public String getShiyanshiName() {
        return shiyanshiName;
    }


    /**
	 * 获取：实验室名称
	 */

    public void setShiyanshiName(String shiyanshiName) {
        this.shiyanshiName = shiyanshiName;
    }
    /**
	 * 设置：实验室图片
	 */
    public String getShiyanshiPhoto() {
        return shiyanshiPhoto;
    }


    /**
	 * 获取：实验室图片
	 */

    public void setShiyanshiPhoto(String shiyanshiPhoto) {
        this.shiyanshiPhoto = shiyanshiPhoto;
    }
    /**
	 * 设置：实验室类型
	 */
    public Integer getShiyanshiTypes() {
        return shiyanshiTypes;
    }


    /**
	 * 获取：实验室类型
	 */

    public void setShiyanshiTypes(Integer shiyanshiTypes) {
        this.shiyanshiTypes = shiyanshiTypes;
    }
    /**
	 * 设置：实验室状态
	 */
    public Integer getStatusTypes() {
        return statusTypes;
    }


    /**
	 * 获取：实验室状态
	 */

    public void setStatusTypes(Integer statusTypes) {
        this.statusTypes = statusTypes;
    }
    /**
	 * 设置：实验室详情
	 */
    public String getShiyanshiContent() {
        return shiyanshiContent;
    }


    /**
	 * 获取：实验室详情
	 */

    public void setShiyanshiContent(String shiyanshiContent) {
        this.shiyanshiContent = shiyanshiContent;
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
        return "Shiyanshi{" +
            "id=" + id +
            ", shiyanshiName=" + shiyanshiName +
            ", shiyanshiPhoto=" + shiyanshiPhoto +
            ", shiyanshiTypes=" + shiyanshiTypes +
            ", statusTypes=" + statusTypes +
            ", shiyanshiContent=" + shiyanshiContent +
            ", createTime=" + createTime +
        "}";
    }
}
