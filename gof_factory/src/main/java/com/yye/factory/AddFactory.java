package com.yye.factory;/*
 @auther 杨月娥
 @DESCRIPTION ${DESCRIPTION}
 @create 2019/6/26
*/

import com.yye.operator.AddOperator;
import com.yye.operator.AlgOperator;

public class AddFactory implements  AlgFactory {

        public AlgOperator getOperator() {
        return new AddOperator();
    }
}
