package com.rest.api.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rest.api.entity.Comments;

public interface CommentsRepo extends JpaRepository<Comments, Long> {
    
}
