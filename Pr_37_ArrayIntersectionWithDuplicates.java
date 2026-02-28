import java.util.*;

public class Pr_37_ArrayIntersectionWithDuplicates{
    public static void arrayIntersectionWithDuplicates(int[] nums1, int[] nums2){
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int n1 = nums1.length;
        int n2 = nums2.length;
        if(n1==0 || n2 == 0){
            System.out.println("[]");
            return;
        }
        ArrayList<Integer> l1 = new ArrayList<>();
        int i1=0, i2=0;
        while(i1<n1 && i2<n2){
            if(nums1[i1]==nums2[i2]){
                l1.add(nums1[i1]);
                i1++;
                i2++;
            }
            else if(nums1[i1] < nums2[i2]){
                i1++;
            }
            else{
                i2++;
            }
        }
        int l_size = l1.size();
        if(l_size == 0){
            System.out.println("[]");
            return;
        }
        System.out.println(l1.toString());
        return;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length of number 1: ");
        int n = sc.nextInt();
        int[] nums1 = new int[n];
        for(int i=0; i<n; i++){
            System.out.print("nums1["+i+"]: ");
            nums1[i] = sc.nextInt();
        }
        System.out.print("Enter length of number 2: ");
        n = sc.nextInt();
        int[] nums2 = new int[n];
        for(int i=0; i<n; i++){
            System.out.print("nums2["+i+"]: ");
            nums2[i] = sc.nextInt();
        }

        arrayIntersectionWithDuplicates(nums1, nums2);
        sc.close();
    }
}