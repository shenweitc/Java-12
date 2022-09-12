package Demo;

import java.util.Arrays;

public class Demo01Arrays {
    public static void main(String[] args) {
        int[] intArray={1,2,3};
        String intStr= Arrays.toString(intArray);   //将数组转换为字符串
        System.out.println(intStr);

        int[] array1={1,5,6,8,4,9,4};
        Arrays.sort(array1);
        System.out.println(Arrays.toString(array1));
    }
}
