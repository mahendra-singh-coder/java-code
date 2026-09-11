import java.util.Scanner;
class Container
{
	public static void main(String [] args)
	{
		Scanner kb = new Scanner (System.in);
		int height[]=new int[]{1,8,6,2,6,4,8,6,7};
		
		
        
        int i = 0;
        int j = height.length - 1;
        int max = 0;

        while (i < j) {
            
            int h = height[i] < height[j] ? height[i] : height[j];
            
            int width = j - i;
            
            int area = h * width;

            if (area > max) {
                max = area;
            }

            if (height[i] < height[j]) {
                i++;
            } else {
                j--;
            }
        }

        System.out.print(max);
    }
}