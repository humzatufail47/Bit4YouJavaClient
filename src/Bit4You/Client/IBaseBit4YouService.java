package Bit4You.Client;

import Bit4You.Client.Models.OAuthRequest;
import Bit4You.Client.Models.OAuthResult;
import Bit4You.Client.Models.UserInfo;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;

public interface IBaseBit4YouService {

    @POST("/token")
    Call<OAuthResult> getAccessToken(@Body OAuthRequest authRequest);
    @GET("/userinfo")
    Call<UserInfo> getUserInfo(@Header("Authorization") String authHeader);
}
