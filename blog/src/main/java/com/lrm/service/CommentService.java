package com.lrm.service;

import com.lrm.po.Comment;

import java.util.List;

/**
 * Created by limi on
 */
public interface CommentService {

    List<Comment> listCommentByBlogId(Long blogId);

    Comment saveComment(Comment comment);
}
