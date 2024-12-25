package com.entity.model;

import com.entity.FangdaixinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 放贷信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2
 */
public class FangdaixinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 贷款名称
	 */
	
	private String daikuanmingcheng;
		
	/**
	 * 银行名称
	 */
	
	private String yinxingmingcheng;
		
	/**
	 * 贷款金额
	 */
	
	private Float daikuanjine;
		
	/**
	 * 年利率
	 */
	
	private Float nianlilv;
		
	/**
	 * 每月利息
	 */
	
	private Float meiyuelixi;
		
	/**
	 * 放贷时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date fangdaishijian;
		
	/**
	 * 学号
	 */
	
	private String xuehao;
		
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 放贷进度
	 */
	
	private String fangdaijindu;
		
	/**
	 * 是否审核
	 */
	
	private String sfsh;
		
	/**
	 * 审核回复
	 */
	
	private String shhf;
		
	/**
	 * 是否支付
	 */
	
	private String ispay;
				
	
	/**
	 * 设置：贷款名称
	 */
	 
	public void setDaikuanmingcheng(String daikuanmingcheng) {
		this.daikuanmingcheng = daikuanmingcheng;
	}
	
	/**
	 * 获取：贷款名称
	 */
	public String getDaikuanmingcheng() {
		return daikuanmingcheng;
	}
				
	
	/**
	 * 设置：银行名称
	 */
	 
	public void setYinxingmingcheng(String yinxingmingcheng) {
		this.yinxingmingcheng = yinxingmingcheng;
	}
	
	/**
	 * 获取：银行名称
	 */
	public String getYinxingmingcheng() {
		return yinxingmingcheng;
	}
				
	
	/**
	 * 设置：贷款金额
	 */
	 
	public void setDaikuanjine(Float daikuanjine) {
		this.daikuanjine = daikuanjine;
	}
	
	/**
	 * 获取：贷款金额
	 */
	public Float getDaikuanjine() {
		return daikuanjine;
	}
				
	
	/**
	 * 设置：年利率
	 */
	 
	public void setNianlilv(Float nianlilv) {
		this.nianlilv = nianlilv;
	}
	
	/**
	 * 获取：年利率
	 */
	public Float getNianlilv() {
		return nianlilv;
	}
				
	
	/**
	 * 设置：每月利息
	 */
	 
	public void setMeiyuelixi(Float meiyuelixi) {
		this.meiyuelixi = meiyuelixi;
	}
	
	/**
	 * 获取：每月利息
	 */
	public Float getMeiyuelixi() {
		return meiyuelixi;
	}
				
	
	/**
	 * 设置：放贷时间
	 */
	 
	public void setFangdaishijian(Date fangdaishijian) {
		this.fangdaishijian = fangdaishijian;
	}
	
	/**
	 * 获取：放贷时间
	 */
	public Date getFangdaishijian() {
		return fangdaishijian;
	}
				
	
	/**
	 * 设置：学号
	 */
	 
	public void setXuehao(String xuehao) {
		this.xuehao = xuehao;
	}
	
	/**
	 * 获取：学号
	 */
	public String getXuehao() {
		return xuehao;
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
	 * 设置：放贷进度
	 */
	 
	public void setFangdaijindu(String fangdaijindu) {
		this.fangdaijindu = fangdaijindu;
	}
	
	/**
	 * 获取：放贷进度
	 */
	public String getFangdaijindu() {
		return fangdaijindu;
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
	 * 设置：是否支付
	 */
	 
	public void setIspay(String ispay) {
		this.ispay = ispay;
	}
	
	/**
	 * 获取：是否支付
	 */
	public String getIspay() {
		return ispay;
	}
			
}
