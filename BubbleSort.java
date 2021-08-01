package thurs29;

public class BubbleSort {

	public static void main(String[] args) {
		 int[] a = {10,6,67,34,23,19,44,78,8,31};  
		    for(int i=0;i<10;i++)  
		    {  
		        for (int j=0;j<10;j++)  
		        {  
		            if(a[i]<a[j])  
		            {  
		                int temp = a[i];  
		                a[i]=a[j];  
		                a[j] = temp;   
		            }  
		        }  
		    }  
		    System.out.println("Printing Sorted List ...");  
		    for(int i=0;i<10;i++)  
		    {  
		        System.out.println(a[i]);  
		    }  
		}  
	
	}

