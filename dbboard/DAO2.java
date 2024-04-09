package dbboard;
import java.util.List;
public interface DAO2 {

	int insert(BoardVO p);

	List<BoardVO> selectList();

	BoardVO selectOne(int bno);

	int update(BoardVO p);

	int remove(BoardVO p);

}
