package com.ict.boot3.domain;

import lombok.Builder;
import lombok.Data;
import lombok.extern.log4j.Log4j2;

@Data

@Builder(toBuilder = true)
public class RamDTO {

    private Long age;
    private Long time;
    private String name;
    private Long ad;
}
