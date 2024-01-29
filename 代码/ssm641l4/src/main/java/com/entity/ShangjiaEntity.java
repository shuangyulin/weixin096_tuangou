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
 * 商家
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-04-03 16:44:20
 */
@TableName("shangjia")
public class ShangjiaEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ShangjiaEntity() {
		
	}
	
	public ShangjiaEntity(T t) {
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
	 * 商家账号
	 */
					
	private String shangjiazhanghao;
	
	/**
	 * 密码
	 */
					
	private String mima;
	
	/**
	 * 姓名
	 */
					
	private String xingming;
	
	/**
	 * 手机
	 */
					
	private String shouji;
	
	/**
	 * 邮箱
	 */
					
	private String youxiang;
	
	/**
	 * 身份证
	 */
					
	private String shenfenzheng;
	
	/**
	 * 商铺名称
	 */
					
	private String shangpumingcheng;
	
	/**
	 * 商铺图片
	 */
					
	private String shangputupian;
	
	/**
	 * 商铺地址
	 */
					
	private String shangpudizhi;
	
	/**
	 * 经营范围
	 */
					
	private String jingyingfanwei;
	
	/**
	 * 是否审核
	 */
					
	private String sfsh;
	
	/**
	 * 审核回复
	 */
					
	private String shhf;
	
	/**
	 * 积分
	 */
					
	private Float jifen;
	
	/**
	 * 余额
	 */
					
	private Float money;
	
	
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
	 * 设置：商家账号
	 */
	public void setShangjiazhanghao(String shangjiazhanghao) {
		this.shangjiazhanghao = shangjiazhanghao;
	}
	/**
	 * 获取：商家账号
	 */
	public String getShangjiazhanghao() {
		return shangjiazhanghao;
	}
	/**
	 * 设置：密码
	 */
	public void setMima(String mima) {
		this.mima = mima;
	}
	/**
	 * 获取：密码
	 */
	public String getMima() {
		return mima;
	}
	/**
	 * 设置：姓名
	 */
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
	/**
	 * 设置：手机
	 */
	public void setShouji(String shouji) {
		this.shouji = shouji;
	}
	/**
	 * 获取：手机
	 */
	public String getShouji() {
		return shouji;
	}
	/**
	 * 设置：邮箱
	 */
	public void setYouxiang(String youxiang) {
		this.youxiang = youxiang;
	}
	/**
	 * 获取：邮箱
	 */
	public String getYouxiang() {
		return youxiang;
	}
	/**
	 * 设置：身份证
	 */
	public void setShenfenzheng(String shenfenzheng) {
		this.shenfenzheng = shenfenzheng;
	}
	/**
	 * 获取：身份证
	 */
	public String getShenfenzheng() {
		return shenfenzheng;
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
	 * 设置：商铺图片
	 */
	public void setShangputupian(String shangputupian) {
		this.shangputupian = shangputupian;
	}
	/**
	 * 获取：商铺图片
	 */
	public String getShangputupian() {
		return shangputupian;
	}
	/**
	 * 设置：商铺地址
	 */
	public void setShangpudizhi(String shangpudizhi) {
		this.shangpudizhi = shangpudizhi;
	}
	/**
	 * 获取：商铺地址
	 */
	public String getShangpudizhi() {
		return shangpudizhi;
	}
	/**
	 * 设置：经营范围
	 */
	public void setJingyingfanwei(String jingyingfanwei) {
		this.jingyingfanwei = jingyingfanwei;
	}
	/**
	 * 获取：经营范围
	 */
	public String getJingyingfanwei() {
		return jingyingfanwei;
	}
	/**
	 * 设置：是否审核
	 */
	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}
	/**
	 * 获取：是否审核
	 */
	public String getSfsh() {
		return sfsh;
	}
	/**
	 * 设置：审核回复
	 */
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	/**
	 * 获取：审核回复
	 */
	public String getShhf() {
		return shhf;
	}
	/**
	 * 设置：积分
	 */
	public void setJifen(Float jifen) {
		this.jifen = jifen;
	}
	/**
	 * 获取：积分
	 */
	public Float getJifen() {
		return jifen;
	}
	/**
	 * 设置：余额
	 */
	public void setMoney(Float money) {
		this.money = money;
	}
	/**
	 * 获取：余额
	 */
	public Float getMoney() {
		return money;
	}

}
