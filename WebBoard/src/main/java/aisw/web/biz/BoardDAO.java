package aisw.web.biz;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import aisw.web.biz.JDBCUtil;

public class BoardDAO {

    private Connection conn;
    private PreparedStatement stmt;
    private ResultSet rs;

    // 문의글 전체 보기
    public List<BoardVO> getBoardList() {
        List<BoardVO> boardList = new ArrayList<BoardVO>();
        StringBuilder sql = new StringBuilder();

        sql.append("SELECT *");
        sql.append("  FROM BANK_BOARD");
        sql.append(" ORDER BY B_NO DESC");
        sql.append("  ");
        try {
            conn = JDBCUtil.getConnection();
            stmt = conn.prepareStatement(sql.toString());

            rs = stmt.executeQuery();

            while (rs.next()) {
                BoardVO board = new BoardVO();
                board.setB_no(rs.getInt("B_NO"));
                board.setTitle(rs.getString("TITLE"));
                board.setWriter(rs.getString("USER_ID"));
                board.setReg_date(rs.getDate("REG_DATE"));
                boardList.add(board);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return boardList;
    }

    // 문의글 하나보기
    public BoardVO getBoard(int b_no) {
        BoardVO board = null;
        StringBuilder sql = new StringBuilder();

        sql.append("SELECT * FROM BANK_BOARD WHERE B_NO = ?");
        try {
            conn = JDBCUtil.getConnection();
            stmt = conn.prepareStatement(sql.toString());
            stmt.setInt(1, b_no);

            rs = stmt.executeQuery();

            if (rs.next()) {
                board = new BoardVO();
                board.setB_no(rs.getInt("B_NO"));
                board.setTitle(rs.getString("TITLE"));
                board.setContent(rs.getString("CONTENT"));
                board.setReg_date(rs.getDate("REG_DATE"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return board;
    }

}
