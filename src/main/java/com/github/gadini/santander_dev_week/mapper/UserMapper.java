package com.github.gadini.santander_dev_week.mapper;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.github.gadini.santander_dev_week.dto.UserResponseDto;
import com.github.gadini.santander_dev_week.model.User;

@Component
public class UserMapper {

	@Autowired
	private ModelMapper modelMapper;
	
	public UserResponseDto toDto(User user){
		UserResponseDto result = modelMapper.map(user, UserResponseDto.class);
        return result;
    }

}
