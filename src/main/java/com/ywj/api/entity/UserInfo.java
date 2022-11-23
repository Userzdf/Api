package com.ywj.api.entity;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class UserInfo {
    String userName;
    String passWord;
    String email;
    String phone;
    String address;

}
