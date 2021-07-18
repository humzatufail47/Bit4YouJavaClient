package Bit4You.Client.Models;

import com.google.gson.annotations.SerializedName;

public class OAuthResult {
    @SerializedName("access_token")
    private String AccessToken;
    @SerializedName("token_type")
    private String TokenType;
    @SerializedName("id_token")
    private String IdToken;
    @SerializedName("expires_in")
    private int ExpiresInSeconds;
    @SerializedName("auth_exp")
    private int AuthExpInSeconds;


    public String getAccessToken() {
        return AccessToken;
    }

    public String getTokenType() {
        return TokenType;
    }

    public String getIdToken() {
        return IdToken;
    }

    public int getExpiresInSeconds() {
        return ExpiresInSeconds;
    }


    public int getAuthExpInSeconds() {
        return AuthExpInSeconds;
    }

    public void setAccessToken(String accessToken) {
        AccessToken = accessToken;
    }

    public void setTokenType(String tokenType) {
        TokenType = tokenType;
    }

    public void setIdToken(String idToken) {
        IdToken = idToken;
    }

    public void setExpiresInSeconds(int expiresInSeconds) {
        ExpiresInSeconds = expiresInSeconds;
    }

    public void setAuthExpInSeconds(int authExpInSeconds) {
        AuthExpInSeconds = authExpInSeconds;
    }
}
