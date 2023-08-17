package com.example.base_demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class UserDTOTest {

    @Test
    public void testEquals() {
        UserDTO userDTO = new UserDTO(1, "Test");
        UserDTO emptyUserDTO = new UserDTO();
        emptyUserDTO.setId(1);
        emptyUserDTO.setName("Test");
        Assertions.assertEquals(userDTO, emptyUserDTO);
    }
}
