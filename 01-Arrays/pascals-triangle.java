// Problem = Pascals Triangle  

/* Pascals Triangle is a triangle in which each number is the sum of the two numbers directly above it */

/*This code is made for leetcode question */

/* Note - The Row i has exactly i-1 middle values  */

import java.util.*; /*importing the util package for using List and ArrayList*/

class Solution {

    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {

            List<Integer> row = new ArrayList<>();

            row.add(1);

            if (i >= 2) {
                List<Integer> prevRow = result.get(i - 1);
                for (int j = 1; j < i; j++) {

                    row.add(prevRow.get(j - 1) + prevRow.get(j));

                }

            }

            if (i > 0) {
                row.add(1);
            }
            result.add(row);
        }
        return result;
    }

}