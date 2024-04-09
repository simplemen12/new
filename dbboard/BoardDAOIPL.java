package dbboard;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import jdbc.DatabaseConnection;
import jdbc.JDCVO;

public class BoardDAOIPL implements DAO2 {
	
	 
	   // db 연결
	   private Connection conn;
	   // sql 구분을 실행시키는 기능하는 객체
	   private PreparedStatement pst;
	   // 쿼리구문 저장 스트링
	   private String query="";
	   
	   public BoardDAOIPL() {
	      // DBConnection class 생성 (싱글톤)
		   DBcon dbc = DBcon.getInstance();
		   conn = dbc.getConnection();
	   }

	@Override
	public int insert(BoardVO p) {
		System.out.println("insert DAOIMP success");
		
		query = "insert into board(title,writer,content) values(?,?,?)"; 
		
			try {
				//this(title,writer,text);
				pst = conn.prepareStatement(query);
				
				pst.setString(1, p.getTitle()); //1 번 파라미터 값을 설정
				pst.setString(2, p.getWriter()); //2 번 파라미터 값을 설정
				pst.setString(3, p.getText()); //3 번 파라미터 값을 설정
				//insert, update, delte => excuteUpdate() return int (처리개수로 리턴)
				return pst.executeUpdate();
			
		}catch(SQLException e) {
			System.out.println("insert Error!!");
			
			e.printStackTrace();
			
		}
		
		return 0;
	}

	@Override
	public List<BoardVO> selectList() {
		System.out.println("list DAOImpl success");
		query="select * from board order by bno desc";
		 List<BoardVO> list = new ArrayList<>();
		

		
		try {
			pst =conn.prepareStatement(query);
			ResultSet rs = pst.executeQuery();
			//this(title,writer,text);
			while(rs.next()) {
				list.add(new BoardVO(rs.getString("title"),
						rs.getString("writer"),
						rs.getString("content")	));
				
			}
			return list;
			
		}catch(Exception e){
			System.out.println("값이 없음!");
		}
		
		return null;
	}

	@Override
	public BoardVO selectOne(int bno) {
		// TODO Auto-generated method stub
				System.out.println("insertOne DAOIMP success");
				query="select * from board order by bno=?";
				try {
					pst =conn.prepareStatement(query);
					pst.setInt(1, bno);
					ResultSet rs = pst.executeQuery();		
					if(rs.next()) {//있으면 가져와!
						return new BoardVO(
								rs.getInt("bno"),
								rs.getString("title"),
								rs.getString("content"),
								rs.getString("regdate"),
								rs.getString("regdate"),
								rs.getString("moddate") //순서대로
								);
					
						
						/*
						 *public BoardVO (int bno, String title, String writer, String text예만 sql 상 content, String regdate, String madeby) {
		this(title,writer,text);
		this.moddate = moddate;
		this.regdate = regdate; 
						 * */
						
					}
				}catch(SQLException e) {
					System.out.println("DETAIL ERROR");
					e.printStackTrace();
					
				}
				
				return null;
	}

	
	@Override
	public int update(BoardVO p) {
	    System.out.println("modify success");
	    query = "update board set title=?, writer=?, Content=?, regdate=now(),moddate=now() where bno=?";
	    try {
	        pst = conn.prepareStatement(query);
	        pst.setString(1, p.getTitle());
	        pst.setString(2, p.getWriter());
	        pst.setString(3, p.getText()); 
	        pst.setInt(4, p.getBno());
	        return pst.executeUpdate();
	    } catch (SQLException e) {
	        System.out.println("update error");
	        e.printStackTrace();
	    }
	    return 0;
	}

	@Override
	public int remove(BoardVO p) {
		System.out.println("remove success");
		query = "delete from board where bno=?";
		try {
		    pst = conn.prepareStatement(query);
		    pst.setInt(1, p.getBno());
		    
		    return pst.executeUpdate();
		} catch(SQLException e) {
		    System.out.println("remove error");
		    e.printStackTrace();
		}
		return 0;
	}
	

}
