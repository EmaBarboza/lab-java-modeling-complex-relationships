package com.ironhack.nurseassociation.association;

import com.ironhack.nurseassociation.memberAndGuestStatus.Status;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
@Data
@Entity
@Table(name = "members")
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int memberId;
    private String memberName;
    @Enumerated(EnumType.STRING)
    private Status status;
    private Date renewalDate;

}
