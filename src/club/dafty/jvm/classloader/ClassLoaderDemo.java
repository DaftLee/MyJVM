package club.dafty.jvm.classloader;

/**
 * @author leechengchao@foxmail.com
 * @version 1.0
 * @date 2019/5/28 17:02
 */
public class ClassLoaderDemo {
    public static void main(String[] args) {
        Object o = new Object();
        System.out.println("o - "+o.getClass().getClassLoader());
        ClassLoaderDemo demo = new ClassLoaderDemo();
        System.out.println("demo - "+demo.getClass().getClassLoader());
    }
}
