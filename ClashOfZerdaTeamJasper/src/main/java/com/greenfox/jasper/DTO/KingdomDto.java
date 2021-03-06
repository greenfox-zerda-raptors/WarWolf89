package com.greenfox.jasper.DTO;

import java.util.List;

/**
 * Created by 8560w on 2017.02.02..
 */
public class KingdomDto {
    private UserDto user;
    private List<BuildingDto> buildings;
    private List<ResourceDto> resources;
    private List<TroopDto> troops;

    public UserDto getUser() {
        return user;
    }

    public void setUser(UserDto user) {
        this.user = user;
    }

    public List<BuildingDto> getBuildings() {
        return buildings;
    }

    public void setBuildings(List<BuildingDto> buildings) {
        this.buildings = buildings;
    }

    public List<ResourceDto> getResources() {
        return resources;
    }

    public void setResources(List<ResourceDto> resources) {
        this.resources = resources;
    }

    public List<TroopDto> getTroops() {
        return troops;
    }

    public void setTroops(List<TroopDto> troops) {
        this.troops = troops;
    }
}
