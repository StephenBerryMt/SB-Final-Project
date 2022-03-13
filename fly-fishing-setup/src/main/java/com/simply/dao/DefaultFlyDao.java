package com.simply.dao;

import java.math.BigDecimal;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import com.simply.entity.FFSetup;
import com.simply.entity.FlyLine;
import com.simply.entity.FlyReel;
import com.simply.entity.FlyRod;



public class DefaultFlyDao {
	
	private NamedParameterJdbcTemplate jdbcTemplate;

	public List<FFSetup> fetchSetup(FlyRod rod, FlyReel reel, FlyLine line ) {
		log.debug("DAO: rod={}, reel={}, line={}", rod, reel, line);
	
	}

		@Override
		public setup mapRow(ResultSet rs, int rowNum) throws SQLException {
//			@formatter:off  
				return FlyRod.builder()
					.rod_model(rod_model.SAGE)
					.rod_weight(5)
					.rod_length("9 foot")
					.build());
					.build();
					
					
//			@formatter:on
		}});
	
}
