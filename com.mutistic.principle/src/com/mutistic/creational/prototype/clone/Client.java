package com.mutistic.creational.prototype.clone;

import com.mutistic.utils.PrintUtil;

/**
 * @program Java中实现Object的clone() 完成深度克隆 
 * @description 
 * @author mutisitic
 * @date 2018年8月15日
 */
public class Client {

	public static void main(String[] args) {
		// 创建原型实例
		Goods goods = new Goods();
		goods.setGoodsId(12345l);
		goods.setGoodsNo("G345O4385");

		Order order = new Order();
		order.setOrderId(11111l);
		order.setOrderNo("O123345");
		order.setGoods(goods);

		PrintUtil.one("Java中实现Object的clone() 完成深度克隆");
		
		PrintUtil.two("原型实例", order.toString());
		
		try {
			Order clone = (Order) order.clone();
			PrintUtil.two("克隆实例", clone.toString());
		} catch (CloneNotSupportedException e) {
			PrintUtil.err("克隆出现异常" + e.getMessage());
		}
	}

}
