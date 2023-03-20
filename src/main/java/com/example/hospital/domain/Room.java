package com.example.hospital.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;

/**
 * 
 * @TableName room
 */
@TableName(value ="room")
public class Room implements Serializable {
    /**
     * 病房号
     */
    @TableId
    private String roomNo;

    /**
     * 所属科室名
     */
    private String roomOffice;

    /**
     * 收费标准
     */
    private String roomMoney;

    /**
     * 总床位数
     */
    private Integer roomBed;

    /**
     * 已使用床位数
     */
    private Integer roomUsebed;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    /**
     * 病房号
     */
    public String getRoomNo() {
        return roomNo;
    }

    /**
     * 病房号
     */
    public void setRoomNo(String roomNo) {
        this.roomNo = roomNo;
    }

    /**
     * 所属科室名
     */
    public String getRoomOffice() {
        return roomOffice;
    }

    /**
     * 所属科室名
     */
    public void setRoomOffice(String roomOffice) {
        this.roomOffice = roomOffice;
    }

    /**
     * 收费标准
     */
    public String getRoomMoney() {
        return roomMoney;
    }

    /**
     * 收费标准
     */
    public void setRoomMoney(String roomMoney) {
        this.roomMoney = roomMoney;
    }

    /**
     * 总床位数
     */
    public Integer getRoomBed() {
        return roomBed;
    }

    /**
     * 总床位数
     */
    public void setRoomBed(Integer roomBed) {
        this.roomBed = roomBed;
    }

    /**
     * 已使用床位数
     */
    public Integer getRoomUsebed() {
        return roomUsebed;
    }

    /**
     * 已使用床位数
     */
    public void setRoomUsebed(Integer roomUsebed) {
        this.roomUsebed = roomUsebed;
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
        Room other = (Room) that;
        return (this.getRoomNo() == null ? other.getRoomNo() == null : this.getRoomNo().equals(other.getRoomNo()))
            && (this.getRoomOffice() == null ? other.getRoomOffice() == null : this.getRoomOffice().equals(other.getRoomOffice()))
            && (this.getRoomMoney() == null ? other.getRoomMoney() == null : this.getRoomMoney().equals(other.getRoomMoney()))
            && (this.getRoomBed() == null ? other.getRoomBed() == null : this.getRoomBed().equals(other.getRoomBed()))
            && (this.getRoomUsebed() == null ? other.getRoomUsebed() == null : this.getRoomUsebed().equals(other.getRoomUsebed()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getRoomNo() == null) ? 0 : getRoomNo().hashCode());
        result = prime * result + ((getRoomOffice() == null) ? 0 : getRoomOffice().hashCode());
        result = prime * result + ((getRoomMoney() == null) ? 0 : getRoomMoney().hashCode());
        result = prime * result + ((getRoomBed() == null) ? 0 : getRoomBed().hashCode());
        result = prime * result + ((getRoomUsebed() == null) ? 0 : getRoomUsebed().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", roomNo=").append(roomNo);
        sb.append(", roomOffice=").append(roomOffice);
        sb.append(", roomMoney=").append(roomMoney);
        sb.append(", roomBed=").append(roomBed);
        sb.append(", roomUsebed=").append(roomUsebed);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}