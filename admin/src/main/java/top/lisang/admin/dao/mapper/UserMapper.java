package top.lisang.admin.dao.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import top.lisang.admin.dao.entity.UserDO;

@Mapper
public interface UserMapper extends BaseMapper<UserDO> {

}
