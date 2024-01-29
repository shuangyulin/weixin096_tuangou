package com.entity.model;

import com.entity.ShangpinxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 商品信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-04-03 16:44:20
 */
public class ShangpinxinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 商品图片
	 */
	
	private String shangpintupian;
		
	/**
	 * 商品类型
	 */
	
	private String shangpinleixing;
		
	/**
	 * 商家账号
	 */
	
	private String shangjiazhanghao;
		
	/**
	 * 商铺名称
	 */
	
	private String shangpumingcheng;
		
	/**
	 * 商品原价
	 */
	
	private Integer shangpinyuanjia;
		
	/**
	 * 商品现价
	 */
	
	private Integer shangpinxianjia;
		
	/**
	 * 团购最低人数
	 */
	
	private Integer tuangouzuidirenshu;
		
	/**
	 * 商品折扣
	 */
	
	private String shangpinzhekou;
		
	/**
	 * 团购开始时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date tuangoukaishishijian;
		
	/**
	 * 团购结束时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date tuangoujieshushijian;
		
	/**
	 * 商品描述
	 */
	
	private String shangpinmiaoshu;
		
	/**
	 * 可提货点
	 */
	
	private String ketihuodian;
		
	/**
	 * 倒计结束时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date reversetime;
		
	/**
	 * 点击次数
	 */
	
	private Integer clicknum;
		
	/**
	 * 积分
	 */
	
	private Integer jifen;
		
	/**
	 * 价格
	 */
	
	private Float price;
				
	
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
	 * 设置：商品类型
	 */
	 
	public void setShangpinleixing(String shangpinleixing) {
		this.shangpinleixing = shangpinleixing;
	}
	
	/**
	 * 获取：商品类型
	 */
	public String getShangpinleixing() {
		return shangpinleixing;
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
	 * 设置：商品原价
	 */
	 
	public void setShangpinyuanjia(Integer shangpinyuanjia) {
		this.shangpinyuanjia = shangpinyuanjia;
	}
	
	/**
	 * 获取：商品原价
	 */
	public Integer getShangpinyuanjia() {
		return shangpinyuanjia;
	}
				
	
	/**
	 * 设置：商品现价
	 */
	 
	public void setShangpinxianjia(Integer shangpinxianjia) {
		this.shangpinxianjia = shangpinxianjia;
	}
	
	/**
	 * 获取：商品现价
	 */
	public Integer getShangpinxianjia() {
		return shangpinxianjia;
	}
				
	
	/**
	 * 设置：团购最低人数
	 */
	 
	public void setTuangouzuidirenshu(Integer tuangouzuidirenshu) {
		this.tuangouzuidirenshu = tuangouzuidirenshu;
	}
	
	/**
	 * 获取：团购最低人数
	 */
	public Integer getTuangouzuidirenshu() {
		return tuangouzuidirenshu;
	}
				
	
	/**
	 * 设置：商品折扣
	 */
	 
	public void setShangpinzhekou(String shangpinzhekou) {
		this.shangpinzhekou = shangpinzhekou;
	}
	
	/**
	 * 获取：商品折扣
	 */
	public String getShangpinzhekou() {
		return shangpinzhekou;
	}
				
	
	/**
	 * 设置：团购开始时间
	 */
	 
	public void setTuangoukaishishijian(Date tuangoukaishishijian) {
		this.tuangoukaishishijian = tuangoukaishishijian;
	}
	
	/**
	 * 获取：团购开始时间
	 */
	public Date getTuangoukaishishijian() {
		return tuangoukaishishijian;
	}
				
	
	/**
	 * 设置：团购结束时间
	 */
	 
	public void setTuangoujieshushijian(Date tuangoujieshushijian) {
		this.tuangoujieshushijian = tuangoujieshushijian;
	}
	
	/**
	 * 获取：团购结束时间
	 */
	public Date getTuangoujieshushijian() {
		return tuangoujieshushijian;
	}
				
	
	/**
	 * 设置：商品描述
	 */
	 
	public void setShangpinmiaoshu(String shangpinmiaoshu) {
		this.shangpinmiaoshu = shangpinmiaoshu;
	}
	
	/**
	 * 获取：商品描述
	 */
	public String getShangpinmiaoshu() {
		return shangpinmiaoshu;
	}
				
	
	/**
	 * 设置：可提货点
	 */
	 
	public void setKetihuodian(String ketihuodian) {
		this.ketihuodian = ketihuodian;
	}
	
	/**
	 * 获取：可提货点
	 */
	public String getKetihuodian() {
		return ketihuodian;
	}
				
	
	/**
	 * 设置：倒计结束时间
	 */
	 
	public void setReversetime(Date reversetime) {
		this.reversetime = reversetime;
	}
	
	/**
	 * 获取：倒计结束时间
	 */
	public Date getReversetime() {
		return reversetime;
	}
				
	
	/**
	 * 设置：点击次数
	 */
	 
	public void setClicknum(Integer clicknum) {
		this.clicknum = clicknum;
	}
	
	/**
	 * 获取：点击次数
	 */
	public Integer getClicknum() {
		return clicknum;
	}
				
	
	/**
	 * 设置：积分
	 */
	 
	public void setJifen(Integer jifen) {
		this.jifen = jifen;
	}
	
	/**
	 * 获取：积分
	 */
	public Integer getJifen() {
		return jifen;
	}
				
	
	/**
	 * 设置：价格
	 */
	 
	public void setPrice(Float price) {
		this.price = price;
	}
	
	/**
	 * 获取：价格
	 */
	public Float getPrice() {
		return price;
	}
			
}
