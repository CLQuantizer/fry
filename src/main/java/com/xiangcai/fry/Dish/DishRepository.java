package com.xiangcai.fry.Dish;
import com.xiangcai.fry.Bar;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DishRepository extends JpaRepository<Bar, Integer> {
}