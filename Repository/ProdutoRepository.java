package com.Implementacao.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Implementacao.Entity.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long>{

}
