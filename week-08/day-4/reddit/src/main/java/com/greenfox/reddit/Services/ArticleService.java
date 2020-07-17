package com.greenfox.reddit.Services;

import com.greenfox.reddit.Models.Article;
import com.greenfox.reddit.Repository.ArticleRepository;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class ArticleService implements ArticalServiceInterface {
  @Autowired
  private ArticleRepository articleRepository;

  public ArticleService(ArticleRepository articleRepository) {
    this.articleRepository = articleRepository;
  }

  @Override
  public void raise(Long id){
    Article article = articleRepository.findById(id).orElse(null);
    article.raisePopularity();
    articleRepository.save(article);
  }

  @Override
  public void reduce(Long id){
    Article article = articleRepository.findById(id).orElse(null);
    article.reducePopularity();
    articleRepository.save(article);
  }

  @Override
  public void addNew(String title, String content){
    articleRepository.save(new Article(title, content));
  }

  public List<Article> findAllOrderByPopularity(int min, int max){
    List<Article> articles = articleRepository.findAllOrderByPopularity(min, max);
    return articles;
  }
}
