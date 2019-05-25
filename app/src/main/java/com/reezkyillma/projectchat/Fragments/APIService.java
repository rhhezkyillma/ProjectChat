package com.reezkyillma.projectchat.Fragments;

import com.reezkyillma.projectchat.Notifications.MyResponse;
import com.reezkyillma.projectchat.Notifications.Sender;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIService {
    @Headers(
            {
                    "Content-Type:application/json",
                    "Authorization:key=AAAAncOmxig:APA91bHb5UpQPS4wwB1r91BcX-6eVBo3W3zNmNGsZvRdn5mLi117MPySIdNAlrLSAn2qpZO-xp5e5rAA28wnxLwPhg0mNDtOJiyLBJn0xuZ7sEOsFU_N2kkZU0yLalJzxXtezBQhH1nu"
            }
    )

    @POST("fcm/send")
    Call<MyResponse> sendNotification(@Body Sender body);
}
