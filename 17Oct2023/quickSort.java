
import java.util.*;
import java.io.*;

class Solution{


	static int partition(int arr[], int l, int r) {

		int i = l - 1;

		int pivot = arr[r];

		for(int j = l; j < r; j++) {

			
			if(arr[j] < pivot) {
				
				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j]  = temp;
			}
		}
		

		i++;
		int temp = arr[i];
		arr[i] = arr[r];
		arr[r]  = temp;
		return i;
	}
	
	static void quickSort(int[] arr, int l, int r){

		if(l >= r) return;

		int pi = partition(arr, l, r);
		quickSort(arr, l, pi - 1);
		quickSort(arr, pi + 1, r);
		
    }
}

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
		int n;
        n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        Solution Obj = new Solution();
		Obj.quickSort(arr, 0, n - 1);
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
        sc.close();
    }
}
