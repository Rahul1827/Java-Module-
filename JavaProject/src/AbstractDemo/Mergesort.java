package AbstractDemo;


import java.util.*;
public class Mergesort
{
public static void divide(int a[],int n,int low,int end){
if(low>=end){
return ;
}
int  mid=(low+end)/2;
divide(a,n,low,mid);
divide(a,n,mid+1,end);
conquer(a,n,low,mid,end);
}

public static void conquer(int a[],int n,int low ,int mid,int end){
int ans[]=new int[n];
int ind1=low;
int ind2=mid+1;
int x=0;
while(ind1<=mid && ind2<=end){
if(a[ind1]<=a[ind2]){
ans[x++]=a[ind1++];
}
else{
ans[x++]=a[ind2++];
}
}
while(ind1<=mid){
ans[x++]=a[ind1++];
}
while(ind2<=end){
ans[x++]=a[ind2++];
}

for(int i=0,j=low;i<n;i++,j++){
  a[j]=ans[i];
}
}

public class Merge{

	public static void Mergesort(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size : ");
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++){
		a[i]=sc.nextInt();
		}
		divide(a,n,0,n-1);
		for(int i=0;i<n;i++){
		System.out.print(a[i]+" ");
		
		}
		}
}}
/******************************************************************************
Merge sort

*******************************************************************************/

