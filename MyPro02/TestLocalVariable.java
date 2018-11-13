/**
 * 测试局部变量
 * @author an
 *
 */
public class TestLocalVariable 
{
	public static void mian(String[] args)
	{
		{
			int j = 3; //局部变量，从属于语句块
		}
		
		int i;//局部变量，从属于方法
		//int j = j + i;//编译报错，因为变量 i 没有被初始化（赋值）
	}
}
