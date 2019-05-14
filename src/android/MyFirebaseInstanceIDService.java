package com.gae.scaffolder.plugin;

import android.util.Log;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.FirebaseMessagingService;

/**
 * Created by Felipe Echanique on 08/06/2016.
 * Changed by Alex Barboza on 14/05/2019
 */
public class MyFirebaseInstanceIDService extends FirebaseMessagingService {
    
    private static final String TAG = "FCMPlugin";

    public void onNewToken (String newToken) {
        super.onNewToken(newToken);
        Log.d("NEW_TOKEN", newToken);
        FCMPlugin.sendTokenRefresh(newToken);
    }
}
