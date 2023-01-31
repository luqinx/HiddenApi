package android.app;

import android.os.IBinder;

public class ActivityManagerNative {

    static public IActivityManager getDefault() {
        return null;
    }

    public static IActivityManager asInterface(IBinder obj) {
        throw new RuntimeException("STUB");
    }
}
