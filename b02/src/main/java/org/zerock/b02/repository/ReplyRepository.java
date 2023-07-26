package org.zerock.b02.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.zerock.b02.domain.Reply;

public interface ReplyRepository extends JpaRepository<Reply, Long> {
}
