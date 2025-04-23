package com.entity.vo;

import com.entity.ShiyanshishenqingEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 实验室申请
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("shiyanshishenqing")
public class ShiyanshishenqingVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

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
     * 创建时间 show1 show2 photoShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
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
	 * 设置：创建时间 show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间 show1 show2 photoShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
