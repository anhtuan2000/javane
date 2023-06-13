import java.util.Scanner;
public class Helloword
{
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        // Khai báo và khởi tạo mảng
        int n = scanner.nextInt();
        int[] numbers = new int[n];

        // Nhập giá trị cho mảng
        System.out.println("Nhap gia tri cho mang!");
        for (int i = 0; i <n; i++) {
            System.out.print("Nhap gia tri cho phan tu thu " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }
        // Xuất giá trị của mảng
        System.out.println("Gia tri cua mang:");
        for (int i = 0; i < n; i++) {
         for (int j = i+1; j < n;j++) {
            if(numbers[i]>numbers[j]){
                int a = numbers[i];
                numbers[i]=numbers[j];
                numbers[j]=a;
                }
            } 
         System.out.println(numbers[i]);
        }
        scanner.close();
    }
}