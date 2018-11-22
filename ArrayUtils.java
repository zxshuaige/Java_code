
 //Java数组章节练习题
public class ArrayUtils{

    //1.计算数组中最大值
    public static int arrayMaxElement(int[] data){
		if(data == null){
			System.out.println("数组为空,-1表示异常！！");
			return -1;
		}
        int max = data[0];
		for(int i = 0; i < data.length; i++){
			if(data[i] > max){
				max = data[i];
			}
		}
        return max;
    }
    
    //2.计算数组中最小值
    public static int arrayMinElement(int[] data){
		if(data == null){
			System.out.println("数组为空,-1表示异常！！");
			return -1;
		}
        int min = data[0];
		for(int i = 0; i < data.length; i++){
			if(data[i] < min){
				min = data[i];
			}
		}
        return min;
    }
    
    
    //3.计算数组值之和
    public static int arrayElementSum(int[] data){
		if(data == null){
			System.out.println("数组为空,-1表示异常！！");
			return -1;
		}
        int sum = data[0];
		for(int i = 1; i < data.length; i++){
			sum = sum + data[i];
		}
        return sum;
    }
    
    //4.数组拼接
    public static int[] arrayJoin(int[] a, int[] b){
		if(a == null && b == null)
			return null;
		if(a == null)
			return b;
		if(b == null)
			return a;
        int[] array = new int[a.length + b.length];
		for(int i = 0; i < a.length; i++){
			array[i] = a[i];
		}
		for(int j = a.length; j < a.length+b.length; j++){
			array[j] = b[j-a.length];
		}
        return array;
    }

    //5.数组截取
    //[start, end)
    public static int[] arraySub(int[] data, int start, int end){
		if(data == null)
			return null;
        if(start < 0 || start > data.length-1 || end < 0 || end > data.length || start > end-1){
			return null;
		}
		int[] array = new int[end - start];
		for(int i = 0; i < end - start; i++){
			array[i] = data[start + i];
		}
        return array;
    }
    
    //6.数组打印
    public static void printArray(int[] data){
		if(data == null)
			System.out.print("数组为空！！");
		else{ 
			for(int i = 0; i < data.length; i++)
			System.out.print(data[i]+" ");
		}
		System.out.println();
    }
    
    //7.数组反转
    // 比如：[1,2,3,4] => [4,3,2,1]
    public static void printReversal(int[] data){
		if(data == null)
			return;
        int first = 0;
		int end = data.length;
		while(first < end){
			int temp = 0;
			temp = data[first];
			data[first] = data[end-1];
			data[end-1] = temp;
			first++;
			end--;
		}
    }
    
    public static void main(String[] args){
        int[] a = new int[] {1, 2, 4, 2, 8, 4, 3, 6, 9};
		int[] b = null;
		//打印数组
		printArray(a);
		printArray(b);
		//数组最大值和最小值和数组之和
		int Max1 = arrayMaxElement(a);
		int Min1 = arrayMinElement(a);
		int Sum1 = arrayElementSum(a);
		System.out.println("数组a的最大值："+Max1);
		System.out.println("数组a的最小值："+Min1);
		System.out.println("数组a的和："+Sum1);
		int Max2 = arrayMaxElement(b);
		int Min2 = arrayMinElement(b);
		int Sum2 = arrayElementSum(b);
		System.out.println("数组b的最大值："+Max2);
		System.out.println("数组b的最小值："+Min2);
		System.out.println("数组a的和："+Sum2);
		//打印数组拼接后的数组
		System.out.print("a,b拼接后的数组为：");
		printArray(arrayJoin(a, b));
		//打印截取后的数组（a, b）
		System.out.print("截取后的a数组为：");
		printArray(arraySub(a, 2, 6));
		System.out.print("截取后的b数组为：");
		printArray(arraySub(b, 1, 1));
		//数组反转
		System.out.print("反转前的a数组为：");
		printArray(a);
		printReversal(a);
		System.out.print("反转后的a数组为：");
		printArray(a);
		System.out.print("反转前的b数组为：");
		printArray(b);
		printReversal(b);
		System.out.print("反转后的b数组为：");
		printArray(b);
    }
}







