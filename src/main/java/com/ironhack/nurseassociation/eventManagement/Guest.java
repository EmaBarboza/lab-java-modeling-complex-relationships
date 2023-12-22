package com.ironhack.nurseassociation.eventManagement;

import com.ironhack.nurseassociation.memberAndGuestStatus.Status;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "guests")
public class Guest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    @Enumerated(EnumType.STRING)
    private Status status;
}
