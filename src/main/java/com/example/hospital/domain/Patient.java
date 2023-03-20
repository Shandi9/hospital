package com.example.hospital.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;

/**
 * 
 * @TableName patient
 */
@TableName(value ="patient")
public class Patient implements Serializable {
    /**
     * 病例号
     */
    @TableId(value = "patient_no",type = IdType.AUTO)
    private String patientNo;

    /**
     * 姓名
     */
    private String patientName;

    /**
     * 性别
     */
    private String patientSex;

    /**
     * 诊断结果
     */
    private String patientResult;

    /**
     * 病房号
     */
    private String patientRoomno;

    /**
     * 病床号
     */
    private String patientBedno;

    /**
     * 入院日期
     */
    private Date patientIntime;

    /**
     * 主治医生
     */
    private String patientDoctor;

    /**
     * 电话
     */
    private String patientNum;
    /**
     * 权限
     */
    private String type;

    /**
     * 创建时间
     */
    private Date creamTime;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;


    /**
     * 病例号
     */
    public String getPatientNo() {
        return patientNo;
    }

    /**
     * 病例号
     */
    public void setPatientNo(String patientNo) {
        this.patientNo = patientNo;
    }

    /**
     * 姓名
     */
    public String getPatientName() {
        return patientName;
    }

    /**
     * 姓名
     */
    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    /**
     * 性别
     */
    public String getPatientSex() {
        return patientSex;
    }

    /**
     * 性别
     */
    public void setPatientSex(String patientSex) {
        this.patientSex = patientSex;
    }

    /**
     * 诊断结果
     */
    public String getPatientResult() {
        return patientResult;
    }

    /**
     * 诊断结果
     */
    public void setPatientResult(String patientResult) {
        this.patientResult = patientResult;
    }

    /**
     * 病房号
     */
    public String getPatientRoomno() {
        return patientRoomno;
    }

    /**
     * 病房号
     */
    public void setPatientRoomno(String patientRoomno) {
        this.patientRoomno = patientRoomno;
    }

    /**
     * 病床号
     */
    public String getPatientBedno() {
        return patientBedno;
    }

    /**
     * 病床号
     */
    public void setPatientBedno(String patientBedno) {
        this.patientBedno = patientBedno;
    }

    /**
     * 入院日期
     */
    public Date getPatientIntime() {
        return patientIntime;
    }

    /**
     * 入院日期
     */
    public void setPatientIntime(Date patientIntime) {
        this.patientIntime = patientIntime;
    }

    /**
     * 主治医生
     */
    public String getPatientDoctor() {
        return patientDoctor;
    }

    /**
     * 主治医生
     */
    public void setPatientDoctor(String patientDoctor) {
        this.patientDoctor = patientDoctor;
    }

    /**
     * 电话
     */
    public String getPatientNum() {
        return patientNum;
    }

    /**
     * 电话
     */
    public void setPatientNum(String patientNum) {
        this.patientNum = patientNum;
    }

    /**
     * 身份
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    /**
     * 创建时间
     */
    public Date getCreamTime() {
        return creamTime;
    }

    /**
     * 创建时间
     */
    public void setCreamTime(Date creamTime) {
        this.creamTime = creamTime;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Patient other = (Patient) that;
        return (this.getPatientNo() == null ? other.getPatientNo() == null : this.getPatientNo().equals(other.getPatientNo()))
            && (this.getPatientName() == null ? other.getPatientName() == null : this.getPatientName().equals(other.getPatientName()))
            && (this.getPatientSex() == null ? other.getPatientSex() == null : this.getPatientSex().equals(other.getPatientSex()))
            && (this.getPatientResult() == null ? other.getPatientResult() == null : this.getPatientResult().equals(other.getPatientResult()))
            && (this.getPatientRoomno() == null ? other.getPatientRoomno() == null : this.getPatientRoomno().equals(other.getPatientRoomno()))
            && (this.getPatientBedno() == null ? other.getPatientBedno() == null : this.getPatientBedno().equals(other.getPatientBedno()))
            && (this.getPatientIntime() == null ? other.getPatientIntime() == null : this.getPatientIntime().equals(other.getPatientIntime()))
            && (this.getPatientDoctor() == null ? other.getPatientDoctor() == null : this.getPatientDoctor().equals(other.getPatientDoctor()))
            && (this.getPatientNum() == null ? other.getPatientNum() == null : this.getPatientNum().equals(other.getPatientNum()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getCreamTime() == null ? other.getCreamTime() == null : this.getCreamTime().equals(other.getCreamTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getPatientNo() == null) ? 0 : getPatientNo().hashCode());
        result = prime * result + ((getPatientName() == null) ? 0 : getPatientName().hashCode());
        result = prime * result + ((getPatientSex() == null) ? 0 : getPatientSex().hashCode());
        result = prime * result + ((getPatientResult() == null) ? 0 : getPatientResult().hashCode());
        result = prime * result + ((getPatientRoomno() == null) ? 0 : getPatientRoomno().hashCode());
        result = prime * result + ((getPatientBedno() == null) ? 0 : getPatientBedno().hashCode());
        result = prime * result + ((getPatientIntime() == null) ? 0 : getPatientIntime().hashCode());
        result = prime * result + ((getPatientDoctor() == null) ? 0 : getPatientDoctor().hashCode());
        result = prime * result + ((getPatientNum() == null) ? 0 : getPatientNum().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getCreamTime() == null) ? 0 : getCreamTime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", patientNo=").append(patientNo);
        sb.append(", patientName=").append(patientName);
        sb.append(", patientSex=").append(patientSex);
        sb.append(", patientResult=").append(patientResult);
        sb.append(", patientRoomno=").append(patientRoomno);
        sb.append(", patientBedno=").append(patientBedno);
        sb.append(", patientIntime=").append(patientIntime);
        sb.append(", patientDoctor=").append(patientDoctor);
        sb.append(", patientNum=").append(patientNum);
        sb.append(", type=").append(type);
        sb.append(", creamTime=").append(creamTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

}