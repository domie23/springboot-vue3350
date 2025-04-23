package com.entity.vo;

import com.entity.ShiyanshebeiEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 实验设备
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("shiyanshebei")
public class ShiyanshebeiVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

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
