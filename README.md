# ImageSelector

Leet Code - 661 ImageSelector Easy

Solution:

Intuition:

The problem appears to involve smoothing an image represented as a 2D array. 
The given approach seems to iterate through each pixel in the image and calculate the average value 
of the pixel and its surrounding pixels to create a smoothed image.

Approach:

Initialize a new 2D array (ans) to store the smoothed image.
Iterate through each pixel in the original image.
For each pixel, calculate the sum of the pixel values of the pixel and its surrounding pixels.
Keep track of the count of pixels included in the sum.
Calculate the average by dividing the sum by the count.
Store the average value in the corresponding pixel of the ans array.
Repeat this process for all pixels in the image.
Return the smoothed image.

Complexity:

Time complexity: O(m * n), where m is the number of rows and n is the number of columns in the image.
Space complexity: O(m * n) for the ans array.
