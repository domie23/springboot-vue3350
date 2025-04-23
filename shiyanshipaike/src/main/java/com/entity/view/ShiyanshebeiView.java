package com.entity.view;

import com.entity.ShiyanshebeiEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 实验设备
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("shiyanshebei")
public class ShiyanshebeiView extends ShiyanshebeiEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 设备类型的值
		*/
		private String shiyanshebeiValue;



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

	public ShiyanshebeiView() {

	}

	public ShiyanshebeiView(ShiyanshebeiEntity shiyanshebeiEntity) {
		try {
			BeanUtils.copyProperties(this, shiyanshebeiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 设备类型的值
			*/
			public String getShiyanshebeiValue() {
				return shiyanshebeiValue;
			}
			/**
			* 设置： 设备类型的值
			*/
			public void setShiyanshebeiValue(String shiyanshebeiValue) {
				this.shiyanshebeiValue = shiyanshebeiValue;
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
