package app.log.com.loglib;

import android.util.Log;

/**
 * Created by DELL on 12/7/2017.
 */

public class LogDebug {

    private static final String TAG = "LogDebug";

    public static void d(String message) {

        Log.d(TAG, message);

    }
}
