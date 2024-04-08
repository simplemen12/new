package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductDAOIPL implements DAO{
	

	   
	   // db 연결
	   private Connection conn;
	   // sql 구분을 실행시키는 기능하는 객체
	   private PreparedStatement pst;
	   // 쿼리구문 저장 스트링
	   private String query="";
	   
	   public ProductDAOIPL() {
	      // DBConnection class 생성 (싱글톤)
		   DatabaseConnection dbc = DatabaseConnection.getInstance();
		   conn = dbc.getConnection();
		   
		   }

	@Override
	public int insert(JDCVO p) {
		System.out.println("insert DAOIMP success");
		query = "insert into product(pname,price,madeby) values(?,?,?)"; 
		
			try {
				pst = conn.prepareStatement(query);
				pst.setString(1, p.getPname()); //1 번 파라미터 값을 설정
				pst.setInt(2, p.getPrice()); //2 번 파라미터 값을 설정
				pst.setString(3, p.getmadeby()); //3 번 파라미터 값을 설정
				//insert, update, delte => excuteUpdate() return int (처리개수로 리턴)
				return pst.executeUpdate();
			
		}catch(SQLException e) {
			System.out.println("insert Error!!");
			
			e.printStackTrace();
			
		}
		
		return 0;
	}
	   
	   //sql 구문실행
	
	@Override
	public List<JDCVO> selectList() {
		System.out.println("list DAOImpl success");
		query="select * from product order by pno desc";
		 List<JDCVO> list = new ArrayList<>();
		
	

		
		
		try {
			pst =conn.prepareStatement(query);
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				list.add(new JDCVO(rs.getInt("pno"),
						rs.getString("pname"),
						rs.getInt("price")	));
				
			}
			return list;
			
		}catch(Exception e){
			System.out.println("값이 없음!");
		}
		
		return null;
	}

	@Override
	public JDCVO selectOne(int pno) {
		// TODO Auto-generated method stub
		System.out.println("insertOne DAOIMP success");
		query="select * from product order by pno=?";
		try {
			pst =conn.prepareStatement(query);
			pst.setInt(1, pno);
			ResultSet rs = pst.executeQuery();		
			if(rs.next()) {//있으면 가져와!
				return new JDCVO(
						rs.getInt("pno"),
						rs.getString("pname"),
						rs.getInt("price"),
						rs.getString("regdate"),
						rs.getString("madeby") //순서대로
						);
				
			}
		}catch(SQLException e) {
			System.out.println("DETAIL ERROR");
			e.printStackTrace();
			
		}
		
		return null;
	}

	}

