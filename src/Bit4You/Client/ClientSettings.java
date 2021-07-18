package Bit4You.Client;

public class ClientSettings {

    public String AccessTokenUrl;
    public String ApiUrl;
    public String ClientId;
    public String ClientSecret;
    public String OAuthScopes;


    public void setAccessTokenUrl(String accessTokenUrl) {
        AccessTokenUrl = accessTokenUrl;
    }

    public void setApiUrl(String apiUrl) {
        ApiUrl = apiUrl;
    }

    public void setClientId(String clientId) {
        ClientId = clientId;
    }

    public void setClientSecret(String clientSecret) {
        ClientSecret = clientSecret;
    }

    public void setOAuthScopes(String OAuthScopes) {
        this.OAuthScopes = OAuthScopes;
    }

    public String getAccessTokenUrl() {
        return AccessTokenUrl;
    }

    public String getApiUrl() {
        return ApiUrl;
    }

    public String getClientId() {
        return ClientId;
    }

    public String getClientSecret() {
        return ClientSecret;
    }

    public String getOAuthScopes() {
        return OAuthScopes;
    }
}
