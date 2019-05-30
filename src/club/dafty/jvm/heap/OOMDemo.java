package club.dafty.jvm.heap;

import java.util.Random;

/**
 * @author leechengchao@foxmail.com
 * @version 1.0
 * @date 2019/5/29 9:28
 * 模拟OOM，设置Xms1m,Xmx1m
 *
 */
public class OOMDemo {
    public static void main(String[] args) {
        String str = null;
        while (true){
            str+= new Random().nextInt(99999999);
        }
    }
}

/* 输出结果
[Full GC (Allocation Failure) [PSYoungGen: 478K->478K(1024K)] [ParOldGen: 471K->471K(512K)] 949K->949K(1536K), [Metaspace: 3667K->3667K(1056768K)], 0.0043746 secs] [Times: user=0.00 sys=0.00, real=0.01 secs]
Exception in thread "main" java.lang.OutOfMemoryError: Java heap space
	at java.util.Arrays.copyOf(Arrays.java:3332)
	at java.lang.AbstractStringBuilder.ensureCapacityInternal(AbstractStringBuilder.java:124)
	at java.lang.AbstractStringBuilder.append(AbstractStringBuilder.java:674)
	at java.lang.StringBuilder.append(StringBuilder.java:208)
	at club.dafty.jvm.heap.OOMDemo.main(OOMDemo.java:14)
 */