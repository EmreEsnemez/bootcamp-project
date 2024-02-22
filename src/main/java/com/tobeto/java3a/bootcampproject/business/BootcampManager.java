package com.tobeto.java3a.bootcampproject.business;

import com.tobeto.java3a.bootcampproject.core.dtos.bootcamp.BootcampDto;
import com.tobeto.java3a.bootcampproject.core.dtos.bootcamp.SaveBootcampDto;
import com.tobeto.java3a.bootcampproject.dataaccess.BootcampRepository;
import com.tobeto.java3a.bootcampproject.entities.bootcamp.Bootcamp;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class BootcampManager {

    private final BootcampRepository bootcampRepository;
    private final ModelMapper modelMapper;

    public List<BootcampDto> getAll() {
        return bootcampRepository.findAll().stream()
                .map((bootcamp) -> modelMapper.map(bootcamp, BootcampDto.class))
                .collect(Collectors.toList());
    }

    public BootcampDto getById(Long id) {
        return modelMapper.map(bootcampRepository.findById(id).get(), BootcampDto.class);
    }

    public void add(SaveBootcampDto bootcampDto) {
        bootcampRepository.save(modelMapper.map(bootcampDto, Bootcamp.class));
    }

    public void update(Long id, SaveBootcampDto bootcampDto) {
        Bootcamp bootcamp = modelMapper.map(bootcampDto, Bootcamp.class);
        bootcamp.setId(id);

        bootcampRepository.save(bootcamp);
    }

    public void removeById(Long id) {
        bootcampRepository.deleteById(id);
    }
}
