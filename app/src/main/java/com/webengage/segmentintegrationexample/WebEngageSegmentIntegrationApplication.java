package com.webengage.segmentintegrationexample;

import android.app.Application;

import com.segment.analytics.Analytics;
import com.webengage.sdk.android.WebEngageConfig;
import com.webengage.sdk.android.integrations.segment.WebEngageIntegration;

/**
 * Created by shahrukhimam on 11/10/17.
 */

public class WebEngageSegmentIntegrationApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        WebEngageConfig webEngageConfig = new WebEngageConfig.Builder()
                .setDebugMode(true)
                .setPushLargeIcon(R.mipmap.ic_launcher)
                .setPushSmallIcon(R.mipmap.ic_launcher_round)
                .build();
        Analytics analytics = new Analytics.Builder(this, "YOUR_WRITE_KEY")
                .trackApplicationLifecycleEvents() // Enable this to record certain application events automatically!
                .logLevel(Analytics.LogLevel.VERBOSE)
                .use(WebEngageIntegration.FACTORY.withWebEngageConfig(webEngageConfig))
                .build();
        Analytics.setSingletonInstance(analytics);
    }
}
