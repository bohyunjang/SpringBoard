package db.mysql.mapper;

import org.springframework.stereotype.Repository;
import java.util.List;
import com.spring.board.model.BoardModel;

@Repository(value="boardMapper")
public interface BoardMapper {
	
	List<BoardModel> selectList();

	BoardModel selectOne(int seq);

	int seqMax();
	
	void insert(BoardModel boardModel);

	void update(BoardModel boardModel);

	void delete(int idx);
}
