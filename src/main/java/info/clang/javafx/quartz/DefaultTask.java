package info.clang.javafx.quartz;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * 
 * 类名名称: DefaultTask <br/>
 * 功能说明: 定时执行类. <br/>
 *
 * @author zhoucl 2014年1月15日
 * @since JDK 1.5
 */
public class DefaultTask implements ApplicationContextAware {
	private ApplicationContext ctx;
	
	@Override
	public void setApplicationContext(ApplicationContext applicationContext)
			throws BeansException {
		this.ctx = applicationContext;
	}
	
	/**
	 * 
	 * 函数名称: execute<br/>
	 * 函数功能: 定时执行的测试函数<br/>
	 *
	 * @author zhoucl
	 * @since JDK 1.5
	 */
	public void execute() {
		System.out.println(ctx.getMessage("sms.ID", new Object[]{}, null));
	}

}
