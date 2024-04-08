package jdbc;

import java.util.List;

public interface DAO {

	int insert(JDCVO p);

	List<JDCVO> selectList();

	JDCVO selectOne(int pno);

}
