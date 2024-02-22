package com.tobeto.java3a.bootcampproject.entities.application;

import com.tobeto.java3a.bootcampproject.entities.bootcamp.Bootcamp;
import com.tobeto.java3a.bootcampproject.entities.common.BaseEntity;
import com.tobeto.java3a.bootcampproject.entities.user.Applicant;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@RequiredArgsConstructor
@AllArgsConstructor
public class Application extends BaseEntity {

    @ManyToOne
    private Applicant applicant;

    @ManyToOne
    private Bootcamp bootcamp;

    @ManyToOne
    private ApplicationState applicationState;
}
