package com.fastcampas.jpa.bookmanager.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest // 스프링 컨텍스트를 불러와서 테스트에 활용하겠다는 의미! 테스트의 주체는 Junit(Jupiter이므로.)
class UserRepositoryTest {
    @Autowired
    UserRepository userRepository;

    @Test
    void crud() {
        userRepository.deleteAll(); // findAll - 각 row 마다 delete 쿼리 : 총 다섯번
        userRepository.findAll().forEach(System.out::println);
    }
}