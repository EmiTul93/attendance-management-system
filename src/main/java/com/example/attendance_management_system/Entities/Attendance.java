package com.example.attendance_management_system.Entities;

import jakarta.persistence.*;

import java.time.LocalDate;

public class Attendance {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn( name = "user_id")
    private User user;

    private LocalDate date;
    private Boolean present;
}
