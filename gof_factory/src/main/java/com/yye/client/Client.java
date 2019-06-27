package com.yye.client;/*
 @auther 杨月娥
 @DESCRIPTION ${DESCRIPTION}
 @create 2019/6/26
*/

import com.yye.factory.*;
import com.yye.operator.AlgOperator;

public class Client {
    public static void main(String[] args) {

        AlgFactory addFactory = new AddFactory();
        AlgOperator addOperator = addFactory.getOperator();
        System.out.println(addOperator.getResult());

        AlgFactory subFactory = new SubFactory();
        AlgOperator subOperatory = subFactory.getOperator();
        System.out.println(subOperatory.getResult());

        AlgFactory mulFactory = new MulFactory();
        AlgOperator mulOperator = mulFactory.getOperator();
        System.out.println(mulOperator.getResult());

        AlgFactory divFactory = new DivFactory();
        AlgOperator divOperator = divFactory.getOperator();
        System.out.println(divOperator.getResult());
    }
}
