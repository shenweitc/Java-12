package Demo;


import java.util.Arrays;
import java.util.Scanner;

/*
使用Arrays相关的API，将一个随机的字符串中的所有字符升序排列，并倒序打印

 */
public class DemoArraysPractise {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入：");
        String str=sc.next();
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        for (int i = chars.length - 1; i >= 0; i--) {
            System.out.println("降序："+chars[i]);
        }
    }
}
