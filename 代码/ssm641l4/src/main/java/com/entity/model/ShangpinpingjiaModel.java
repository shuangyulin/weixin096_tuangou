package com.entity.model;

import com.entity.ShangpinpingjiaEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 商品评价
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-04-03 16:44:21
 */
public class ShangpinpingjiaModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
