package com.aait.aaitims.Repositories;

import com.aait.aaitims.Entity.NoticeBoard;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NoticeBoardRepository extends JpaRepository<NoticeBoard, Long>{

}

