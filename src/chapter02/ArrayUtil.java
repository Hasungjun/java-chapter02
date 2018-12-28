package chapter02;

public class ArrayUtil {
	
	// int 배열을 double 배열로 변환
 public	static double[] intToDouble( int[] source ) {
	 double []a = new double[source.length];
	 
	 for(int i=0;i<source.length;i++)
	 {
		 a[i] = source[i];
	 }
	 return a;
 }
	// double 배열을 int 배열로 변환
 public	static int[] doubleToInt( double[] source ){
 int []a = new int[source.length];
	 
	 for(int i=0;i<source.length;i++)
	 {
		 a[i] = (int)source[i];
	 }
	 return a;
 }
	// int 배열 두 개를 연결한 새로운 배열 리턴
 public	static int [] concat( int[] s1, int[] s2 )
 {
	 int i=0;
	 int[] a = new int[s1.length + s2.length];
	 
	 for(i=0; i<s1.length;i++)
	 {
		 a[i]=s1[i];
	 }
	 
	 for(int j=0;j<s2.length;j++)
	 {

		 a[i]=s2[j];
		 i++;
	 }
		 
	 return a;
 }

}
