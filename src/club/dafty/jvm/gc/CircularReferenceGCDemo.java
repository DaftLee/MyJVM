package club.dafty.jvm.gc;

/**
 * @author leechengchao@foxmail.com
 * @version 1.0
 * @date 2019/5/29 10:35
 * //结论：GC不受循环引用的影响
 */
public class CircularReferenceGCDemo {
    public Object paramObject = null;
    public static void main(String[] args) {
        CircularReferenceGCDemo g1 = new CircularReferenceGCDemo();
        CircularReferenceGCDemo g2 = new CircularReferenceGCDemo();
        g1.paramObject = g2;
        g2.paramObject = g1;
        /*
        g1 = null;
        g2 = null;
         */

        System.gc();

    }
}
