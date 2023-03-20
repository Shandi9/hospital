package com.example.hospital.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;

/**
 * 
 * @TableName register
 */
@TableName(value ="register")
public class Register implements Serializable {
    /**
     * 挂号
     */
    @TableId(value = "register_id",type = IdType.AUTO)
    private Long registerId;

    /**
     * 病人编号
     */
    private String registerPid;

    /**
     * 挂号类型
     */
    private String registerType;

    /**
     * 科室编号
     */
    private String registerOffice;

    /**
     * 医生编号
     */
    private String registerDid;

    /**
     * 
     */
    private Date registerTime;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    /**
     * 挂号
     */
    public Long getRegisterId() {
        return registerId;
    }

    /**
     * 挂号
     */
    public void setRegisterId(Long registerId) {
        this.registerId = registerId;
    }

    /**
     * 病人编号
     */
    public String getRegisterPid() {
        return registerPid;
    }

    /**
     * 病人编号
     */
    public void setRegisterPid(String registerPid) {
        this.registerPid = registerPid;
    }

    /**
     * 挂号类型
     */
    public String getRegisterType() {
        return registerType;
    }

    /**
     * 挂号类型
     */
    public void setRegisterType(String registerType) {
        this.registerType = registerType;
    }

    /**
     * 科室编号
     */
    public String getRegisterOffice() {
        return registerOffice;
    }

    /**
     * 科室编号
     */
    public void setRegisterOffice(String registerOffice) {
        this.registerOffice = registerOffice;
    }

    /**
     * 医生编号
     */
    public String getRegisterDid() {
        return registerDid;
    }

    /**
     * 医生编号
     */
    public void setRegisterDid(String registerDid) {
        this.registerDid = registerDid;
    }

    /**
     * 
     */
    public Date getRegisterTime() {
        return registerTime;
    }

    /**
     * 
     */
    public void setRegisterTime(Date registerTime) {
        this.registerTime = registerTime;
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
        Register other = (Register) that;
        return (this.getRegisterId() == null ? other.getRegisterId() == null : this.getRegisterId().equals(other.getRegisterId()))
            && (this.getRegisterPid() == null ? other.getRegisterPid() == null : this.getRegisterPid().equals(other.getRegisterPid()))
            && (this.getRegisterType() == null ? other.getRegisterType() == null : this.getRegisterType().equals(other.getRegisterType()))
            && (this.getRegisterOffice() == null ? other.getRegisterOffice() == null : this.getRegisterOffice().equals(other.getRegisterOffice()))
            && (this.getRegisterDid() == null ? other.getRegisterDid() == null : this.getRegisterDid().equals(other.getRegisterDid()))
            && (this.getRegisterTime() == null ? other.getRegisterTime() == null : this.getRegisterTime().equals(other.getRegisterTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getRegisterId() == null) ? 0 : getRegisterId().hashCode());
        result = prime * result + ((getRegisterPid() == null) ? 0 : getRegisterPid().hashCode());
        result = prime * result + ((getRegisterType() == null) ? 0 : getRegisterType().hashCode());
        result = prime * result + ((getRegisterOffice() == null) ? 0 : getRegisterOffice().hashCode());
        result = prime * result + ((getRegisterDid() == null) ? 0 : getRegisterDid().hashCode());
        result = prime * result + ((getRegisterTime() == null) ? 0 : getRegisterTime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", registerId=").append(registerId);
        sb.append(", registerPid=").append(registerPid);
        sb.append(", registerType=").append(registerType);
        sb.append(", registerOffice=").append(registerOffice);
        sb.append(", registerDid=").append(registerDid);
        sb.append(", registerTime=").append(registerTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}