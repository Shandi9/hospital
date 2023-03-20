package com.example.hospital.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;

/**
 * 
 * @TableName user
 */
@TableName(value ="user")
public class User implements Serializable {
    /**
     * 用户id
     */
    @TableId(value = "user_id",type = IdType.AUTO)
    private Long userId;

    /**
     * 用户姓名
     */
    @TableField(value = "user_name")  // 指定数据库的字段名称
    private String userName;

    /**
     * 用户密码
     */
    private String userPassword;

    /**
     * 用户身份
     */
    private String userType;

    /**
     * 创建时间
     */
    private Date creamTime;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    /**
     * 用户id
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * 用户id
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * 用户姓名
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 用户姓名
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * 用户密码
     */
    public String getUserPassword() {
        return userPassword;
    }

    /**
     * 用户密码
     */
    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    /**
     * 用户身份
     */
    public String getUserType() {
        return userType;
    }

    /**
     * 用户身份
     */
    public void setUserType(String userType) {
        this.userType = userType;
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
        User other = (User) that;
        return (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getUserName() == null ? other.getUserName() == null : this.getUserName().equals(other.getUserName()))
            && (this.getUserPassword() == null ? other.getUserPassword() == null : this.getUserPassword().equals(other.getUserPassword()))
            && (this.getUserType() == null ? other.getUserType() == null : this.getUserType().equals(other.getUserType()))
            && (this.getCreamTime() == null ? other.getCreamTime() == null : this.getCreamTime().equals(other.getCreamTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getUserName() == null) ? 0 : getUserName().hashCode());
        result = prime * result + ((getUserPassword() == null) ? 0 : getUserPassword().hashCode());
        result = prime * result + ((getUserType() == null) ? 0 : getUserType().hashCode());
        result = prime * result + ((getCreamTime() == null) ? 0 : getCreamTime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", userId=").append(userId);
        sb.append(", userName=").append(userName);
        sb.append(", userPassword=").append(userPassword);
        sb.append(", userType=").append(userType);
        sb.append(", creamTime=").append(creamTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}