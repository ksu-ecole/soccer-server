package com.ksu.soccerserver.application;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import java.util.Optional;

public interface ApplicationTeamRepository extends JpaRepository<ApplicationTeam, Long> {
    List<ApplicationTeam> findByApplyTeamsId(Long applyTeamsId);
    List<ApplicationTeam> findAllByMatchId(Long matchId);
   ApplicationTeam  findByMatchId(Long matchId);
   Optional<ApplicationTeam> findByMatchIdAndApplyTeamsId(Long matchId, Long applyTeamsId);
}
