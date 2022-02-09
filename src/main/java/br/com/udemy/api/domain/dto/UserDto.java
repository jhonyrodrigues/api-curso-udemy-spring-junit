package br.com.udemy.api.domain.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserDto {

    private Integer id;
    private String name;
    private String email;

    @JsonIgnore
    private String password;
}
