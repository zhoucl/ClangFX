package info.clang.javafx.startup;
	
import org.apache.log4j.PropertyConfigurator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import info.clang.javafx.constant.EConstants;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * 
 * 类名名称: FXStartup <br/>
 * 功能说明: 整个ClangFX应用的启动类. <br/>
 *
 * @author zhoucl 2014年1月15日
 * @since JDK 1.5
 */
public class FXStartup extends Application {
	private static final Logger logger = LoggerFactory.getLogger(FXStartup.class);
	
	@Override
	@SuppressWarnings("resource")
	public void start(Stage primaryStage) {
		try {
			PropertyConfigurator.configure(this.getClass().getClassLoader().getResource("").getPath() + 
				 EConstants.RES_PREFIX + "/log4j.properties");
			
			new ClassPathXmlApplicationContext(EConstants.RES_PREFIX + "/applicationContext.xml");
			
			Button button = new Button();
			button.setText("Say 'Hello,World!'");
			button.setOnAction(new EventHandler<ActionEvent>() {
				public void handle(ActionEvent event) {
					logger.info("点击我了");
				}
			});
			
			AnchorPane root = new AnchorPane();
			root.getChildren().add(button);
			
			Scene scene = new Scene(root, 400, 400);
			scene.getStylesheets().add(EConstants.CSS_PREFIX + "application.css");
			
			primaryStage.setTitle("Hello,World!");
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 
	 * 函数名称: main<br/>
	 * 函数功能: 应用启动主函数<br/>
	 *
	 * @author zhoucl
	 * @param args
	 * @since JDK 1.5
	 */
	public static void main(String[] args) {
		launch(args);
	}
}
