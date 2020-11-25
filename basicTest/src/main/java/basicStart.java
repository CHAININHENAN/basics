import java.util.Scanner;

/**
 * @author zhaopanfeng
 * @date 2020/11/25 16:00
 */
public class basicStart {
    public static void main(String[] args) {
        System.out.println("测试");
        //斐波那契数列
        fibonacci();


    }



     static void fibonacci(){
         Scanner sc = new Scanner(System.in);
         System.out.print("请输入打印的个数：");

         int count  = sc.nextInt();

         int a = 1;
         int b = 1;
         int c = 0;

         for(int i = 0;i<count;i++){
             if(i == 0 || i == 1){
                 System.out.println(1);
             }else {
                 c = a+b;
                 System.out.println(c);
                 a = b;
                 b = c;
             }
         }







    }
}
