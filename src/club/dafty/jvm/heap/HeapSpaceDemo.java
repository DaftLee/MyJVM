package club.dafty.jvm.heap;

/**
 * @author leechengchao@foxmail.com
 * @version 1.0
 * @date 2019/5/28 23:51
 * 代码获取maxMemory(返回Java虚拟机试图使用的最大内存量Xmx)，和totalMemory(返回Java虚拟机中的内存总量Xms)
 * Runtime是描述运行时数据区的类
 */
public class HeapSpaceDemo {
    public static void main(String[] args) {
        long maxMemory = Runtime.getRuntime().maxMemory();
        long totalMemory = Runtime.getRuntime().totalMemory();
        System.out.println("maxMemory:"+ (double)maxMemory/1024/1024+"MB");
        System.out.println("totalMemory:"+ (double)totalMemory/1024/1024+"MB");
    }
}
