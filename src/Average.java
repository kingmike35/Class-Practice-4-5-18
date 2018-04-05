import java.lang.reflect.Array;
import java.util.Scanner;
public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
System.out.println("Put in 4 numbers");
int[]numbers={scan.nextInt(),scan.nextInt(),scan.nextInt(),scan.nextInt()};
int sum=0;
for (int i=0; i<numbers.length-1; i++){
	sum=sum+ numbers[i];
}
System.out.println(sum/Array.getLength(1));
{
	}}}


