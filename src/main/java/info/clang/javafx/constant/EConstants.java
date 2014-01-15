package info.clang.javafx.constant;

/**
 * 
 * 类名名称: EConstants <br/>
 * 功能说明: 常量枚举类. <br/>
 *
 * @author zhoucl 2014年1月15日
 * @since JDK 1.5
 */
public enum EConstants {
	/**
	 * 以file:协议开头的classes目录的物理路径. <br />
	 * 例如: {@code file://D:/workspace/ClangFX/target/classes/}
	 */
	CLASSLOADER_FILEPATH("file:" + EConstants.class.getClassLoader().getResource("").getPath(), 1),
	
	/**
	 * res资源文件的前缀(package). <br />
	 * 例如：{@code info/clang/javafx/res}
	 */
	RES_PREFIX("info/clang/javafx/res", 2),
	
	/**
	 * css资源文件目录的物理路径. <br />
	 * 例如：{@code file://D:/workspace/ClangFX/target/classes/info/clang/javafx/css/}
	 */
	CSS_PREFIX(EConstants.CLASSLOADER_FILEPATH.toString() + EConstants.RES_PREFIX.toString() + "/css/", 3),
	
	/**
	 * image资源文件目录的物理路径. <br />
	 * 例如：{@code file://D:/workspace/ClangFX/target/classes/info/clang/javafx/image/}
	 */
	IMG_PREFIX(EConstants.CLASSLOADER_FILEPATH.toString() + EConstants.RES_PREFIX.toString() + "/images/", 4),
	
	/**
	 * log4j的配置文件目录的物理路径. <br />
	 * 例如: 例如：{@code //D:/workspace/ClangFX/target/classes/info/clang/javafx/res/}
	 */
	LOG_PREFIX(EConstants.CLASSLOADER_FILEPATH.toString().replaceAll("file:", "") + EConstants.RES_PREFIX.toString() + "/", 5);
	
	/**
	 * 枚举设置的值
	 */
	private String val;
	
	/**
	 * 枚举设置的索引号
	 */
	private int index;
	
	/**
	 * 构造函数
	 * @param _val	真实值
	 * @param _index 索引值
	 */
	private EConstants(String _val, int _index) {
		this.val = _val;
		this.index = _index;
	}

	@Override
	public String toString() {
		return this.val;
	}
	
	/**
	 * 
	 * 函数名称: toFullString<br/>
	 * 函数功能: 返回枚举的index和val值<br/>
	 *
	 * @author zhoucl
	 * @return
	 * @since JDK 1.5
	 */
	public String toFullString() {
		return this.index + "_" + this.val;
	}
	
}
