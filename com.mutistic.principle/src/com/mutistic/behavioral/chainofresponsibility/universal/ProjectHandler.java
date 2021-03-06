package com.mutistic.behavioral.chainofresponsibility.universal;

import com.mutistic.utils.PrintUtil;

/**
 * @program ConcreteHandler：实现职责的类
 * @description 实现经理处理费用申请的职责
 * @author mutisitic
 * @date 2018年9月7日
 */
public class ProjectHandler extends Handler {
	/**
	 * @description 经理处理费用申请
	 * @author mutisitic
	 * @date 2018年9月7日
	 * @see com.mutistic.behavioral.chainofresponsibility.sturctrue.Handler#handleRequest()
	 */
	@Override
	public Object handleRequest(RequestModel model) {
		PrintUtil.two("ProjectHandler.handleRequest()", "接受到请求");
		
		if(FeeRequestModel.FEE_TYPE.contentEquals(model.getType())) {
			PrintUtil.three("ProjectHandler.handleRequest()", "本身的职责范围内的请求，开始处理请求");
			return handleFeeRequest(model);
		}
		
		return super.handleRequest(model);
	}

	/**
	 * @description 具体的处理内容
	 * @author mutisitic
	 * @date 2018年9月7日
	 * @param model
	 * @return
	 */
	private Object handleFeeRequest(RequestModel model) {
		FeeRequestModel fee  = (FeeRequestModel) model;
		if(fee.getFee() < 500) {
			if(fee.getUser().equals("AAA")) {
				return "经理同意"+ fee.getUser() +"的费用申请，申请金额为："+ fee.getFee();
			} else {
				return "经理不同意"+ fee.getUser() +"的费用申请，申请金额为："+ fee.getFee();
			}
		} else if(this.successor != null){
			PrintUtil.three("ProjectHandler.handleFeeRequest()", "非本身的职责范围内的请求，开始转发给后继职责对象处理");
			return this.successor.handleRequest(model);
		}
		
		return null;
	}
}
