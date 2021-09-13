package com.fastcampas.jpa.bookmanager.repository;

import com.fastcampas.jpa.bookmanager.domain.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

@SpringBootTest // 스프링 컨텍스트를 불러와서 테스트에 활용하겠다는 의미! 테스트의 주체는 Junit(Jupiter이므로.)
class UserRepositoryTest {
    @Autowired
    UserRepository userRepository;

    @Test
    void crud() {
        Page<User> users = userRepository.findAll(PageRequest.of(1, 3));

        System.out.println("page: " + users);
        System.out.println("totalElements: " + users.getTotalElements()); // 한 페이지에 들어가는 엘리멘트의 개수
        System.out.println("totalPages: " + users.getTotalPages()); // 결과의 페이지의 개수
        System.out.println("numberOfElements: " + users.getNumberOfElements());
        System.out.println("sort: " + users.getSort());
        System.out.println("size: " + users.getSize());

        users.getContent().forEach(System.out::println);
    }
}