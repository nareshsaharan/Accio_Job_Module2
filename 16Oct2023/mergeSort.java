import java.util.*;
import java.io.*;

class Solution {

static void merge(int arr[], int l, int mid, int r) {

	int leftArr[] = new int[mid - l + 1];
	int rightArr[] = new int[r - mid];
	int k = 0;
	for(int i = l; i <= mid; i++) {
		leftArr[k] = arr[i];
		k++;
	}

	k = 0;
	for(int i = mid + 1; i<= r; i++) {
		rightArr[k] = arr[i];
		k++;
	}

	int i = 0;
	int j = 0;
	k = l;

	while( i < leftArr.length && j < rightArr.length) {

		if(leftArr[i] > rightArr[j]) {
			arr[k] = rightArr[j];
			j++;
			k++;
		}else {
			arr[k] = leftArr[i];
			i++;
			k++;
		}
		
	}

	while(i < leftArr.length ) {
		arr[k] = leftArr[i];
		i++;
		k++;
	}

	while(j < rightArr.length ) {
		arr[k] = rightArr[j];
		j++;
		k++;
	}
	
	
}

	
static void mergeSort(int[] arr,int l,int r){

		if(l == r) {
			return ;
		}
    
		int mid = (l + r) / 2;
		mergeSort(arr, l, mid);
		mergeSort(arr, mid + 1, r);

		// write
		merge(arr, l, mid, r);
			
	}
}
public class Main {
    public static void main(String args[]) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int[] a=new int[n];
        for(int i= 0; i < n; i++)
            a[i] = input.nextInt();
        Solution Obj = new Solution();
		
        Obj.mergeSort(a,0,n-1);
		
        for (int i = 0; i < n; i++)
            System.out.print(a[i] + " ");
    }
}
