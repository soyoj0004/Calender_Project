package com.javalab.calendar.Entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

import java.io.Serializable;

/**
 * 사용자 엔티티 클래스
 * - 사용자 정보를 저장하는 엔티티 클래스
 * - 엔티티 매니저에 의해서 자동으로 데이터 베이스 테이블로 생성된다.
 * - @Entity : 엔티티 클래스임을 명시
 * - @Table(name = "user") : member 테이블 생성
 * - vo : 엔티티에서는 Vo라는 접이어를 붙이지 않는게 관례이다.
 * = @Builder : 빌더 패턴으로 엔티티 객체를 편리하게 생성해주기 위한 어노테이션
 */


@Entity
@Table(name = "user")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Builder

public class User implements Serializable {

    private static  final long serialVersionUID = 1L;

    // @Id : 기본키, 영속영역에서 식별자로 사용, 테이블에서는 PK로 사용한다
    // @Column(name = "user_id", length = 50) : member_id 컬럼명, 길이 50

    //@Id
    //@Column(name= "user_id")


}
