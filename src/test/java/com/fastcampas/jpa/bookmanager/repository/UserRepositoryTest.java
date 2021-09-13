package com.fastcampas.jpa.bookmanager.repository;

import com.fastcampas.jpa.bookmanager.domain.User;
import org.assertj.core.util.Lists;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@SpringBootTest // 스프링 컨텍스트를 불러와서 테스트에 활용하겠다는 의미! 테스트의 주체는 Junit(Jupiter이므로.)
class UserRepositoryTest {
    @Autowired
    UserRepository userRepository;

    @Test
    void crud() {
        // flush()는 어떻게 동작하는지 콘솔에서 확인하기 힘들다.
        // 이후에 영속성 컨텍스트에 대해 공부할 때 자세히 알아보자!
        userRepository.save(new User("new kayoung", "newkayoung@wednespring.com"));
        userRepository.flush();

        userRepository.saveAndFlush(new User("rosie", "rosie@wednespring.com"));
        userRepository.findAll().forEach(System.out::println);
    }
}