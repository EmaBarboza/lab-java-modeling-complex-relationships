package com.ironhack.nurseassociation.eventManagement;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "speakers")
public class Speaker {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int speakerId;
    public String speakerName;
    private int presentationDuration;
}
