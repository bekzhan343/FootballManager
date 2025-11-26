package com.example.footballmanager.utils;

import com.example.footballmanager.constants.ApiConstant;
import com.example.footballmanager.constants.ApiErrorMessage;

public class ApiUtils {

    public final static String getMethodName(){
        try {
            return Thread.currentThread().getStackTrace()[2].getMethodName();
        }catch (Exception cause){
            return ApiConstant.UNDEFINED;
        }
    }
}
