package com.mx.tec.people.people2.dto;




import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiParam;

import java.io.Serializable;

@ApiModel(value = "People")
public class PeopleVO implements Serializable {
    public PeopleVO() {
    }

    private Integer id;

    @ApiModelProperty(value = "Nombre", example = "beto", required = true, dataType = "String")
    @ApiParam(value = "name")
    private String name;
    private String lastNameFather;
    private String lastNameMother;
    private String gender;
    private Integer age;

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

    public String getLastNameFather() {
        return lastNameFather;
    }

    public void setLastNameFather(String lastNameFather) {
        this.lastNameFather = lastNameFather;
    }

    public String getLastNameMother() {
        return lastNameMother;
    }

    public void setLastNameMother(String lastNameMother) {
        this.lastNameMother = lastNameMother;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
