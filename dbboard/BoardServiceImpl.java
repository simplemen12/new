package dbboard;

import dbboard.DAO2;

import java.util.List;

import dbboard.BoardDAOIPL;

public class BoardServiceImpl implements Service {
	

	//DAO IMP
	
	private DAO2 dao; //인터페이스
	public BoardServiceImpl() {
	dao = new BoardDAOIPL();// 구현체
	}
	@Override
	public int addBoard(BoardVO p) {
		// 실제 구현 영역
		System.out.println("register serivceImpl success!!");
		//각 DAO에게 저장 요청
		//DAO 요청시 SQL 구문과 비슷하게 메서드 명을 작성하는 것이 일반적 
		
		return dao.insert(p);
	}
	@Override
	public List<BoardVO> getList() {
		// TODO Auto-generated method stub
				 System.out.println();
			      return dao.selectList();
	}
	@Override
	public BoardVO getSearch(int bno) {
		// TODO Auto-generated method stub
				System.out.println("detail sericeImpl success!!");
				return dao.selectOne(bno);
	}
	@Override
	public int modifyBoard(BoardVO p) {
		// TODO Auto-generated method stub
				System.out.println("modify sericeImpl success!!");
				return  dao.update(p);
	}
	@Override
	public int removeBoard(BoardVO p) {
		// TODO Auto-generated method stub
		System.out.println("remove sericeImpl success!!");
		return  dao.remove(p);
	}

}
