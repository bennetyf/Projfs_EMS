package com.ssm.service.auth;

import com.ssm.pojo.custompojo.Manager;

public interface LoginCheck {
    Manager findManagerByName(String username);
}
