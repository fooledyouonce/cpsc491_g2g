package com.example.fh_2023_tecs;

import android.app.Application;

public class ParseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        //register parse models
       //i.e.:  ParseObject.registerSubclass(Post.class);

        // ParseObject.registerSubclass(Post.class);
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("dAsKIKsrVFkfbSuu7hH3E9DcyUQv8HifPHnG74k7")
                .clientKey("6SaJhhC5X1OaKOu9EU9cXSnJGH9gxwp0mtTle5gl")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }

}
