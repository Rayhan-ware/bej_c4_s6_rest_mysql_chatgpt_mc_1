package com.niit.blog.service;

import com.niit.blog.domain.BlogPost;
import com.niit.blog.domain.User;
import com.niit.blog.repository.BlogPostRepository;
import com.niit.blog.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogServiceImpl implements BlogService{
    @Autowired
    private BlogPostRepository blogPostRepository;
    @Autowired
    private UserRepository userRepository;
    @Override
    public List<BlogPost> getAllBlogPosts() {
        return blogPostRepository.findAll();
    }

    @Override
    public List<BlogPost> getAllBlogPostsByUser(User user) {
        return user.getBlogPosts();
    }

    @Override
    public List<BlogPost> searchBlogPosts(String keyword) {
        // Implement search logic here
        return null;
    }

    @Override
    public void commentOnBlogPost(Long postId, String comment) {
        // Implement comment logic here
    }

    @Override
    public BlogPost createBlogPost(BlogPost blogPost) {
        return blogPostRepository.save(blogPost);
    }
}

