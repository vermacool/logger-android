package com.sked.logger

import android.util.Log

class Print {
    companion object {
        private val Tag = "Logger"

        public fun e(messege: String) {
            Log.d(Tag, messege)
        }
    }

}