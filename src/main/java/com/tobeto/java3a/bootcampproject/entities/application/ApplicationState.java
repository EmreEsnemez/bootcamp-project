package com.tobeto.java3a.bootcampproject.entities.application;

import com.tobeto.java3a.bootcampproject.entities.common.BaseEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
public class ApplicationState extends BaseEntity {

    private String name;

    @OneToMany(mappedBy = "applicationState")
    private List<Application> applications;
}
