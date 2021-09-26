package com.design.singleton;
/**
 * 双重检测锁，由于jvm内存模型的原因，本方案不安全
 *双重检测锁是为了避免每一次获取实例都要同步造成的效率底下
 * 而选择将同步块减小到实例化的位置，为了防止
 * 同时有多个线程进入同步锁前造成拦截失败，产生多个实例
 * 在同步块里也加入了检测，故名双重检测锁，但由于内存加载的原因
 * 可能指令并非是按照顺序来的，所以不推荐使用
 *
 *
 *
 * */


public class DoubleCheckLock {
    private static DoubleCheckLock instance;

    private DoubleCheckLock() {
    }

    public static DoubleCheckLock getInstance() {
        if (instance == null) {
            synchronized (DoubleCheckLock.class) {
                if (instance == null) {
                    instance = new DoubleCheckLock();
                }
            }
        }
        return instance;
    }
}
