package com.design;
/**
 * 测试饿汉单例模式
 * 特点：线程安全、调用效率高
 *      没有延时加载的优势
 *
 * */
public class HungryMode {
    //没有延时加载的优势
    //类初始化时立即加载，加载类时天然是线程安全的，不需要synchronized关键字
    private static HungryMode instance=new HungryMode();

    private HungryMode(){
    }
    //方法没有同步调用效率高！！
    public static HungryMode getInstance(){
        return instance;
    }
}
