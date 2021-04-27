package com.mvc.upgrade.model.biz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mvc.upgrade.model.dao.MYBoardDao;
import com.mvc.upgrade.model.dto.MYBoardDto;

@Service
public class MyBoardBizImpl implements MyBoardBiz {
	
	@Autowired
	private MYBoardDao dao; 
	//proxy를 통해 객체가 생성될때 인터페이스를 통해 가져오기때문에 무조건 부모타입인 인터페이스 타입으로 자식객체를 가져와야한다. 
	
	
	@Override
	public List<MYBoardDto> selectList() {
		return dao.selectList();
	}

	@Override
	public MYBoardDto selectOne(int myno) {
		return dao.selectOne(myno);
	}

	@Override
	public int insert(MYBoardDto dto) {
		return dao.insert(dto);
	}

	@Override
	public int update(MYBoardDto dto) {
		return dao.update(dto);
	}

	@Override
	public int delete(int myno) {
		return dao.delete(myno);
	}

}
