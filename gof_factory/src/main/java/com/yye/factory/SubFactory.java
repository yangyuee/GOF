package com.yye.factory;/*
 @auther 杨月娥
 @DESCRIPTION ${DESCRIPTION}
 @create 2019/6/26
*/

import com.yye.operator.AlgOperator;
import com.yye.operator.SubOperatory;

public class SubFactory implements AlgFactory {
    public AlgOperator getOperator() {
        return new SubOperatory();
    }
}
