package com.mestredahorta.ecomerce.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mestredahorta.ecomerce.model.produto;

@Repository
public interface ProdutoRepository  extends JpaRepository<produto, Long> {
	public List<produto> findAllByNomeContainingIgnoreCase (String nome);
}
