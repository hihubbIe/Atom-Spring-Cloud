package com.tp5.atom;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
public class InitDB implements CommandLineRunner {

    @Autowired
    private JdbcTemplate template;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Database startup");

        String sql = """
                INSERT INTO atom (fullname, atomicnumber, symbol)
                VALUES ('Hydrogen', 1, 'H'),
                       ('Helium', 2, 'He'),
                       ('Lithium', 3, 'Li'),
                       ('Beryllium', 4, 'Be'),
                       ('Boron', 5, 'B'),
                       ('Carbon', 6, 'C'),
                       ('Nitrogen', 7, 'N'),
                       ('Oxygen', 8, 'O'),
                       ('Fluorine', 9, 'F'),
                       ('Neon', 10, 'Ne');
                """;

        template.execute(sql);

        System.out.println("All data :");
        template.query("SELECT * FROM atom", new RowMapper<Object>() {
            @Override
            public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
                System.out.println("name: " + rs.getString("fullname") +
                        ", atomicN: " + rs.getInt("atomicnumber") +
                        ", symbol: " + rs.getString("symbol"));
                return null;
            }
        });
    }
}
