package com.wkcto.plus.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wkcto.plus.entity.User;

/**
 * BaseMapper中提供了17个方法
 * BaseMapper是UserMapper的父接口
 * 可以在UserMapper中直接调用BaseMapper中的方法：this.BaseMapper.方法
 */
public interface UserMapper extends BaseMapper<User> {
}
