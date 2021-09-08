package com.fastcampas.jpa.bookmanager.domain;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    @NonNull
    private String name;
    @NonNull
    private String email;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    // jpa 도메인은 기본적으로 언제 생성/수정되었는지 저장이 된다.
    // 그걸 관리 하기 위해 다음 필드를 만들어둔다.
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

}
