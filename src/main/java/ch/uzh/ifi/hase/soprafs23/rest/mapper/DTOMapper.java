package ch.uzh.ifi.hase.soprafs23.rest.mapper;

import ch.uzh.ifi.hase.soprafs23.entity.User;
import ch.uzh.ifi.hase.soprafs23.rest.dto.UserGetDTO;
import ch.uzh.ifi.hase.soprafs23.rest.dto.UserPostDTO;
import ch.uzh.ifi.hase.soprafs23.rest.dto.UserPutDTO;
import org.mapstruct.*;
import org.mapstruct.factory.Mappers;

/**
 * DTOMapper
 * This class is responsible for generating classes that will automatically transform/map
 * the internal representation of an entity (e.g., the User) to the external/API representation
 * (e.g., UserGetDTO for getting, UserPostDTO for creating) and vice versa.
 * Always created one mapper for (GET) and one mapper for (POST).
 */
@Mapper
public interface DTOMapper {
    DTOMapper INSTANCE = Mappers.getMapper(DTOMapper.class);

    @Mapping(source = "username", target = "username")
    @Mapping(source = "password", target = "password")
    User convertUserPostDTOtoEntity(UserPostDTO userPostDTO);

    @Mapping(source = "username", target = "username")
    @Mapping(source = "password", target = "password")
    @Mapping(source = "birthDay", target = "birthDay")
    User convertUserPutDTOtoEntity(UserPutDTO userPutDTO);

    @Mapping(source = "userId", target = "userId")
    @Mapping(source = "username", target = "username")
    @Mapping(source = "password", target = "password")
    @Mapping(source = "status", target = "status")
    @Mapping(source = "createDay", target = "createDay")
    @Mapping(source = "birthDay", target = "birthDay")
    UserGetDTO convertEntityToUserGetDTO(User user);
}