package it.cynerea.project.be.repository.party;

import it.cynerea.project.be.model.dao.party.Member;
import it.cynerea.project.be.model.dao.party.id.MemberId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberRepository extends JpaRepository<Member, MemberId> {
}