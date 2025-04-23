package com.entity.model;

import com.entity.KechengEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 课程信息
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class KechengModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 实验室
     */
    private Integer shiyanshishenqingId;


    /**
     * 课程名称
     */
    private String kechengName;


    /**
     * 课程图片
     */
    private String kechengPhoto;


    /**
     * 上课时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date shangkeTime;


    /**
     * 结束时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date xiakeTime;


    /**
     * 课程类型
     */
    private Integer kechengTypes;


    /**
     * 班级
     */
    private Integer banjiTypes;


    /**
     * 学期
     */
    private Integer xueqiTypes;


    /**
     * 星期
     */
    private Integer xingqiTypes;


    /**
     * 第几节
     */
    private Integer jiekeTypes;


    /**
     * 教师
     */
    private Integer jiaoshiId;


    /**
     * 课程审核
     */
    private Integer kechengYesnoTypes;


    /**
     * 审核原因
     */
    private String kechengYesnoText;


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
	 * 获取：实验室
	 */
    public Integer getShiyanshishenqingId() {
        return shiyanshishenqingId;
    }


    /**
	 * 设置：实验室
	 */
    public void setShiyanshishenqingId(Integer shiyanshishenqingId) {
        this.shiyanshishenqingId = shiyanshishenqingId;
    }
    /**
	 * 获取：课程名称
	 */
    public String getKechengName() {
        return kechengName;
    }


    /**
	 * 设置：课程名称
	 */
    public void setKechengName(String kechengName) {
        this.kechengName = kechengName;
    }
    /**
	 * 获取：课程图片
	 */
    public String getKechengPhoto() {
        return kechengPhoto;
    }


    /**
	 * 设置：课程图片
	 */
    public void setKechengPhoto(String kechengPhoto) {
        this.kechengPhoto = kechengPhoto;
    }
    /**
	 * 获取：上课时间
	 */
    public Date getShangkeTime() {
        return shangkeTime;
    }


    /**
	 * 设置：上课时间
	 */
    public void setShangkeTime(Date shangkeTime) {
        this.shangkeTime = shangkeTime;
    }
    /**
	 * 获取：结束时间
	 */
    public Date getXiakeTime() {
        return xiakeTime;
    }


    /**
	 * 设置：结束时间
	 */
    public void setXiakeTime(Date xiakeTime) {
        this.xiakeTime = xiakeTime;
    }
    /**
	 * 获取：课程类型
	 */
    public Integer getKechengTypes() {
        return kechengTypes;
    }


    /**
	 * 设置：课程类型
	 */
    public void setKechengTypes(Integer kechengTypes) {
        this.kechengTypes = kechengTypes;
    }
    /**
	 * 获取：班级
	 */
    public Integer getBanjiTypes() {
        return banjiTypes;
    }


    /**
	 * 设置：班级
	 */
    public void setBanjiTypes(Integer banjiTypes) {
        this.banjiTypes = banjiTypes;
    }
    /**
	 * 获取：学期
	 */
    public Integer getXueqiTypes() {
        return xueqiTypes;
    }


    /**
	 * 设置：学期
	 */
    public void setXueqiTypes(Integer xueqiTypes) {
        this.xueqiTypes = xueqiTypes;
    }
    /**
	 * 获取：星期
	 */
    public Integer getXingqiTypes() {
        return xingqiTypes;
    }


    /**
	 * 设置：星期
	 */
    public void setXingqiTypes(Integer xingqiTypes) {
        this.xingqiTypes = xingqiTypes;
    }
    /**
	 * 获取：第几节
	 */
    public Integer getJiekeTypes() {
        return jiekeTypes;
    }


    /**
	 * 设置：第几节
	 */
    public void setJiekeTypes(Integer jiekeTypes) {
        this.jiekeTypes = jiekeTypes;
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
	 * 获取：课程审核
	 */
    public Integer getKechengYesnoTypes() {
        return kechengYesnoTypes;
    }


    /**
	 * 设置：课程审核
	 */
    public void setKechengYesnoTypes(Integer kechengYesnoTypes) {
        this.kechengYesnoTypes = kechengYesnoTypes;
    }
    /**
	 * 获取：审核原因
	 */
    public String getKechengYesnoText() {
        return kechengYesnoText;
    }


    /**
	 * 设置：审核原因
	 */
    public void setKechengYesnoText(String kechengYesnoText) {
        this.kechengYesnoText = kechengYesnoText;
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
