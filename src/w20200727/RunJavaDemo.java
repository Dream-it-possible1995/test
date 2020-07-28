package w20200727;

import java.lang.management.ClassLoadingMXBean;
import java.lang.management.ManagementFactory;
import java.net.URL;
import java.net.URLClassLoader;
import java.text.DecimalFormat;

public class RunJavaDemo {
    public static void main(String[] args) throws Exception{

        try{
            ClassLoadingMXBean classLoadingMXBean = ManagementFactory.getClassLoadingMXBean();
            System.out.println("当前加载到 Java 虚拟机中的类的数量:"+classLoadingMXBean.getLoadedClassCount());

            URL url = new URL("file:/C:/Users/wangwc/IdeaProjects/glodon/src/");
            URLClassLoader urlCl = new URLClassLoader(new URL[]{url});
            urlCl.loadClass("w20200727.Singleton");

            System.out.println("当前加载到 Java 虚拟机中的类的数量:"+classLoadingMXBean.getLoadedClassCount());

        }catch (Exception e) {
            e.printStackTrace();
        }

//        MemoryMXBean memoryMXBean = ManagementFactory.getMemoryMXBean();
//        MemoryUsage heapMemoryUsage = memoryMXBean.getHeapMemoryUsage();
//
//        System.out.println("最大堆内存："+view(heapMemoryUsage.getMax()));
//        System.out.println("初始堆内存："+view(heapMemoryUsage.getInit()));
//        System.out.println("使用堆内存："+view(heapMemoryUsage.getUsed()));
//
//        MemoryUsage nonHeapMemoryUsage = memoryMXBean.getNonHeapMemoryUsage();
//
//        System.out.println("最大非堆内存："+view(nonHeapMemoryUsage.getMax()));
//        System.out.println("初始非堆内存："+view(nonHeapMemoryUsage.getInit()));
//        System.out.println("使用非堆内存："+view(nonHeapMemoryUsage.getUsed()));


    }

    public static String view(long size) {
        if (size<0) return "不限制";

        String[] arr = { "Bytes", "KB", "MB", "GB", "TB", "PB", "EB", "ZB", "YB" };

        float srcsize = Float.valueOf(size);
        int index = (int) (Math.floor(Math.log(srcsize) / Math.log(1024)));
        double curSize = srcsize / Math.pow(1024, index);
        curSize = Double.valueOf(new DecimalFormat("#.00").format(curSize));

        return curSize + arr[index];
    }

}
