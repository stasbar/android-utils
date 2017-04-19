package com.stasbar.utils;
import android.util.Log;

/**
 * Created by stasbar on 23.03.2016.
 */
public class LogUtils {
    private static String APP_NAME = BuildConfig.APPLICATION_ID;
    private final static String LOGTAG = APP_NAME + " " + BuildConfig.FLAVOR;
    private final static boolean DEBUG = BuildConfig.DEBUG;

    public static void init(String ApplicationName) {
        APP_NAME = ApplicationName;
    }

    public static void v(String message, Object... args) {
        if (DEBUG || Log.isLoggable(LOGTAG, Log.VERBOSE)) {
            Log.v(LOGTAG, args == null || args.length == 0
                    ? message : String.format(message, args));
        }
    }

    public static void v(String tag, String message, Object... args) {
        if (DEBUG || Log.isLoggable(LOGTAG, Log.VERBOSE)) {
            Log.v(LOGTAG + "/" + tag, args == null || args.length == 0 ? message
                    : String.format(message, args));
        }
    }

    public static void d(String message, Object... args) {
        if (DEBUG || Log.isLoggable(LOGTAG, Log.DEBUG)) {
            Log.d(LOGTAG, args == null || args.length == 0 ? message
                    : String.format(message, args));
        }
    }

    public static void d(String tag, String message, Object... args) {
        if (DEBUG || Log.isLoggable(LOGTAG, Log.DEBUG)) {
            Log.d(LOGTAG + "/" + tag, args == null || args.length == 0 ? message
                    : String.format(message, args));
        }
    }

    public static void i(String message, Object... args) {
        if (DEBUG || Log.isLoggable(LOGTAG, Log.INFO)) {
            Log.i(LOGTAG, args == null || args.length == 0 ? message
                    : String.format(message, args));
        }
    }

    public static void i(String tag, String message, Object... args) {
        if (DEBUG || Log.isLoggable(LOGTAG, Log.INFO)) {
            Log.i(LOGTAG + "/" + tag, args == null || args.length == 0 ? message
                    : String.format(message, args));
        }
    }

    public static void w(String message, Object... args) {
        if (DEBUG || Log.isLoggable(LOGTAG, Log.WARN)) {
            Log.w(LOGTAG, args == null || args.length == 0 ? message
                    : String.format(message, args));
        }
    }

    public static void w(String tag, String message, Object... args) {
        if (DEBUG || Log.isLoggable(LOGTAG, Log.WARN)) {
            Log.w(LOGTAG + "/" + tag, args == null || args.length == 0 ? message
                    : String.format(message, args));
        }
    }

    public static void e(String message, Object... args) {
        if (DEBUG || Log.isLoggable(LOGTAG, Log.ERROR)) {
            Log.e(LOGTAG, args == null || args.length == 0 ? message
                    : String.format(message, args));
        }
    }

    public static void e(String tag, String message, Object... args) {
        if (DEBUG || Log.isLoggable(LOGTAG, Log.ERROR)) {
            Log.e(LOGTAG + "/" + tag, args == null || args.length == 0 ? message
                    : String.format(message, args));
        }
    }

    public static void e(String message, Exception e) {
        if (DEBUG || Log.isLoggable(LOGTAG, Log.ERROR)) {
            Log.e(LOGTAG, message, e);
        }
    }

    public static void e(String tag, String message, Exception e) {
        if (DEBUG || Log.isLoggable(LOGTAG, Log.ERROR)) {
            Log.e(LOGTAG + "/" + tag, message, e);
        }
    }

    public static void wtf(String message, Object... args) {
        if (DEBUG || Log.isLoggable(LOGTAG, Log.ASSERT)) {
            Log.wtf(LOGTAG, args == null || args.length == 0 ? message
                    : String.format(message, args));
        }
    }

    public static void wtf(String tag, String message, Object... args) {
        if (DEBUG || Log.isLoggable(LOGTAG, Log.ASSERT)) {
            Log.wtf(LOGTAG + "/" + tag, args == null || args.length == 0 ? message
                    : String.format(message, args));
        }
    }
}
