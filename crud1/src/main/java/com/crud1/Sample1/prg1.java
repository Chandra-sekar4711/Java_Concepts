package com.crud1.Sample1;

import java.util.*;
import java.util.stream.Collectors;

public class prg1 {
    public static int longestConsecutive(List<Integer> nums) {

        List<Integer> al = new ArrayList();
        Set<Integer> s = new HashSet<>(nums);
        for (Integer num : s) {
            if (!s.contains(num - 1)) {
                int count = 1;
                int current_element = num;

                while (s.contains(current_element + 1)) {
                    current_element++;
                    count++;
                }
                al.add(count);

            }

        }
        return Collections.max(al);

    }

    public static void main(String[] args) {
        List<Integer> nums1 = List.of(100, 101, 102, 103, 104, 105, 106, 107, 4, 1, 2, 4, 200, 1, 3, 2);

        System.out.println("Output 1: " + longestConsecutive(nums1)); // 3

        List<Integer> res = nums1.stream().filter(n->n%2==0).collect(Collectors.toList());
        System.out.println(res);
    }
}
