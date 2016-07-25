package kr.edcan.kkobugi;

/**
 * Created by Chad on 7/9/16.
 */

public class User {
    /*
* 0 Facebook
* 1 Twitter
* */
    String name, phone, passwd, api_token;
    String[] friends;

    public User(String name, String phone, String passwd, String api_token, String[] friends) {
        this.name = name;
        this.phone = phone;
        this.passwd = passwd;
        this.api_token = api_token;
        this.friends = friends;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getPasswd() {
        return passwd;
    }

    public String getApi_token() {
        return api_token;
    }

    public String[] getFriends() {
        return friends;
    }
}
