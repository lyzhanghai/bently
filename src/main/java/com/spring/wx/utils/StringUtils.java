package com.spring.wx.utils;

/**
 * Created by wgq on 16-3-31.
 */
public class StringUtils {

    public static boolean isEmpty(String str) {
        if(str == null || "".equals(str)) {
            return true ;
        }
        return false ;
    }
}
