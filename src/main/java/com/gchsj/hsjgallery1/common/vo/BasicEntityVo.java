package com.gchsj.hsjgallery1.common.vo;

import lombok.*;

import java.time.LocalDateTime;

@ToString
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BasicEntityVo {
    private LocalDateTime createDateTime;
    private LocalDateTime deleteDateTime;
    private LocalDateTime updateDateTime;
}
