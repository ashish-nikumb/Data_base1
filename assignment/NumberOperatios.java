
import java.util.Arrays;

public class NumberOperatios {

	public static void main(String[] args)
	{
		double[] numbers = new double[args.length];
		for(int i=0;i<args.length;i++)
		{
			numbers[i]=Double.parseDouble(args[i]);
		}
		
		double sum=0;
		for(double num : numbers)
		{
			sum+=num;
		}

		double max = Double.MIN_VALUE;
		for(double num : numbers)
		{
			if(num>max)
			{
				max=num;
			}
		}
		
		double[] sortedNumbers = numbers.clone();
		Arrays.sort(sortedNumbers);
		
		double min = Double.MAX_VALUE;
		for(double num : numbers)
		{
			if(num<min)
			{
				min = num;
			}
		}
		System.out.println("Sum of all Numbers :"+ sum);
		System.out.println("Maximum Value :"+ max);
		System.out.println("All Numbers in Sorted Order :"+ Arrays.toString(sortedNumbers));
		System.out.println("Minimum Value :"+ min);
		
	}

}
