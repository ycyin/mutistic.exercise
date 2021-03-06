package com.mutistic.behavioral.command.logger;

import com.mutistic.utils.PrintUtil;

/**
 * @program Client：客户端
 * @author mutisitic 演示 日志请求：结合宏命令，队列请求
 * @date 2018年8月23日
 */
public class Client {
	public static void main(String[] args) {
		PrintUtil.one("演示 日志请求：结合宏命令，队列请求");
		// 运行厨师管理
		CookManager.run();
		
		for (int i = 1; i < 5; i++) {
			// 创建服务员实例 Invoker
			Waiter waiter = new Waiter();
			
			// 创建菜品实例 Command
			Command chop = new ChopCommand(i);
			Command duck = new DuckCommand(i);
			
			// 点菜
			waiter.orderDish(chop);
			waiter.orderDish(duck);
			// 点菜完毕
			waiter.orderOver();
			
			// 测试异常
			if(i == 3) {
				CommandQueue.isException = true;
			}
		}
	}
}
