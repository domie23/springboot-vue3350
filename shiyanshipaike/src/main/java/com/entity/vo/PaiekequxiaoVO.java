package com.entity.vo;

import com.entity.PaiekequxiaoEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 排课取消申请
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("paiekequxiao")
public class PaiekequxiaoVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

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
