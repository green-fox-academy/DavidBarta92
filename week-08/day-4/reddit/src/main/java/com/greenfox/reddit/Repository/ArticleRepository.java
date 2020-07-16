package com.greenfox.reddit.Repository;

import com.greenfox.reddit.Models.Article;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ArticleRepository extends CrudRepository<Article, Long> {
  @Query(value = "SELECT * FROM article ORDER BY popularity DESC", nativeQuery = true)
  List<Article> findAllOrderByPopularity(int from, int to);
}
