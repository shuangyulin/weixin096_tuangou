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
 * 商品评价
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-04-03 16:44:21
 */
@TableName("shangpinpingjia")
public class ShangpinpingjiaEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ShangpinpingjiaEntity() {
		
	}
	
	public ShangpinpingjiaEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 评论标题
	 */
					
	private String pinglunbiaoti;
	
	/**
	 * 商品名称
	 */
					
	private String shangpinmingcheng;
	
	/**
	 * 商铺名称
	 */
					
	private String shangpumingcheng;
	
	/**
	 * 会员账号
	 */
					
	private String huiyuanzhanghao;
	
	/**
	 * 会员姓名
	 */
					
	private String huiyuanxingming;
	
	/**
	 * 商品评价
	 */
					
	private String shangpinpingjia;
	
	/**
	 * 商品图片
	 */
					
	private String shangpintupian;
	
	/**
	 * 商家回复
	 */
					
	private String shangjiahuifu;
	
	/**
	 * 用户id
	 */
					
	private Long userid;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：评论标题
	 */
	public void setPinglunbiaoti(String pinglunbiaoti) {
		this.pinglunbiaoti = pinglunbiaoti;
	}
	/**
	 * 获取：评论标题
	 */
	public String getPinglunbiaoti() {
		return pinglunbiaoti;
	}
	/**
	 * 设置：商品名称
	 */
	public void setShangpinmingcheng(String shangpinmingcheng) {
		this.shangpinmingcheng = shangpinmingcheng;
	}
	/**
	 * 获取：商品名称
	 */
	public String getShangpinmingcheng() {
		return shangpinmingcheng;
	}
	/**
	 * 设置：商铺名称
	 */
	public void setShangpumingcheng(String shangpumingcheng) {
		this.shangpumingcheng = shangpumingcheng;
	}
	/**
	 * 获取：商铺名称
	 */
	public String getShangpumingcheng() {
		return shangpumingcheng;
	}
	/**
	 * 设置：会员账号
	 */
	public void setHuiyuanzhanghao(String huiyuanzhanghao) {
		this.huiyuanzhanghao = huiyuanzhanghao;
	}
	/**
	 * 获取：会员账号
	 */
	public String getHuiyuanzhanghao() {
		return huiyuanzhanghao;
	}
	/**
	 * 设置：会员姓名
	 */
	public void setHuiyuanxingming(String huiyuanxingming) {
		this.huiyuanxingming = huiyuanxingming;
	}
	/**
	 * 获取：会员姓名
	 */
	public String getHuiyuanxingming() {
		return huiyuanxingming;
	}
	/**
	 * 设置：商品评价
	 */
	public void setShangpinpingjia(String shangpinpingjia) {
		this.shangpinpingjia = shangpinpingjia;
	}
	/**
	 * 获取：商品评价
	 */
	public String getShangpinpingjia() {
		return shangpinpingjia;
	}
	/**
	 * 设置：商品图片
	 */
	public void setShangpintupian(String shangpintupian) {
		this.shangpintupian = shangpintupian;
	}
	/**
	 * 获取：商品图片
	 */
	public String getShangpintupian() {
		return shangpintupian;
	}
	/**
	 * 设置：商家回复
	 */
	public void setShangjiahuifu(String shangjiahuifu) {
		this.shangjiahuifu = shangjiahuifu;
	}
	/**
	 * 获取：商家回复
	 */
	public String getShangjiahuifu() {
		return shangjiahuifu;
	}
	/**
	 * 设置：用户id
	 */
	public void setUserid(Long userid) {
		this.userid = userid;
	}
	/**
	 * 获取：用户id
	 */
	public Long getUserid() {
		return userid;
	}

}
