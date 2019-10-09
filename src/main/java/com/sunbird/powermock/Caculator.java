package com.sunbird.powermock;

public class Caculator {

    public Integer getSum(int a, int b) {
        return MathUtil.sum(a, b);
    }
    public Integer getSub(int c) {
        return MathUtil.sub(c);
    }
}
