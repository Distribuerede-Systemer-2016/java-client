package sdk.services;

import sdk.models.AccessToken;

public class AuthService {

  private static AccessToken accessToken;

  public static void setAccessToken(AccessToken token){
    accessToken = token;
  }
  public static AccessToken getAccessToken(){
    return accessToken;
  }
  public static void clear(){
    accessToken = null;
  }

}
