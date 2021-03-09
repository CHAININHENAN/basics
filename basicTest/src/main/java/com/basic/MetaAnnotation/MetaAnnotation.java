package com.basic.MetaAnnotation;

import java.beans.Transient;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 * @author zhaopanfeng
 * @date 2021/1/25 16:45
 */
public class MetaAnnotation {

}

@Target({ElementType.METHOD,ElementType.TYPE})
@interface  MyAnnotation{

}