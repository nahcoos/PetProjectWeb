package com.pet.taketable.model.repository;

import java.util.List;

import com.pet.taketable.domain.TakeTable;

public interface TakeTableDAO {
	public List selectAll();

	public List selectMember(String member_id);

	public TakeTable selectOne(int taketable_id);

	public void insert(TakeTable takeTable);

	public void delete(int taketable_id);

	public void deleteMember(String member_id);

	public void update(TakeTable takeTable);
}
