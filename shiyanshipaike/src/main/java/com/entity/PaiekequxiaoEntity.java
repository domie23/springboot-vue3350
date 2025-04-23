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
 * 排课取消申请
 *
 * @author 
 * @email
 */
@TableName("paiekequxiao")
public class PaiekequxiaoEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public PaiekequxiaoEntity() {

	}

	public PaiekequxiaoEntity(T t) {
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
     * 教师
     */
    @TableField(value = "jiaoshi_id")

    private Integer jiaoshiId;


    /**
     * 课程
     */
    @TableField(value = "kecheng_id")

    private Integer kechengId;


    /**
     * 排课取消审核
     */
    @TableField(value = "paiekequxiao_yesno_types")

    private Integer paiekequxiaoYesnoTypes;


    /**
     * 审核原因
     */
    @TableField(value = "paiekequxiao_yesno_text")

    private String paiekequxiaoYesnoText;


    /**
     * 课程详情
     */
    @TableField(value = "kecheng_content")

    private String kechengContent;


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
	 * 设置：课程
	 */
    public Integer getKechengId() {
        return kechengId;
    }


    /**
	 * 获取：课程
	 */

    public void setKechengId(Integer kechengId) {
        this.kechengId = kechengId;
    }
    /**
	 * 设置：排课取消审核
	 */
    public Integer getPaiekequxiaoYesnoTypes() {
        return paiekequxiaoYesnoTypes;
    }


    /**
	 * 获取：排课取消审核
	 */

    public void setPaiekequxiaoYesnoTypes(Integer paiekequxiaoYesnoTypes) {
        this.paiekequxiaoYesnoTypes = paiekequxiaoYesnoTypes;
    }
    /**
	 * 设置：审核原因
	 */
    public String getPaiekequxiaoYesnoText() {
        return paiekequxiaoYesnoText;
    }


    /**
	 * 获取：审核原因
	 */

    public void setPaiekequxiaoYesnoText(String paiekequxiaoYesnoText) {
        this.paiekequxiaoYesnoText = paiekequxiaoYesnoText;
    }
    /**
	 * 设置：课程详情
	 */
    public String getKechengContent() {
        return kechengContent;
    }


    /**
	 * 获取：课程详情
	 */

    public void setKechengContent(String kechengContent) {
        this.kechengContent = kechengContent;
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
        return "Paiekequxiao{" +
            "id=" + id +
            ", jiaoshiId=" + jiaoshiId +
            ", kechengId=" + kechengId +
            ", paiekequxiaoYesnoTypes=" + paiekequxiaoYesnoTypes +
            ", paiekequxiaoYesnoText=" + paiekequxiaoYesnoText +
            ", kechengContent=" + kechengContent +
            ", createTime=" + createTime +
        "}";
    }
}
