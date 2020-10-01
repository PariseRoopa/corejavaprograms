package demoprograms;

public class Array {
	static void findSum(int array[]) {
		int sum=0;
		for(int i=0;i<array.length;i++)
		{
			sum=sum+array[i];
		}
		System.out.println(sum);
}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numbers[]= {1,2,3,4,5,6,7,8,9};
		findSum(numbers);

	}

}
