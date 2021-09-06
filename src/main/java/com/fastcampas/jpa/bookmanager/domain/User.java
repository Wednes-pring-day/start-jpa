package com.fastcampas.jpa.bookmanager.domain;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
public class User {
    @NonNull
    private String name;
    @NonNull
    private String email;

    // jpa 도메인은 기본적으로 언제 생성/수정되었는지 저장이 된다.
    // 그걸 관리 하기 위해 다음 필드를 만들어둔다.
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

}
