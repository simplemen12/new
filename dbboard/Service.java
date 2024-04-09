package dbboard;
import java.util.List;
public interface Service {

	int addBoard(BoardVO p);

	List<BoardVO> getList();

	BoardVO getSearch(int bno);

	int modifyBoard(BoardVO p);

	int removeBoard(BoardVO p);

}
