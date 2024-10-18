package com.niit.blog.repository;

import com.niit.blog.domain.BlogPost;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogPostRepository extends JpaRepository<BlogPost,Long> {

}
