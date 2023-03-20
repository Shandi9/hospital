package com.example.hospital.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;

/**
 * 
 * @TableName office
 */
@TableName(value ="office")
public class Office implements Serializable {
    /**
     * 科名
     */
    @TableId
    private String officeName;

    /**
     * 科室电话
     */
    private String officePhone;

    /**
     * 科室地址
     */
    private String officeAddress;

    /**
     * 科室医生
     */
    private String doctorName;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    /**
     * 科名
     */
    public String getOfficeName() {
        return officeName;
    }

    /**
     * 科名
     */
    public void setOfficeName(String officeName) {
        this.officeName = officeName;
    }

    /**
     * 科室电话
     */
    public String getOfficePhone() {
        return officePhone;
    }

    /**
     * 科室电话
     */
    public void setOfficePhone(String officePhone) {
        this.officePhone = officePhone;
    }

    /**
     * 科室地址
     */
    public String getOfficeAddress() {
        return officeAddress;
    }

    /**
     * 科室地址
     */
    public void setOfficeAddress(String officeAddress) {
        this.officeAddress = officeAddress;
    }

    /**
     * 科室医生
     */
    public String getDoctorName() {
        return doctorName;
    }

    /**
     * 科室医生
     */
    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
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
        Office other = (Office) that;
        return (this.getOfficeName() == null ? other.getOfficeName() == null : this.getOfficeName().equals(other.getOfficeName()))
            && (this.getOfficePhone() == null ? other.getOfficePhone() == null : this.getOfficePhone().equals(other.getOfficePhone()))
            && (this.getOfficeAddress() == null ? other.getOfficeAddress() == null : this.getOfficeAddress().equals(other.getOfficeAddress()))
            && (this.getDoctorName() == null ? other.getDoctorName() == null : this.getDoctorName().equals(other.getDoctorName()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOfficeName() == null) ? 0 : getOfficeName().hashCode());
        result = prime * result + ((getOfficePhone() == null) ? 0 : getOfficePhone().hashCode());
        result = prime * result + ((getOfficeAddress() == null) ? 0 : getOfficeAddress().hashCode());
        result = prime * result + ((getDoctorName() == null) ? 0 : getDoctorName().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", officeName=").append(officeName);
        sb.append(", officePhone=").append(officePhone);
        sb.append(", officeAddress=").append(officeAddress);
        sb.append(", doctorName=").append(doctorName);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}