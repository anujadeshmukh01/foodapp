package com.first.FoodApp.review.services;

import com.first.FoodApp.response.Response;
import com.first.FoodApp.review.dtos.ReviewDTO;

import java.util.List;

public interface ReviewService {



    Response<ReviewDTO> createReview(ReviewDTO reviewDTO);
    Response<List<ReviewDTO>> getReviewsForMenu(Long menuId);
    Response<Double> getAverageRating(Long menuId);
}
