package com.design.singleton;
/**
 * 懒汉式单例模式
 * 特点：延迟加载，需要时才加载
 *      资源利用率高，由于使用了synchronized关键字
 *      每一次调用getInstance()方法都要同步，并发效率低。
 * */
public class LazyMode {
    private static LazyMode instance;

    private LazyMode(){
    }

    public static synchronized LazyMode getInstance(){
        if (instance==null){
            instance=new LazyMode();
        }
        return instance;
    }
}
