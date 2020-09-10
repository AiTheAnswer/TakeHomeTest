package com.allen.common.base

import android.app.Application

/**
 * Created by Allen
 * on 2018/10/18
 */
class BaseApplication : Application() {
    //通过伴生对象实现静态
    companion object {
        lateinit var mApplication: BaseApplication
        private set//这行代码是将属性的set方法私有化
    }

    override fun onCreate() {
        super.onCreate()
        mApplication = this

    }
}