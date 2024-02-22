package com.tobeto.java3a.bootcampproject.core.dtos.application;

import com.tobeto.java3a.bootcampproject.entities.application.ApplicationState;
import com.tobeto.java3a.bootcampproject.entities.bootcamp.Bootcamp;
import com.tobeto.java3a.bootcampproject.entities.user.Applicant;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
@AllArgsConstructor
public class SaveApplicationDto {

    private Applicant applicant;

    private Bootcamp bootcamp;

    private ApplicationState applicationState;

}
