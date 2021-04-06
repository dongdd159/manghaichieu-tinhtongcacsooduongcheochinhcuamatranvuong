import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
public class tinhtongcacsooduongcheochinhcuamatranvuong {
    public static void main(String[] args) {
        double[][] array;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size:");
        int size = scanner.nextInt();
        array = new double[size][size];
        for (int i=0;i<size;i++){
            for (int j=0; j<size;j++){
                System.out.println("array[" + i + "][" + j + "] = " + ":");
                array[i][j]=scanner.nextFloat();
            }
        }
        System.out.println("tổng đường chéo chính là:"+sumdiagonal(array));
    }
    public static double sumdiagonal(double [][]arr){
        double sum =0;
        for (int i=0;i< arr.length;i++){
            sum+=arr[i][i];
        }
        return sum;
    }
}
