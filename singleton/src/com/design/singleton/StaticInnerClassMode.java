package com.design.singleton;

/**
 * (常用)
 * 单例模式的静态内部类的实现方式
 * 特点：实现了懒加载、线程安全、调用效率高
 */


public class StaticInnerClassMode {
    private static class InnerClass {
        private static final StaticInnerClassMode instance = new StaticInnerClassMode();
    }

    public static StaticInnerClassMode getInstance() {
        return InnerClass.instance;
    }

    private StaticInnerClassMode() {
    }

}
