package aisw.web.biz;

import java.beans.BeanProperty;
import java.lang.annotation.Annotation;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;
import javax.websocket.server.ServerEndpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import aisw.web.biz.JDBCUtil;

@Service
public class BoardDAO {

    private Connection conn;
    private PreparedStatement stmt;
    private ResultSet rs;
    
    @Autowired
    private DataSource dataSource;

    // 문의글 전체 보기
    public List<BoardVO> getBoardList() {
        StringBuilder sql = new StringBuilder();
        
        sql.append("SELECT *");
        sql.append("  FROM NEWS_BOARD");
        sql.append(" ORDER BY B_NO DESC");
        
        // spring JDBC
        JdbcTemplate template = new JdbcTemplate();
        template.setDataSource(dataSource);
        List<BoardVO> boardList = template.query(sql.toString(), new BeanPropertyRowMapper<>(BoardVO.class));
        return boardList;
    }

    // 글 하나보기
    public BoardVO getBoard(int b_no) {
        StringBuilder sql = new StringBuilder();

        sql.append("SELECT * FROM NEWS_BOARD WHERE B_NO = ?");
        
        // spring JDBC
        JdbcTemplate template = new JdbcTemplate();
        template.setDataSource(dataSource);
        BoardVO board = template.queryForObject(sql.toString(), new BeanPropertyRowMapper<>(BoardVO.class), b_no);
        
        return board;
    }
    
    // 조회수 증가
    public void increaseHitCount(int b_no) {
        String sql = "UPDATE NEWS_BOARD SET HIT = HIT + 1 WHERE B_NO = ?";

        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
        jdbcTemplate.update(sql, b_no);
    }
    
   // 글 등록
    public int insertBoard(BoardVO board) {
        int result = 0;
        StringBuilder sql = new StringBuilder();
        sql.append("INSERT INTO NEWS_BOARD (");
        sql.append("       TITLE,");
        sql.append("       CONTENT,");
        sql.append("       IMAGE");
        sql.append(") VALUES (?, ?, ?)");
        
     // spring JDBC
        JdbcTemplate template = new JdbcTemplate();
        template.setDataSource(dataSource);
        result = template.update(sql.toString(), board.getTitle(), board.getContent(), board.getImage());
        return result;
    }
    
    // 글 삭제
    public int deleteBoard(int b_no) {
    	int result = 0;
    	StringBuilder sql = new StringBuilder();
    	sql.append(" DELETE FROM NEWS_BOARD");
    	sql.append(" WHERE B_NO = ?");
    	
    	// spring JDBC
    	JdbcTemplate template = new JdbcTemplate();
    	template.setDataSource(dataSource);
    	result = template.update(sql.toString(), b_no);
    	return result;
    }
    
    // 글 수정
    public int updateBoard(BoardVO board) {
    	int result = 0;
    	StringBuilder sql = new StringBuilder();
    	sql.append(" UPDATE NEWS_BOARD");
    	sql.append("    SET TITLE = ?, CONTENT = ?");
    	sql.append(" WHERE B_NO = ?");
    	
    	// spring JDBC
    	JdbcTemplate template = new JdbcTemplate();
    	template.setDataSource(dataSource);
    	result = template.update(sql.toString(), board.getTitle(), board.getContent(), board.getB_no());
    	return result;
    }

}
