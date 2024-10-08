package com.github.gadini.santander_dev_week.dto;

import org.modelmapper.ModelMapper;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserResponseDto {

	private Long id;
    private String name;
    private static final ModelMapper mapper = new ModelMapper();
	
}
