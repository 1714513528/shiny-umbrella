package com.design.singleton;
/**
 * 枚举模式单例
 * 利用jvm底层原理实现单例(枚举天然就是单例)
 * 可避免反射、反序列化等漏洞破坏单例
 * *****无法懒加载*****
 *
 *
 * */

public enum EnumerateMode {
    //这个枚举元素本身就是单例对象
    INSTANCE;
    //添加一些自己的操作
    public void EnumerateModeOperation(){

    }

}
