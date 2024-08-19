package com.example.attendance_management_system.Repositories;

import com.example.attendance_management_system.Entities.Attendance;
import com.example.attendance_management_system.Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AttendanceRepository  extends JpaRepository<Attendance, Long> {
    List<Attendance> findByUser (User user);
}
