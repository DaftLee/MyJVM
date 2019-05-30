package club.dafty.jvm.stack;

/**
 * @author leechengchao@foxmail.com
 * @version 1.0
 * @date 2019/5/28 17:57
 */
public class StackOverExceptionDemo {
    public static void sayHello(){
        sayHello();
    }

    public static void main(String[] args) {
        sayHello();
    }
}
