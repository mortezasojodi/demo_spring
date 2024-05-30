//package com.spring5.demo.core;
//
//import com.spring5.demo.model.Ingredient;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.jdbc.core.RowMapper;
//import org.springframework.stereotype.Repository;
//
//import java.sql.ResultSet;
//import java.sql.SQLException;
//
//@Repository
//public class JdbcIngredientRepository
//        implements IngredientRepository {
//    private JdbcTemplate jdbc;
//
//    @Autowired
//    public JdbcIngredientRepository(JdbcTemplate jdbc) {
//        this.jdbc = jdbc;
//    }
//
//    @Override
//    public Iterable<Ingredient> findAll() {
//        return null;
//    }
//
//    @Override
//    public Ingredient findOne(String id) {
//        return jdbc.queryForObject("select * from Ingredient", this::mapRowToIngredient, id);
//    }
//
//    @Override
//    public Ingredient save(Ingredient ingredient) {
//        return null;
//    }
//
//    private Ingredient mapRowToIngredient(ResultSet rs, int rowNum)
//            throws SQLException {
//        return new Ingredient(
//                rs.getString("id"),
//                rs.getString("name"),
//                Ingredient.Type.valueOf(rs.getString("type")));
//    }
//
//}