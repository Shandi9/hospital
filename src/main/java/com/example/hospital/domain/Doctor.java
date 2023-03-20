package com.example.hospital.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;

/**
 * 
 * @TableName doctor
 */
@TableName(value ="doctor")
public class Doctor implements Serializable {
    /**
     * 工作证号
     */
    @TableId(value = "doctor_no",type = IdType.AUTO)
    private Long doctorNo;

    /**
     * 姓名
     */
    private String doctorName;

    /**
     * 权限
     */
    private String type;

    /**
     * 职称
     */
    private String doctorPost;

    /**
     * 所属科室名
     */
    private String doctorOffice;

    /**
     * 年龄
     */
    private Integer doctorAge;

    /**
     * 性别
     */
    private String doctorSex;

    /**
     * 电话
     */
    private String doctorNum;

    /**
     * 
     */
    private Date creamTime;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    /**
     * 工作证号
     */
    public Long getDoctorNo() {
        return doctorNo;
    }

    /**
     * 工作证号
     */
    public void setDoctorNo(Long doctorNo) {
        this.doctorNo = doctorNo;
    }

    /**
     * 姓名
     */
    public String getDoctorName() {
        return doctorName;
    }

    /**
     * 姓名
     */
    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    /**
     * 职称
     */
    public String getDoctorPost() {
        return doctorPost;
    }

    /**
     * 职称
     */
    public void setDoctorPost(String doctorPost) {
        this.doctorPost = doctorPost;
    }

    /**
     * 所属科室名
     */
    public String getDoctorOffice() {
        return doctorOffice;
    }

    /**
     * 所属科室名
     */
    public void setDoctorOffice(String doctorOffice) {
        this.doctorOffice = doctorOffice;
    }

    /**
     * 年龄
     */
    public Integer getDoctorAge() {
        return doctorAge;
    }

    /**
     * 年龄
     */
    public void setDoctorAge(Integer doctorAge) {
        this.doctorAge = doctorAge;
    }

    /**
     * 性别
     */
    public String getDoctorSex() {
        return doctorSex;
    }

    /**
     * 性别
     */
    public void setDoctorSex(String doctorSex) {
        this.doctorSex = doctorSex;
    }

    /**
     * 电话
     */
    public String getDoctorNum() {
        return doctorNum;
    }

    /**
     * 电话
     */
    public void setDoctorNum(String doctorNum) {
        this.doctorNum = doctorNum;
    }


    /**
     * 权限
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    /**
     * 
     */
    public Date getCreamTime() {
        return creamTime;
    }

    /**
     * 
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
        Doctor other = (Doctor) that;
        return (this.getDoctorNo() == null ? other.getDoctorNo() == null : this.getDoctorNo().equals(other.getDoctorNo()))
            && (this.getDoctorName() == null ? other.getDoctorName() == null : this.getDoctorName().equals(other.getDoctorName()))
            && (this.getDoctorPost() == null ? other.getDoctorPost() == null : this.getDoctorPost().equals(other.getDoctorPost()))
            && (this.getDoctorOffice() == null ? other.getDoctorOffice() == null : this.getDoctorOffice().equals(other.getDoctorOffice()))
            && (this.getDoctorAge() == null ? other.getDoctorAge() == null : this.getDoctorAge().equals(other.getDoctorAge()))
            && (this.getDoctorSex() == null ? other.getDoctorSex() == null : this.getDoctorSex().equals(other.getDoctorSex()))
            && (this.getDoctorNum() == null ? other.getDoctorNum() == null : this.getDoctorNum().equals(other.getDoctorNum()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getCreamTime() == null ? other.getCreamTime() == null : this.getCreamTime().equals(other.getCreamTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getDoctorNo() == null) ? 0 : getDoctorNo().hashCode());
        result = prime * result + ((getDoctorName() == null) ? 0 : getDoctorName().hashCode());
        result = prime * result + ((getDoctorPost() == null) ? 0 : getDoctorPost().hashCode());
        result = prime * result + ((getDoctorOffice() == null) ? 0 : getDoctorOffice().hashCode());
        result = prime * result + ((getDoctorAge() == null) ? 0 : getDoctorAge().hashCode());
        result = prime * result + ((getDoctorSex() == null) ? 0 : getDoctorSex().hashCode());
        result = prime * result + ((getDoctorNum() == null) ? 0 : getDoctorNum().hashCode());
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
        sb.append(", doctorNo=").append(doctorNo);
        sb.append(", doctorName=").append(doctorName);
        sb.append(", doctorPost=").append(doctorPost);
        sb.append(", doctorOffice=").append(doctorOffice);
        sb.append(", doctorAge=").append(doctorAge);
        sb.append(", doctorSex=").append(doctorSex);
        sb.append(", doctorNum=").append(doctorNum);
        sb.append(", type=").append(type);
        sb.append(", creamTime=").append(creamTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

}