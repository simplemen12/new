package jdbc;

import java.util.List;

public interface Service {

	int register(JDCVO p);

	List<JDCVO> getList();

	JDCVO getDatail(int pno);



	
	
	
}
