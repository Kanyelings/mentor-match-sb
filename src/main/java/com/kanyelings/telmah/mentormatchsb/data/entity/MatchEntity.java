package com.kanyelings.telmah.mentormatchsb.data.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter @Setter @Builder
@NoArgsConstructor @AllArgsConstructor
public class MatchEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long matchId;

    @Column(name = "mentor_id")
    private Long mentorId;

    @Column(name = "mentee_id")
    private Long menteeId;
}
