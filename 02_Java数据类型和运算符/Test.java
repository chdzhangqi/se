/*
��ʶ����
	���֣���ĸ���»��ߣ���Ԫ�������ֲ�����Ϊ��ͷ
	byte(1), short(2), int(4), long(8)
	float(4), double(8), boolean(int), char(2)
	�鿴API���ֻ����������͵İ�װ��
	Byte��Short��Integer��Long��Float��Double��Boolean��Character��
	����Ĭ����int��
*/

public class Test{
	public static void main(String[] args){		
		int a = 2;
		//a += 2;
		//System.out.println(a++);// iload_1,iinc 1, 1
		//System.out.println(++a);// iinc 1, 1,iload_1 ����˵ʲô���������ӣ���Ϊ�ֽ�
		// �ֲ��������е�ֵ����load��ջ���������ھֲ��������н�����ӡ�
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