package org.teamproject.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.teamproject.commons.constants.Role;

@Entity
@Data @Builder
@NoArgsConstructor @AllArgsConstructor
public class Books extends BaseEntity{

    @Id @GeneratedValue
    private Long bookNo;

    @Column(nullable = false, updatable = false)
    private String bookId;

    @Column(length = 100, nullable = false)
    private String bookNm;

    @Column(nullable = false)
    private Long price;

    @Enumerated(EnumType.STRING)
    private Role role;
}