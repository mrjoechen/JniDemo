package tech.jcjc.jnidemo;

/**
 * Created by CHENQIAO on 2017/12/29 13:17.
 * E-mail: mrjctech@gmail.com
 */

public class NdkJniUtils {

    // Used to load the 'native-lib' library on application startup.
    static {
        System.loadLibrary("native-lib");
    }

    /**
     * A native method that is implemented by the 'native-lib' native library,
     * which is packaged with this application.
     */
    public native String stringFromJNI();
}
