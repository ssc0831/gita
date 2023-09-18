package com.example.cafemanager.menu;

import com.example.cafemanager.order.Menu;

import okhttp3.MultipartBody;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;

public interface MenuService {
    @Multipart
    @POST("menu/upload")
    Call<ResponseBody> uploadImage(@Part MultipartBody.Part image);

    @POST("menu/insert")
    Call<Void> saveMenu(@Body Menu menu);
}
