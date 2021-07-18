package Bit4You.Client.Models;

import com.google.gson.annotations.SerializedName;

public class OAuthRequest {
    @SerializedName("grant_type")
    public String GrantType;
    @SerializedName("scope")
    public String Scope;
    @SerializedName("username")
    public String UserName;
    @SerializedName("password")
    public String Password;

    public String getGrantType() {
        return GrantType;
    }

    public String getScope() {
        return Scope;
    }

    public String getUserName() {
        return UserName;
    }

    public String getPassword() {
        return Password;
    }

    public void setGrantType(String grantType) {
        GrantType = grantType;
    }

    public void setScope(String scope) {
        Scope = scope;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public void setPassword(String password) {
        Password = password;
    }
}
