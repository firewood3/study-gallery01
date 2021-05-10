package com.gchsj.hsjgallery1.common.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@MappedSuperclass
public class BasicEntityVo {
    private LocalDateTime createDateTime;
    private LocalDateTime deleteDateTime;
    private LocalDateTime updateDateTime;
}
