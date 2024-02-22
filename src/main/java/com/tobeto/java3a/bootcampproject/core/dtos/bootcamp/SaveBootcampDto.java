package com.tobeto.java3a.bootcampproject.core.dtos.bootcamp;

import com.tobeto.java3a.bootcampproject.entities.bootcamp.BootcampState;
import com.tobeto.java3a.bootcampproject.entities.user.Instructor;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@RequiredArgsConstructor
@AllArgsConstructor
public class SaveBootcampDto {

    private String name;

    private LocalDateTime startDate;
    private LocalDateTime endDate;

    private Instructor instructor;

    private BootcampState bootcampState;
    
}
