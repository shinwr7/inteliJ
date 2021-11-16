package com.ict.boot3.domain;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
// 자료형이 똑같은게 2개 이상일 경우 헷갈리지 않게 붙여주는 빌더(없어도 동작함)
@Builder(toBuilder = true)
public class Boot3DTO {

    private Long sno;

    private String first;

    private String last;

    private LocalDateTime regTime;

}
