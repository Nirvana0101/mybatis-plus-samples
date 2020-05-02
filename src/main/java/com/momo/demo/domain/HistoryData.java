package com.momo.demo.domain;

import com.baomidou.mybatisplus.annotation.TableName;

import java.util.Date;


@TableName("historydata")
public class HistoryData {
    private Integer id;

    private Integer eboxnum;

    private Integer lanenum;

    private Integer workmode;

    private Integer axlecount;

    private Integer vehicletype;

    private Integer breachtype;

    private Integer platecolour;

    private Integer vehiclecolour;

    private Float speed;

    private Float weight;

    private Float totalaxlespace;

    private Date collecttime;

    private String direction;

    private String eboxcolumn;

    private String platenum;

    private String axlespace;

    private String axleweight;

    private String breachdetail;

    private String platepicname;

    private String scenepicname;

    private String frontpicname;

    private String backpicname;

    private String leftpicname;

    private String rightpicname;

    private String videofilename;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getEboxnum() {
        return eboxnum;
    }

    public void setEboxnum(Integer eboxnum) {
        this.eboxnum = eboxnum;
    }

    public Integer getLanenum() {
        return lanenum;
    }

    public void setLanenum(Integer lanenum) {
        this.lanenum = lanenum;
    }

    public Integer getWorkmode() {
        return workmode;
    }

    public void setWorkmode(Integer workmode) {
        this.workmode = workmode;
    }

    public Integer getAxlecount() {
        return axlecount;
    }

    public void setAxlecount(Integer axlecount) {
        this.axlecount = axlecount;
    }

    public Integer getVehicletype() {
        return vehicletype;
    }

    public void setVehicletype(Integer vehicletype) {
        this.vehicletype = vehicletype;
    }

    public Integer getBreachtype() {
        return breachtype;
    }

    public void setBreachtype(Integer breachtype) {
        this.breachtype = breachtype;
    }

    public Integer getPlatecolour() {
        return platecolour;
    }

    public void setPlatecolour(Integer platecolour) {
        this.platecolour = platecolour;
    }

    public Integer getVehiclecolour() {
        return vehiclecolour;
    }

    public void setVehiclecolour(Integer vehiclecolour) {
        this.vehiclecolour = vehiclecolour;
    }

    public Float getSpeed() {
        return speed;
    }

    public void setSpeed(Float speed) {
        this.speed = speed;
    }

    public Float getWeight() {
        return weight;
    }

    public void setWeight(Float weight) {
        this.weight = weight;
    }

    public Float getTotalaxlespace() {
        return totalaxlespace;
    }

    public void setTotalaxlespace(Float totalaxlespace) {
        this.totalaxlespace = totalaxlespace;
    }

    public Date getCollecttime() {
        return collecttime;
    }

    public void setCollecttime(Date collecttime) {
        this.collecttime = collecttime;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public String getEboxcolumn() {
        return eboxcolumn;
    }

    public void setEboxcolumn(String eboxcolumn) {
        this.eboxcolumn = eboxcolumn;
    }

    public String getPlatenum() {
        return platenum;
    }

    public void setPlatenum(String platenum) {
        this.platenum = platenum;
    }

    public String getAxlespace() {
        return axlespace;
    }

    public void setAxlespace(String axlespace) {
        this.axlespace = axlespace;
    }

    public String getAxleweight() {
        return axleweight;
    }

    public void setAxleweight(String axleweight) {
        this.axleweight = axleweight;
    }

    public String getBreachdetail() {
        return breachdetail;
    }

    public void setBreachdetail(String breachdetail) {
        this.breachdetail = breachdetail;
    }

    public String getPlatepicname() {
        return platepicname;
    }

    public void setPlatepicname(String platepicname) {
        this.platepicname = platepicname;
    }

    public String getScenepicname() {
        return scenepicname;
    }

    public void setScenepicname(String scenepicname) {
        this.scenepicname = scenepicname;
    }

    public String getFrontpicname() {
        return frontpicname;
    }

    public void setFrontpicname(String frontpicname) {
        this.frontpicname = frontpicname;
    }

    public String getBackpicname() {
        return backpicname;
    }

    public void setBackpicname(String backpicname) {
        this.backpicname = backpicname;
    }

    public String getLeftpicname() {
        return leftpicname;
    }

    public void setLeftpicname(String leftpicname) {
        this.leftpicname = leftpicname;
    }

    public String getRightpicname() {
        return rightpicname;
    }

    public void setRightpicname(String rightpicname) {
        this.rightpicname = rightpicname;
    }

    public String getVideofilename() {
        return videofilename;
    }

    public void setVideofilename(String videofilename) {
        this.videofilename = videofilename;
    }


}