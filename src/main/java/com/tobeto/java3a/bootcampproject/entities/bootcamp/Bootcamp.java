package com.tobeto.java3a.bootcampproject.entities.bootcamp;

import com.tobeto.java3a.bootcampproject.entities.common.BaseEntity;
import com.tobeto.java3a.bootcampproject.entities.user.Instructor;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@RequiredArgsConstructor
@AllArgsConstructor
public class Bootcamp extends BaseEntity {

    private String name;

    private LocalDateTime startDate;
    private LocalDateTime endDate;

    @ManyToOne
    private Instructor instructor;

    @ManyToOne
    private BootcampState bootcampState;
}
