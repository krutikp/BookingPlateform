package com.booking.repositories;

import com.booking.model.Theatres;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ITheatreRepository extends JpaRepository<Theatres,String> {


    @Query(value = "SELECT T.THEATRE_ID, T.THEATRE_NAME, L.LOCATION_CITY FROM THEATRES T " +
            "INNER JOIN LOCATIONS L ON T.LOCATION_ID = L.LOCATION_ID " +
            "WHERE L.LOCATION_CITY = :city ", nativeQuery = true)
    List<Theatres> getAllTheatresByCity(@Param("city") String city);
}
