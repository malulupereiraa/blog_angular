package com.nooma.noomablog.repository;

import com.nooma.noomablog.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
}
