package com.entity.vo;

import com.entity.KechengEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 课程信息
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("kecheng")
public class KechengVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 实验室
     */

    @TableField(value = "shiyanshishenqing_id")
    private Integer shiyanshishenqingId;


    /**
     * 课程名称
     */

    @TableField(value = "kecheng_name")
    private String kechengName;


    /**
     * 课程图片
     */

    @TableField(value = "kecheng_photo")
    private String kechengPhoto;


    /**
     * 上课时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "shangke_time")
    private Date shangkeTime;


    /**
     * 结束时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "xiake_time")
    private Date xiakeTime;


    /**
     * 课程类型
     */

    @TableField(value = "kecheng_types")
    private Integer kechengTypes;


    /**
     * 班级
     */

    @TableField(value = "banji_types")
    private Integer banjiTypes;


    /**
     * 学期
     */

    @TableField(value = "xueqi_types")
    private Integer xueqiTypes;


    /**
     * 星期
     */

    @TableField(value = "xingqi_types")
    private Integer xingqiTypes;


    /**
     * 第几节
     */

    @TableField(value = "jieke_types")
    private Integer jiekeTypes;


    /**
     * 教师
     */

    @TableField(value = "jiaoshi_id")
    private Integer jiaoshiId;


    /**
     * 课程审核
     */

    @TableField(value = "kecheng_yesno_types")
    private Integer kechengYesnoTypes;


    /**
     * 审核原因
     */

    @TableField(value = "kecheng_yesno_text")
    private String kechengYesnoText;


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
	 * 设置：实验室
	 */
    public Integer getShiyanshishenqingId() {
        return shiyanshishenqingId;
    }


    /**
	 * 获取：实验室
	 */

    public void setShiyanshishenqingId(Integer shiyanshishenqingId) {
        this.shiyanshishenqingId = shiyanshishenqingId;
    }
    /**
	 * 设置：课程名称
	 */
    public String getKechengName() {
        return kechengName;
    }


    /**
	 * 获取：课程名称
	 */

    public void setKechengName(String kechengName) {
        this.kechengName = kechengName;
    }
    /**
	 * 设置：课程图片
	 */
    public String getKechengPhoto() {
        return kechengPhoto;
    }


    /**
	 * 获取：课程图片
	 */

    public void setKechengPhoto(String kechengPhoto) {
        this.kechengPhoto = kechengPhoto;
    }
    /**
	 * 设置：上课时间
	 */
    public Date getShangkeTime() {
        return shangkeTime;
    }


    /**
	 * 获取：上课时间
	 */

    public void setShangkeTime(Date shangkeTime) {
        this.shangkeTime = shangkeTime;
    }
    /**
	 * 设置：结束时间
	 */
    public Date getXiakeTime() {
        return xiakeTime;
    }


    /**
	 * 获取：结束时间
	 */

    public void setXiakeTime(Date xiakeTime) {
        this.xiakeTime = xiakeTime;
    }
    /**
	 * 设置：课程类型
	 */
    public Integer getKechengTypes() {
        return kechengTypes;
    }


    /**
	 * 获取：课程类型
	 */

    public void setKechengTypes(Integer kechengTypes) {
        this.kechengTypes = kechengTypes;
    }
    /**
	 * 设置：班级
	 */
    public Integer getBanjiTypes() {
        return banjiTypes;
    }


    /**
	 * 获取：班级
	 */

    public void setBanjiTypes(Integer banjiTypes) {
        this.banjiTypes = banjiTypes;
    }
    /**
	 * 设置：学期
	 */
    public Integer getXueqiTypes() {
        return xueqiTypes;
    }


    /**
	 * 获取：学期
	 */

    public void setXueqiTypes(Integer xueqiTypes) {
        this.xueqiTypes = xueqiTypes;
    }
    /**
	 * 设置：星期
	 */
    public Integer getXingqiTypes() {
        return xingqiTypes;
    }


    /**
	 * 获取：星期
	 */

    public void setXingqiTypes(Integer xingqiTypes) {
        this.xingqiTypes = xingqiTypes;
    }
    /**
	 * 设置：第几节
	 */
    public Integer getJiekeTypes() {
        return jiekeTypes;
    }


    /**
	 * 获取：第几节
	 */

    public void setJiekeTypes(Integer jiekeTypes) {
        this.jiekeTypes = jiekeTypes;
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
	 * 设置：课程审核
	 */
    public Integer getKechengYesnoTypes() {
        return kechengYesnoTypes;
    }


    /**
	 * 获取：课程审核
	 */

    public void setKechengYesnoTypes(Integer kechengYesnoTypes) {
        this.kechengYesnoTypes = kechengYesnoTypes;
    }
    /**
	 * 设置：审核原因
	 */
    public String getKechengYesnoText() {
        return kechengYesnoText;
    }


    /**
	 * 获取：审核原因
	 */

    public void setKechengYesnoText(String kechengYesnoText) {
        this.kechengYesnoText = kechengYesnoText;
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
