package CollectionExample;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Example1 {
    public static void main(String[] args) {
        Collection<Integer> nums = new ArrayList<>();
        Collection nums1 = new ArrayList();
        List<Integer> nums2 = new ArrayList<>(); // ALT +ENTER
        nums2.add(6);
        nums2.add(5);
        nums2.add(4);
        nums2.add(8);

        // System.out.println(nums2.get(2));
        System.out.println(nums2);
        for(int n: nums2) {
            System.out.println(n);
        }
        for(Object n: nums2) {
            int num = (Integer)n;
            System.out.println(num);
        }
    }
}
