package com.udacity.course3.reviews.entity;


import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;
import java.util.Set;

@Entity
@Table(name="review")
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="review_id")
    private int reviewId;

    @Column(name="review_title")
    private String reviewTitle;

    @Column(name="review_text")
    private String reviewText;

    @Column(name="review_rating")
    private int reviewRating;

    @Column(name="review_created_time")
    private Timestamp reviewCreatedTime;

    @JsonIgnore
    @OneToMany(mappedBy="review")
    private List<Comment> commentList;

    @ManyToOne
    @JoinColumn(name="product_id", nullable=false)
    private Product product;


    public Review (){

    }

    public Review (int reviewId){

        this.reviewId = reviewId;
    }
    public int getReviewId() {
        return reviewId;
    }

    public void setReviewId(int reviewId) {
        this.reviewId = reviewId;
    }

    public String getReviewTitle() {
        return reviewTitle;
    }

    public void setReviewTitle(String reviewTitle) {
        this.reviewTitle = reviewTitle;
    }

    public String getReviewText() {
        return reviewText;
    }

    public void setReviewText(String reviewText) {
        this.reviewText = reviewText;
    }

    public int getReviewRating() {
        return reviewRating;
    }

    public void setReviewRating(int reviewRating) {
        this.reviewRating = reviewRating;
    }

    public Timestamp getReviewCreatedTime() {
        return reviewCreatedTime;
    }

    public void setReviewCreatedTime(Timestamp reviewCreatedTime) {
        this.reviewCreatedTime = reviewCreatedTime;
    }


    public List<Comment> getCommentList() {
        return commentList;
    }

    public void setCommentList(List<Comment> commentList) {
        this.commentList = commentList;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
