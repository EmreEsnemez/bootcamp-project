package com.tobeto.java3a.bootcampproject.business;

import com.tobeto.java3a.bootcampproject.core.dtos.application.ApplicationDto;
import com.tobeto.java3a.bootcampproject.core.dtos.user.applicant.SaveApplicantDto;
import com.tobeto.java3a.bootcampproject.dataaccess.ApplicantRepository;
import com.tobeto.java3a.bootcampproject.dataaccess.ApplicationRepository;
import com.tobeto.java3a.bootcampproject.entities.application.Application;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ApplicationManager {

    private final ApplicationRepository applicationRepository;
    private final ModelMapper modelMapper;
    private final ApplicantRepository applicantRepository;

    public List<ApplicationDto> getAll() {
        return applicationRepository.findAll().stream()
                .map((application) -> modelMapper.map(application, ApplicationDto.class))
                .collect(Collectors.toList());
    }

    public ApplicationDto getById(Long id) {
        return modelMapper.map(applicationRepository.findById(id).get(), ApplicationDto.class);
    }

    public void add(ApplicationDto applicationDto) {
        applicationRepository.save(modelMapper.map(applicationDto, Application.class));
    }

    public void update(Long id, SaveApplicantDto applicantDto) {
        Application application = modelMapper.map(applicantDto, Application.class);
        application.setId(id);

        applicationRepository.save(application);
    }

    public void removeById(Long id) {
        applicationRepository.deleteById(id);
    }
}
