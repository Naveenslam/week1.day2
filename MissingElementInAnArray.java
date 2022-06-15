package week1.day2;

import java.util.Arrays;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 1,3,4,2,6 };
		
		
		Arrays.sort(arr);
			
			for (int i=0; i<arr.length; i++)
			{
				if ((i+1)!= arr[i])
				{
					System.out.println("The missing number is:" + (i+1));
					break;
				}
			
			}
			
		}

		}