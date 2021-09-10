package com.plant;

import javax.persistence.*;

@Entity
@Table
public class Plant {
    @Id
    @SequenceGenerator(
            name = "plant_sequence",
            sequenceName = "plant_sequence",
            allocationSize = 1
    )

    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "plant_sequence"
    )

    Long id;
    String name;
    String latin_name;
    String plant_type; //MIGHT BE BETTER AS A BOOLEAN!!! def change to boolean pls xox
    String water;
    String light;
    String experience;

    public Plant(Long id, String name, String latin_name, String plant_type, String water, String light, String experience) {
        this.id = id;
        this.name = name;
        this.latin_name = latin_name;
        this.plant_type = plant_type;
        this.water = water;
        this.light = light;
        this.experience = experience;
    }

    public Plant(String name, String latin_name, String plant_type, String water, String light, String experience) {
        this.name = name;
        this.latin_name = latin_name;
        this.plant_type = plant_type;
        this.water = water;
        this.light = light;
        this.experience = experience;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLatin_name() {
        return latin_name;
    }

    public void setLatin_name(String latin_name) {
        this.latin_name = latin_name;
    }

    public String getPlant_type() {
        return plant_type;
    }

    public void setPlant_type(String plant_type) {
        this.plant_type = plant_type;
    }

    public String getWater() {
        return water;
    }

    public void setWater(String water) {
        this.water = water;
    }

    public String getLight() {
        return light;
    }

    public void setLight(String light) {
        this.light = light;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "Plant{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", latin_name='" + latin_name + '\'' +
                ", plant_type='" + plant_type + '\'' +
                ", water='" + water + '\'' +
                ", light='" + light + '\'' +
                ", experience='" + experience + '\'' +
                '}';
    }
}
