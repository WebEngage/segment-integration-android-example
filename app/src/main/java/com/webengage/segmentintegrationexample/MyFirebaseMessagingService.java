package com.webengage.segmentintegrationexample;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;
import com.webengage.sdk.android.WebEngage;

import java.util.Map;

/**
 * Created by shahrukhimam on 11/10/17.
 */

public class MyFirebaseMessagingService extends FirebaseMessagingService {

    @Override
    public void onMessageReceived(RemoteMessage remoteMessage) {
        Map<String, String> data = remoteMessage.getData();
        if (data != null) {
            if (data.containsKey("source") && "webengage".equals(data.get("source"))) {
                WebEngage.get().receive(data);
            }
        }
    }
}