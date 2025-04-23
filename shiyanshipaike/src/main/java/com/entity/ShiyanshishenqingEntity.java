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
 * 实验室申请
 *
 * @author 
 * @email
 */
@TableName("shiyanshishenqing")
public class ShiyanshishenqingEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public ShiyanshishenqingEntity() {

	}

	public ShiyanshishenqingEntity(T t) {
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
     * 实验室
     */
    @TableField(value = "shiyanshi_id")

    private Integer shiyanshiId;


    /**
     * 教师
     */
    @TableField(value = "jiaoshi_id")

    private Integer jiaoshiId;


    /**
     * 审核结果
     */
    @TableField(value = "shiyanshishenqing_yesno_types")

    private Integer shiyanshishenqingYesnoTypes;


    /**
     * 审核原因
     */
    @TableField(value = "shiyanshishenqing_yesno_text")

    private String shiyanshishenqingYesnoText;


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
	 * 设置：教师
	 */
    public Integer getJiaoshiId() {
        return jiaoshiId;
    }


    /**
	 * 获取：教师
	 */

    public void setJiaoshiId(Integer jiaoshiId) {
        this.jiaoshiId = jiaoshiId;
    }
    /**
	 * 设置：审核结果
	 */
    public Integer getShiyanshishenqingYesnoTypes() {
        return shiyanshishenqingYesnoTypes;
    }


    /**
	 * 获取：审核结果
	 */

    public void setShiyanshishenqingYesnoTypes(Integer shiyanshishenqingYesnoTypes) {
        this.shiyanshishenqingYesnoTypes = shiyanshishenqingYesnoTypes;
    }
    /**
	 * 设置：审核原因
	 */
    public String getShiyanshishenqingYesnoText() {
        return shiyanshishenqingYesnoText;
    }


    /**
	 * 获取：审核原因
	 */

    public void setShiyanshishenqingYesnoText(String shiyanshishenqingYesnoText) {
        this.shiyanshishenqingYesnoText = shiyanshishenqingYesnoText;
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
        return "Shiyanshishenqing{" +
            "id=" + id +
            ", shiyanshiId=" + shiyanshiId +
            ", jiaoshiId=" + jiaoshiId +
            ", shiyanshishenqingYesnoTypes=" + shiyanshishenqingYesnoTypes +
            ", shiyanshishenqingYesnoText=" + shiyanshishenqingYesnoText +
            ", createTime=" + createTime +
        "}";
    }
}
