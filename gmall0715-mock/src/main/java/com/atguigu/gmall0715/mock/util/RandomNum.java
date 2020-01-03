package com.atguigu.gmall0715.mock.util;

/**
 * @author yapehts
 * @create 2019/12/13
 * @describe
 */
import java.util.Random;

public class RandomNum {
    public static final  int getRandInt(int fromNum,int toNum){
        return   fromNum+ new Random().nextInt(toNum-fromNum+1);
    }
}
