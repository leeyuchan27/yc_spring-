package com.example.bookTest.Dao;

import java.sql.JDBCType;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.tree.RowMapper;
import javax.swing.tree.TreePath;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.bookTest.Dto.BookDto;

@Repository 
public class BookDAO {
	private final JDBCType jt;
	
	public  BookDAO(JDBCType jdbcTemplate) {
		this.jt=jdbcTemplate;
	}
	
	public void delete(int bid) { 
		String sql="delete from book where book_id=?";
		
		jt.update(sql, bid);
	}
	
	
	
	
	public BookDto findId(int id) {
		String sql="select * from book where book_id=?";
		
		BookDto data=jt.queryForObject(sql,
				new RowMapper() {
				public BookDto mapRow(ResultSet rs,int rowNum) throws SQLException{
					BookDto dto=new BookDto();
					BookDto bookDto;
					bookDto.setBookAuthor(rs.getString("book_author"));
				}

				@Override
				public int[] getRowsForPaths(TreePath[] path) { m
					// TODO Auto-generatedethod stub
					return null;
				}
			}
				,id);
	}
	public void update(BookDto bookDto) {
		String sql="update book set book_title=?,book_author=?,"+
				" book_cost=?, book_page=?,publisher=?"+
				" where book_id=?";
		
		jt.update(sql, bookDto.getBookTitle(), bookDto.getBookAuthor(),
				bookDto.getBookCost(),bookDto.getBookPage(),
				bookDto.getPublisher(),bookDto.getBookId());
				
	}
} 
