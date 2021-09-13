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
        // delect()는 인자로 null을 가질 수 없기 때문에 예외처리
        userRepository.delete(userRepository.findById(1L).orElseThrow(RuntimeException::new));

        userRepository.deleteById(2L); // 조회 1번, 삭제 1번
    }
}