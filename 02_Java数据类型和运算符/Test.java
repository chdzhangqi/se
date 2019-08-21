/*
标识符：
	数字，字母，下划线，美元符。数字不能作为开头
	byte(1), short(2), int(4), long(8)
	float(4), double(8), boolean(int), char(2)
	查看API八种基本数据类型的包装类
	Byte、Short、Integer、Long、Float、Double、Boolean、Character。
	数字默认是int。
*/

public class Test{
	public static void main(String[] args){		
		int a = 2;
		//a += 2;
		//System.out.println(a++);// iload_1,iinc 1, 1
		//System.out.println(++a);// iinc 1, 1,iload_1 不是说什么先输出再相加，因为现将
		// 局部变量表中的值是先load到栈顶还是先在局部变量表中进行相加。
		//System.out.println(++a+a++);
		//System.out.println(a<<1);
		//System.out.println(a !=2 & a < 3);
		//int b;
		//b = a > 3?10:20;
		//System.out.println(99 & 6);
		// 0000 0100
		// 1111 1011
		// 1000 0100
		// 1000 0101
		a = a ++;
		System.out.println(a);//2
		a = ++ a;
		System.out.println(a);//3
	}
	
}