package com.ironhack.nurseassociation.association;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;
@Data
@Entity
@Table(name = "chapters")
public class Chapter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int chapterId;
    private String name;
    private String district;
    @ManyToOne
    @JoinColumn(name = "member_id")
    private Member president;
    @ManyToMany
    @JoinTable(
            name = "chapter_members",
            joinColumns = @JoinColumn(name = "chapter_id"),
            inverseJoinColumns = @JoinColumn(name = "member_id")

    )
    private List<Member> memberList;
}
