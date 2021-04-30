package br.com.rafaelq80.personapi.dto.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import br.com.rafaelq80.personapi.dto.request.PersonDTO;
import br.com.rafaelq80.personapi.model.Person;

@Mapper(componentModel = "spring")
public interface PersonMapper {

    // PersonMapper INSTANCE = Mappers.getMapper(PersonMapper.class);

    @Mapping(target = "birthDate", source = "birthDate", dateFormat = "dd-MM-yyyy")
    Person toModel(PersonDTO dto);

    PersonDTO toDTO(Person dto);
}
