package com.example.attendance_management_system.DTO;

import com.example.attendance_management_system.Entities.User;

import java.time.LocalDate;

public class AttendanceDTO {
    private Long id;

    private User user;

    private LocalDate date;
    private Boolean present;

    public AttendanceDTO(Long id, User user, LocalDate date, Boolean present) {
        this.id = id;
        this.user = user;
        this.date = date;
        this.present = present;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Boolean getPresent() {
        return present;
    }

    public void setPresent(Boolean present) {
        this.present = present;
    }
}
