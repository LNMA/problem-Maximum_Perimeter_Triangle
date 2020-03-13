# problem-Maximum_Perimeter_Triangle

## 1-Review:

Given an array of stick lengths, use 3 of them to construct a non-degenerate triange with the maximum possible perimeter. Print the lengths of its sides as 3 space-separated integers in non-decreasing order.

If there are several valid triangles having the maximum perimeter:

   - Choose the one with the longest maximum side.
   - If more than one has that maximum, choose from them the one with the longest minimum side.
   - If more than one has that maximum as well, print any one them.

If no non-degenerate triangle exists, print -1.

For example, assume there are stick lengths stick=[1,2,3,4,5,10]. The triplet (1,2,3) will not form a triangle. Neither will (2,3,5) or (4,5,10) so the problem is reduced to (2,3,4) and (3,4,5) . The longer perimeter is 3+4+5 =12 . 

## 2-Input Format

The first line contains single integer (n), the size of array stick.
The remain lines contains each a stick length stick[i].

## 3-Output Format

Print the lengths of the 3 chosen sticks as space-separated integers in non-decreasing order.

If no non-degenerate triangle can be formed, print -1.

Sample

Sample Input 0

    please input number of element in array: 5
    please enter element number 1:1
    please enter element number 2:1
    please enter element number 3:1
    please enter element number 4:3
    please enter element number 5:3

Sample Output 0

    1 3 3

