public class OperationPriority{
	/*
		������������ת������ͨ���ֽ����i2b֮��������ɵġ�
		ǿ��ת����ʽ����ת��һ�����ݵĽ��ͷ�ʽ�������ڼ���������㶼��һ���ģ�0 �� 1�Ļ������㣬
		������ֵΪ���٣��Ϳ�����ν����ˡ�
	*/
	public static void main(String[] args){
		/*
		int i = 10;
		byte b1 = 9;
		byte b = (byte)i;
		String s = "hello";
		Object o = (Object)s;
		*/
		//210
		//1101 0010
		//1010 1101
		//1010 1110  2 + 4 + 8 + 32
		int i = 0;
		do {
			i ++;
		}while(i < 30);
	}
}