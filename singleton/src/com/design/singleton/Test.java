package com.design.singleton;

public class Test {
    public static void main(String[] args) {
        Test test=new Test();
        System.out.println("懒汉加载");
        test.checkLazy();
        System.out.println("饿汉加载");
        test.checkHungry();
        System.out.println("双重检测锁");
        test.checkDouble();
        System.out.println("静态内部类模式");
        test.checkStatic();
        System.out.println("枚举模式");
        test.checkEnumerate();

    }

    public void checkDouble(){
        DoubleCheckLock d1=DoubleCheckLock.getInstance();
        DoubleCheckLock d2=DoubleCheckLock.getInstance();

        System.out.println(d1);
        System.out.println(d2);
    }

    public void checkHungry(){
        HungryMode h1=HungryMode.getInstance();
        HungryMode h2=HungryMode.getInstance();

        System.out.println(h1);
        System.out.println(h2);
    }

    public void checkLazy(){
        LazyMode l1=LazyMode.getInstance();
        LazyMode l2=LazyMode.getInstance();

        System.out.println(l1);
        System.out.println(l2);
    }

    public void checkStatic(){
        StaticInnerClassMode s1=StaticInnerClassMode.getInstance();
        StaticInnerClassMode s2=StaticInnerClassMode.getInstance();

        System.out.println(s1);
        System.out.println(s2);
    }

    public void checkEnumerate(){
        EnumerateMode e1=EnumerateMode.INSTANCE;
        EnumerateMode e2=EnumerateMode.INSTANCE;

        System.out.println(e1);
        System.out.println(e2);
    }
}
