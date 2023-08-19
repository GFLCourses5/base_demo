package com.example.base_demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class UserDTOTest {

    @Test
    public void testEquals() {
        UserDTO userDTO = new UserDTO(1, "Test", false, false);
        UserDTO emptyUserDTO = new UserDTO();
        emptyUserDTO.setId(1);
        emptyUserDTO.setName("Test");
        emptyUserDTO.setB2(false);
        emptyUserDTO.setB1(false);
        Assertions.assertEquals(userDTO, emptyUserDTO);
    }

    @Test
    public void testRequairedField() {
        UserDTO userDTO = new UserDTO();
        System.out.println("asdasdkjn");
        Assertions.assertNull(userDTO.getId());
        Assertions.assertNull(userDTO.getName());
        Assertions.assertNull(userDTO.getB1());
        Assertions.assertFalse(userDTO.isB2());
    }

    @Test
    public void testToString() {
        UserDTO userDTO = new UserDTO(1, "test name" , true, false);
        Assertions.assertEquals("UserDTO{id=1, name='test name', b1=true, b2=false}", userDTO.toString());
    }
}
