package com.nouzan.nouzan.clipboraddemo.base

import android.app.Activity

/**
 * Created by nouzan on 2017/11/27.
 */
class ActivityCollector {
    companion object {
        val activities = ArrayList<Activity>()
        fun addActivity(activity: Activity) = activities.add(activity)
        fun removeActivity(activity: Activity) = activities.remove(activity)
        fun finishAll() {
            for(activity in activities) {
                if(!activity.isFinishing)
                    activity.finish()
            }
        }
    }

}