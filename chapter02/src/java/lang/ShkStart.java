package java.lang;

/**
 * @Author:Yuzhiqiang
 * @Description:
 * @Date: Create in 17:23 2021/12/6
 * @Modified By:
 */
public class ShkStart {
    public static void main(String[] args) {      //会报错，安全问题，因为当引导类加载器加载该类时发现并没有在java.lang包中定义类的权限，防止损害JVM
        System.out.println("hello");
    }
}
