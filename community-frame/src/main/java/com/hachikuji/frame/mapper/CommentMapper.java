package com.hachikuji.frame.mapper;

import com.hachikuji.frame.pojo.Comment;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 *
 * @author hachikuji
 * @since 2021-11-29
 */
@Mapper
public interface CommentMapper extends BaseMapper<Comment> {
}
