package com.mutistic.design.factory.structure;

import com.mutistic.design.utils.PrintUtil;

/**
 * @program ConcreteProduce: 具体的Product接口的实现对象
 * @description
 * @author mutisitic
 * @date 2018年8月13日
 */
public class ConcreteProduce implements Product {

	/**
	 * @description Product具体业务实现
	 * @author mutisitic
	 * @date 2018年8月13日
	 */
	@Override
	public void operation() {
		PrintUtil.printTwo("ConcreteProduce-operation", "Product具体业务实现");
	}
}
