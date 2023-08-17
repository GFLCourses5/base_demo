package com.example.base_demo;

public class UserDTO {
    private Integer id;
    private String name;
    private Boolean b1;
    private boolean b2;

    public UserDTO() {

    }

    public UserDTO(Integer id, String name, Boolean b1, boolean b2) {
        this.id = id;
        this.name = name;
        this.b1 = b1;
        this.b2 = b2;
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

    public Boolean getB1() {
        return b1;
    }

    public void setB1(Boolean b1) {
        this.b1 = b1;
    }

    public boolean isB2() {
        return b2;
    }

    public void setB2(boolean b2) {
        this.b2 = b2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof UserDTO)) return false;

        UserDTO userDTO = (UserDTO) o;

        if (isB2() != userDTO.isB2()) return false;
        if (getId() != null ? !getId().equals(userDTO.getId()) : userDTO.getId() != null) return false;
        if (getName() != null ? !getName().equals(userDTO.getName()) : userDTO.getName() != null) return false;
        return getB1() != null ? getB1().equals(userDTO.getB1()) : userDTO.getB1() == null;
    }

    @Override
    public int hashCode() {
        int result = getId() != null ? getId().hashCode() : 0;
        result = 31 * result + (getName() != null ? getName().hashCode() : 0);
        result = 31 * result + (getB1() != null ? getB1().hashCode() : 0);
        result = 31 * result + (isB2() ? 1 : 0);
        return result;
    }
}
