package maxmary.androidstodio.test.myapplication;

import android.app.Application;

import com.vk.sdk.VKSdk;

/**
 * Created by user on 20.01.2016.
 */
public class LoginVK extends Application{

    @Override
    public void onCreate() {
        super.onCreate();
        VKSdk.initialize(this);
    }
}
