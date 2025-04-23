package com.entity.view;

import com.entity.KechengEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 课程信息
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("kecheng")
public class KechengView extends KechengEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 课程类型的值
		*/
		private String kechengValue;
		/**
		* 班级的值
		*/
		private String banjiValue;
		/**
		* 学期的值
		*/
		private String xueqiValue;
		/**
		* 星期的值
		*/
		private String xingqiValue;
		/**
		* 第几节的值
		*/
		private String jiekeValue;
		/**
		* 课程审核的值
		*/
		private String kechengYesnoValue;



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

		//级联表 shiyanshishenqing
			/**
			* 实验室申请 的 教师
			*/
			private Integer shiyanshishenqingJiaoshiId;
			/**
			* 审核结果
			*/
			private Integer shiyanshishenqingYesnoTypes;
				/**
				* 审核结果的值
				*/
				private String shiyanshishenqingYesnoValue;
			/**
			* 审核原因
			*/
			private String shiyanshishenqingYesnoText;

	public KechengView() {

	}

	public KechengView(KechengEntity kechengEntity) {
		try {
			BeanUtils.copyProperties(this, kechengEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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

















				//级联表的get和set shiyanshishenqing

					/**
					* 获取：实验室申请 的 教师
					*/
					public Integer getShiyanshishenqingJiaoshiId() {
						return shiyanshishenqingJiaoshiId;
					}
					/**
					* 设置：实验室申请 的 教师
					*/
					public void setShiyanshishenqingJiaoshiId(Integer shiyanshishenqingJiaoshiId) {
						this.shiyanshishenqingJiaoshiId = shiyanshishenqingJiaoshiId;
					}

					/**
					* 获取： 审核结果
					*/
					public Integer getShiyanshishenqingYesnoTypes() {
						return shiyanshishenqingYesnoTypes;
					}
					/**
					* 设置： 审核结果
					*/
					public void setShiyanshishenqingYesnoTypes(Integer shiyanshishenqingYesnoTypes) {
						this.shiyanshishenqingYesnoTypes = shiyanshishenqingYesnoTypes;
					}


						/**
						* 获取： 审核结果的值
						*/
						public String getShiyanshishenqingYesnoValue() {
							return shiyanshishenqingYesnoValue;
						}
						/**
						* 设置： 审核结果的值
						*/
						public void setShiyanshishenqingYesnoValue(String shiyanshishenqingYesnoValue) {
							this.shiyanshishenqingYesnoValue = shiyanshishenqingYesnoValue;
						}
					/**
					* 获取： 审核原因
					*/
					public String getShiyanshishenqingYesnoText() {
						return shiyanshishenqingYesnoText;
					}
					/**
					* 设置： 审核原因
					*/
					public void setShiyanshishenqingYesnoText(String shiyanshishenqingYesnoText) {
						this.shiyanshishenqingYesnoText = shiyanshishenqingYesnoText;
					}







}
