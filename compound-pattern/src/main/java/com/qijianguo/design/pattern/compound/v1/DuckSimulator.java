package com.qijianguo.design.pattern.compound.v1;

/**
 * 鸭子模拟器
 * @author qijianguo
 */
public class DuckSimulator {

    public static void main(String[] args) {
//        DuckSimulator duckSimulator = new DuckSimulator();
//        duckSimulator.simulate();
        int[] B = {};
        int[] A = {1, 8, 8, 11, 13, 13};
        int[] array = new int[A.length + B.length];
        int k = 0, i = 0, j = 0;
        int[] temp = A.length > B.length ? A : B;
        B = A;
        A = temp;
        for (; i < A.length; i++) {
            for (; j < B.length; j ++) {
                int ai = A[i];
                int bj = B[j];
                if (ai < bj) {
                    array[k++] = ai;
                    break;
                } else {
                    array[k++] = bj;
                }
            }
            if (j == B.length) {
                array[k++] = A[i];
            }
        }
        for (int f = 0; f < array.length; f++) {
            System.out.println(array[f]);
        }
        System.out.println("---" + array.length);
    }

    public void simulate() {
        Quackable rubberDuck = new RubberDuck();
        Quackable readHeadDuck = new RedHeadDuck();
        Quackable duckCall = new DuckCall();
        Quackable mallardDuck = new MallardDuck();
        System.out.println("Duck Simulator \n");
        simulate(rubberDuck);
        simulate(readHeadDuck);
        simulate(duckCall);
        simulate(mallardDuck);

        // TODO 问题2：怎么才能让鸭子和鹅使用同一个{@link DuckSimulator} 呢？

    }

    public void simulate(Quackable duck) {
        duck.quack();
    }


}
