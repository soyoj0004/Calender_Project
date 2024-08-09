package com.javalab.calendar.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * 클라이언트와 서버 간의 데이터 전송을 위한 객체로 입력 검증이나 데이터 형식 변환을 수행합니다.
 * 민감한 정보를 포함하지 않도록 설계하며, 필요한 데이터만 포함하여 보안성을 높입니다.
 */
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Builder

public class UserDto {

    @NotBlank(message = "이메일은 필수 입력입니다.")
    @Email(message = "유효한 이메일 주소를 입력하세요.")
    private String email;

    @NotBlank(message = "비밀번호는 필수 입력입니다.")
    @Size(min = 4, max = 50, message = "비밀번호는 4자 이상 50자 이내로 입력하세요.")
    private String password;

    @NotBlank(message = "이름은 필수 입력입니다." )
    @Size(min = 2, max = 30, message = "이름은 2자 이상 30자 이내로 입력하세요.")
    private String name;

    @NotBlank(message = "성별은 필수 입력입니다.")
    private String gender;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date regDate;







}
