package com.fastcampas.jpa.bookmanager.domain;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
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
