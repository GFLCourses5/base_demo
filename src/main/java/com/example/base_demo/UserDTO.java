package com.example.base_demo;

public class UserDTO {
    private Integer id;
    private String name;

    public UserDTO() {
    }

    public UserDTO(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof UserDTO)) return false;

        UserDTO userDTO = (UserDTO) o;

        if (getId() != null ? !getId().equals(userDTO.getId()) : userDTO.getId() != null) return false;
        return getName() != null ? getName().equals(userDTO.getName()) : userDTO.getName() == null;
    }

    @Override
    public int hashCode() {
        int result = getId() != null ? getId().hashCode() : 0;
        result = 31 * result + (getName() != null ? getName().hashCode() : 0);
        return result;
    }
}
