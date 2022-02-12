package moviereview.moviereview.repository;

import moviereview.moviereview.models.Review;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ReviewRepository extends JpaRepository<Review,Long> {
    List<Review> findByMovieId(Long movieId);
}
