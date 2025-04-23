package com.entity.view;

import com.entity.PaiekequxiaoEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 排课取消申请
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("paiekequxiao")
public class PaiekequxiaoView extends PaiekequxiaoEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 排课取消审核的值
		*/
		private String paiekequxiaoYesnoValue;



		//级联表 jiaoshi
			/**
			* 工号
			*/
			private String jiaoshiUuidNumber;
			/**
			* 教师姓名
			*/
			private String jiaoshiName;
			/**
			* 头像
			*/
			private String jiaoshiPhoto;
			/**
			* 联系方式
			*/
			private String jiaoshiPhone;
			/**
			* 邮箱
			*/
			private String jiaoshiEmail;
			/**
			* 假删
			*/
			private Integer jiaoshiDelete;

		//级联表 kecheng
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
				* 课程类型的值
				*/
				private String kechengValue;
			/**
			* 班级
			*/
			private Integer banjiTypes;
				/**
				* 班级的值
				*/
				private String banjiValue;
			/**
			* 学期
			*/
			private Integer xueqiTypes;
				/**
				* 学期的值
				*/
				private String xueqiValue;
			/**
			* 星期
			*/
			private Integer xingqiTypes;
				/**
				* 星期的值
				*/
				private String xingqiValue;
			/**
			* 第几节
			*/
			private Integer jiekeTypes;
				/**
				* 第几节的值
				*/
				private String jiekeValue;
			/**
			* 课程信息 的 教师
			*/
			private Integer kechengJiaoshiId;
			/**
			* 课程审核
			*/
			private Integer kechengYesnoTypes;
				/**
				* 课程审核的值
				*/
				private String kechengYesnoValue;
			/**
			* 审核原因
			*/
			private String kechengYesnoText;
			/**
			* 课程详情
			*/
			private String kechengContent;

	public PaiekequxiaoView() {

	}

	public PaiekequxiaoView(PaiekequxiaoEntity paiekequxiaoEntity) {
		try {
			BeanUtils.copyProperties(this, paiekequxiaoEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 排课取消审核的值
			*/
			public String getPaiekequxiaoYesnoValue() {
				return paiekequxiaoYesnoValue;
			}
			/**
			* 设置： 排课取消审核的值
			*/
			public void setPaiekequxiaoYesnoValue(String paiekequxiaoYesnoValue) {
				this.paiekequxiaoYesnoValue = paiekequxiaoYesnoValue;
			}







				//级联表的get和set jiaoshi
					/**
					* 获取： 工号
					*/
					public String getJiaoshiUuidNumber() {
						return jiaoshiUuidNumber;
					}
					/**
					* 设置： 工号
					*/
					public void setJiaoshiUuidNumber(String jiaoshiUuidNumber) {
						this.jiaoshiUuidNumber = jiaoshiUuidNumber;
					}
					/**
					* 获取： 教师姓名
					*/
					public String getJiaoshiName() {
						return jiaoshiName;
					}
					/**
					* 设置： 教师姓名
					*/
					public void setJiaoshiName(String jiaoshiName) {
						this.jiaoshiName = jiaoshiName;
					}
					/**
					* 获取： 头像
					*/
					public String getJiaoshiPhoto() {
						return jiaoshiPhoto;
					}
					/**
					* 设置： 头像
					*/
					public void setJiaoshiPhoto(String jiaoshiPhoto) {
						this.jiaoshiPhoto = jiaoshiPhoto;
					}
					/**
					* 获取： 联系方式
					*/
					public String getJiaoshiPhone() {
						return jiaoshiPhone;
					}
					/**
					* 设置： 联系方式
					*/
					public void setJiaoshiPhone(String jiaoshiPhone) {
						this.jiaoshiPhone = jiaoshiPhone;
					}
					/**
					* 获取： 邮箱
					*/
					public String getJiaoshiEmail() {
						return jiaoshiEmail;
					}
					/**
					* 设置： 邮箱
					*/
					public void setJiaoshiEmail(String jiaoshiEmail) {
						this.jiaoshiEmail = jiaoshiEmail;
					}
					/**
					* 获取： 假删
					*/
					public Integer getJiaoshiDelete() {
						return jiaoshiDelete;
					}
					/**
					* 设置： 假删
					*/
					public void setJiaoshiDelete(Integer jiaoshiDelete) {
						this.jiaoshiDelete = jiaoshiDelete;
					}




				//级联表的get和set kecheng

					/**
					* 获取： 课程名称
					*/
					public String getKechengName() {
						return kechengName;
					}
					/**
					* 设置： 课程名称
					*/
					public void setKechengName(String kechengName) {
						this.kechengName = kechengName;
					}
					/**
					* 获取： 课程图片
					*/
					public String getKechengPhoto() {
						return kechengPhoto;
					}
					/**
					* 设置： 课程图片
					*/
					public void setKechengPhoto(String kechengPhoto) {
						this.kechengPhoto = kechengPhoto;
					}
					/**
					* 获取： 上课时间
					*/
					public Date getShangkeTime() {
						return shangkeTime;
					}
					/**
					* 设置： 上课时间
					*/
					public void setShangkeTime(Date shangkeTime) {
						this.shangkeTime = shangkeTime;
					}
					/**
					* 获取： 结束时间
					*/
					public Date getXiakeTime() {
						return xiakeTime;
					}
					/**
					* 设置： 结束时间
					*/
					public void setXiakeTime(Date xiakeTime) {
						this.xiakeTime = xiakeTime;
					}
					/**
					* 获取： 课程类型
					*/
					public Integer getKechengTypes() {
						return kechengTypes;
					}
					/**
					* 设置： 课程类型
					*/
					public void setKechengTypes(Integer kechengTypes) {
						this.kechengTypes = kechengTypes;
					}


						/**
						* 获取： 课程类型的值
						*/
						public String getKechengValue() {
							return kechengValue;
						}
						/**
						* 设置： 课程类型的值
						*/
						public void setKechengValue(String kechengValue) {
							this.kechengValue = kechengValue;
						}
					/**
					* 获取： 班级
					*/
					public Integer getBanjiTypes() {
						return banjiTypes;
					}
					/**
					* 设置： 班级
					*/
					public void setBanjiTypes(Integer banjiTypes) {
						this.banjiTypes = banjiTypes;
					}


						/**
						* 获取： 班级的值
						*/
						public String getBanjiValue() {
							return banjiValue;
						}
						/**
						* 设置： 班级的值
						*/
						public void setBanjiValue(String banjiValue) {
							this.banjiValue = banjiValue;
						}
					/**
					* 获取： 学期
					*/
					public Integer getXueqiTypes() {
						return xueqiTypes;
					}
					/**
					* 设置： 学期
					*/
					public void setXueqiTypes(Integer xueqiTypes) {
						this.xueqiTypes = xueqiTypes;
					}


						/**
						* 获取： 学期的值
						*/
						public String getXueqiValue() {
							return xueqiValue;
						}
						/**
						* 设置： 学期的值
						*/
						public void setXueqiValue(String xueqiValue) {
							this.xueqiValue = xueqiValue;
						}
					/**
					* 获取： 星期
					*/
					public Integer getXingqiTypes() {
						return xingqiTypes;
					}
					/**
					* 设置： 星期
					*/
					public void setXingqiTypes(Integer xingqiTypes) {
						this.xingqiTypes = xingqiTypes;
					}


						/**
						* 获取： 星期的值
						*/
						public String getXingqiValue() {
							return xingqiValue;
						}
						/**
						* 设置： 星期的值
						*/
						public void setXingqiValue(String xingqiValue) {
							this.xingqiValue = xingqiValue;
						}
					/**
					* 获取： 第几节
					*/
					public Integer getJiekeTypes() {
						return jiekeTypes;
					}
					/**
					* 设置： 第几节
					*/
					public void setJiekeTypes(Integer jiekeTypes) {
						this.jiekeTypes = jiekeTypes;
					}


						/**
						* 获取： 第几节的值
						*/
						public String getJiekeValue() {
							return jiekeValue;
						}
						/**
						* 设置： 第几节的值
						*/
						public void setJiekeValue(String jiekeValue) {
							this.jiekeValue = jiekeValue;
						}
					/**
					* 获取：课程信息 的 教师
					*/
					public Integer getKechengJiaoshiId() {
						return kechengJiaoshiId;
					}
					/**
					* 设置：课程信息 的 教师
					*/
					public void setKechengJiaoshiId(Integer kechengJiaoshiId) {
						this.kechengJiaoshiId = kechengJiaoshiId;
					}

					/**
					* 获取： 课程审核
					*/
					public Integer getKechengYesnoTypes() {
						return kechengYesnoTypes;
					}
					/**
					* 设置： 课程审核
					*/
					public void setKechengYesnoTypes(Integer kechengYesnoTypes) {
						this.kechengYesnoTypes = kechengYesnoTypes;
					}


						/**
						* 获取： 课程审核的值
						*/
						public String getKechengYesnoValue() {
							return kechengYesnoValue;
						}
						/**
						* 设置： 课程审核的值
						*/
						public void setKechengYesnoValue(String kechengYesnoValue) {
							this.kechengYesnoValue = kechengYesnoValue;
						}
					/**
					* 获取： 审核原因
					*/
					public String getKechengYesnoText() {
						return kechengYesnoText;
					}
					/**
					* 设置： 审核原因
					*/
					public void setKechengYesnoText(String kechengYesnoText) {
						this.kechengYesnoText = kechengYesnoText;
					}
					/**
					* 获取： 课程详情
					*/
					public String getKechengContent() {
						return kechengContent;
					}
					/**
					* 设置： 课程详情
					*/
					public void setKechengContent(String kechengContent) {
						this.kechengContent = kechengContent;
					}





















}
