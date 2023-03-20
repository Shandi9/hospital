package com.example.hospital.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.hospital.domain.Room;
import com.example.hospital.service.RoomService;
import com.example.hospital.mapper.RoomMapper;
import org.springframework.stereotype.Service;

/**
* @author chenz
* @description 针对表【room】的数据库操作Service实现
* @createDate 2023-02-23 23:49:04
*/
@Service
public class RoomServiceImpl extends ServiceImpl<RoomMapper, Room>
    implements RoomService{

}




