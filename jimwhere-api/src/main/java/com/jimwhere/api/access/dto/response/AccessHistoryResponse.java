package com.jimwhere.api.access.dto.response;

import com.jimwhere.api.access.domain.AccessHistory;
import com.jimwhere.api.access.domain.AccessResult;
import com.jimwhere.api.access.domain.IsOwner;
import com.jimwhere.api.access.domain.VisitPurpose;
import java.time.LocalDateTime;

public record AccessHistoryResponse (
    Long accessHistoryCode,
    IsOwner isOwner,
  VisitPurpose visitPurpose,
  Long roomCode,

    LocalDateTime accessedAt,
    AccessResult accessResult){

  public static AccessHistoryResponse  from(AccessHistory accessHistory) {
    return new AccessHistoryResponse(
        accessHistory.getAccessHistoryCode(),
    accessHistory.getIsOwner(),
    accessHistory.getVisitPurpose(),
        accessHistory.getRoomCode(),
        accessHistory.getAccessedAt(),
        accessHistory.getAccessResult());
  }
}

