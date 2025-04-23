package com.entity.view;

import com.entity.ShiyanshishenqingEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 实验室申请
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("shiyanshishenqing")
public class ShiyanshishenqingView extends ShiyanshishenqingEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 审核结果的值
		*/
		private String shiyanshishenqingYesnoValue;



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

		//级联表 shiyanshi
			/**
			* 实验室名称
			*/
			private String shiyanshiName;
			/**
			* 实验室图片
			*/
			private String shiyanshiPhoto;
			/**
			* 实验室类型
			*/
			private Integer shiyanshiTypes;
				/**
				* 实验室类型的值
				*/
				private String shiyanshiValue;
			/**
			* 实验室状态
			*/
			private Integer statusTypes;
				/**
				* 实验室状态的值
				*/
				private String statusValue;
			/**
			* 实验室详情
			*/
			private String shiyanshiContent;

	public ShiyanshishenqingView() {

	}

	public ShiyanshishenqingView(ShiyanshishenqingEntity shiyanshishenqingEntity) {
		try {
			BeanUtils.copyProperties(this, shiyanshishenqingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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














				//级联表的get和set shiyanshi
					/**
					* 获取： 实验室名称
					*/
					public String getShiyanshiName() {
						return shiyanshiName;
					}
					/**
					* 设置： 实验室名称
					*/
					public void setShiyanshiName(String shiyanshiName) {
						this.shiyanshiName = shiyanshiName;
					}
					/**
					* 获取： 实验室图片
					*/
					public String getShiyanshiPhoto() {
						return shiyanshiPhoto;
					}
					/**
					* 设置： 实验室图片
					*/
					public void setShiyanshiPhoto(String shiyanshiPhoto) {
						this.shiyanshiPhoto = shiyanshiPhoto;
					}
					/**
					* 获取： 实验室类型
					*/
					public Integer getShiyanshiTypes() {
						return shiyanshiTypes;
					}
					/**
					* 设置： 实验室类型
					*/
					public void setShiyanshiTypes(Integer shiyanshiTypes) {
						this.shiyanshiTypes = shiyanshiTypes;
					}


						/**
						* 获取： 实验室类型的值
						*/
						public String getShiyanshiValue() {
							return shiyanshiValue;
						}
						/**
						* 设置： 实验室类型的值
						*/
						public void setShiyanshiValue(String shiyanshiValue) {
							this.shiyanshiValue = shiyanshiValue;
						}
					/**
					* 获取： 实验室状态
					*/
					public Integer getStatusTypes() {
						return statusTypes;
					}
					/**
					* 设置： 实验室状态
					*/
					public void setStatusTypes(Integer statusTypes) {
						this.statusTypes = statusTypes;
					}


						/**
						* 获取： 实验室状态的值
						*/
						public String getStatusValue() {
							return statusValue;
						}
						/**
						* 设置： 实验室状态的值
						*/
						public void setStatusValue(String statusValue) {
							this.statusValue = statusValue;
						}
					/**
					* 获取： 实验室详情
					*/
					public String getShiyanshiContent() {
						return shiyanshiContent;
					}
					/**
					* 设置： 实验室详情
					*/
					public void setShiyanshiContent(String shiyanshiContent) {
						this.shiyanshiContent = shiyanshiContent;
					}










}
