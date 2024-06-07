package it.cynerea.project.be.repo;


import it.cynerea.project.be.model.dao.Paragraph;
import it.cynerea.project.be.model.dao.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface PostRepository extends JpaRepository<Post, UUID> {
}
