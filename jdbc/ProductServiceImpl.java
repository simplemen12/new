package jdbc;

import java.util.List;

public class ProductServiceImpl implements Service {
	
	
	//DAO IMP
	
	private DAO dao; //인터페이스
	public ProductServiceImpl() {
		dao = new ProductDAOIPL();// 구현체
	}
	@Override
	public int register(JDCVO p) {
		// 실제 구현 영역
		System.out.println("register serivceImpl success!!");
		//각 DAO에게 저장 요청
		//DAO 요청시 SQL 구문과 비슷하게 메서드 명을 작성하는 것이 일반적 
		
		return dao.insert(p);
	}



	@Override
	public List<JDCVO> getList() {
		// TODO Auto-generated method stub
		 System.out.println();
	      return dao.selectList();
	}
	@Override
	public JDCVO getDatail(int pno) {
		// TODO Auto-generated method stub
		System.out.println("detail sericeImpl success!!");
		return dao.selectOne(pno);
	}


}
