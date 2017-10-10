package com.webengage.segmentintegrationexample;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;
import com.webengage.sdk.android.WebEngage;

/**
 * Created by shahrukhimam on 11/10/17.
 */

public class MyFirebaseInstanceIdService extends FirebaseInstanceIdService {

    @Override
    public void onTokenRefresh() {
        super.onTokenRefresh();
        WebEngage.get().setRegistrationID(FirebaseInstanceId.getInstance().getToken());
    }
}
