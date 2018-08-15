@file:Suppress("NOTHING_TO_INLINE")

package com.qingmei2.rhine.util

import android.app.Application
import android.content.Context
import android.net.ConnectivityManager
import io.reactivex.Observable

/**
 * 判断网络状态是否可用
 */
inline fun Application.isNetworkAvailable(): Boolean = (
        getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager).activeNetworkInfo.isAvailable
