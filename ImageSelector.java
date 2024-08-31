import java.util.*;
public class ImageSelector {
    public void compress(int[][] img){
        int[][] result = new int[img.length][img[0].length];
        int sum=0,count=0;
        for(int i=0;i<img.length;i++){
            for(int j=0;j<img[0].length;j++){
                sum=img[i][j];
                count=1;
                if((j-1)>=0){
                    sum+=img[i][j-1];
                    count++;
                }
                if((j+1) < img[0].length){
                    sum+=img[i][j+1];
                    count++;
                }
                if((i-1) >=0){
                    sum+=img[i-1][j];
                    count++;
                    if((j-1) >=0){
                        sum+=img[i-1][j-1];
                        count++;
                    }
                    if((j+1) < img[0].length){
                        sum+=img[i-1][j+1];
                        count++;
                    }
                }
                if((i+1) < img.length){
                    sum+=img[i+1][j];
                    count++;
                    if((j-1) >=0){
                        sum+=img[i+1][j-1];
                        count++;
                    }
                    if((j+1) < img[0].length){
                        sum+=img[i+1][j+1];
                        count++;
                    }
                }
                result[i][j] = sum/count;
            }
        }

        for(int i=0; i<result.length; i++){
            for(int j=0; j<result[0].length; j++){
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        ImageSelector s = new ImageSelector();
        System.out.println("enter the value of m : ");
        int m= sc.nextInt();
        System.out.println("enter the value of n : ");
        int n= sc.nextInt();
        int img[][] = new int[m][n];

        System.out.println("Enter "+ m*n +" random values:");

        for(int i=0; i<img.length; i++){
            for(int j=0; j<img[0].length; j++){
                img[i][j] = sc.nextInt();
            }
        }
        System.out.println("Befor Compression : ");
        for(int i=0; i<img.length; i++){
            for(int j=0; j<img[0].length; j++){
                System.out.print(img[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("After Compression : ");
        s.compress(img);
    }
}
