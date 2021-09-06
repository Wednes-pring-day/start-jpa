package com.fastcampas.jpa.bookmanager.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {
    @Test
    void test() {
        User user = new User();
        user.setEmail("rkdkdudjd@gmail.com");
        user.setName("윤가영");
        System.out.println(user); // User(name=윤가영, email=rkdkdudjd@gmail.com, createdAt=null, updatedAt=null)

    }
}