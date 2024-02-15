package com.danielvm.destiny2bot.dto.destiny;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DestinyUserInfo {

  private String iconPath;

  private Integer membershipType;

  private Long membershipId;

  private String displayName;

  private Boolean isPublic;

  private String bungieGlobalDisplayName;

  private Integer bungieGlobalDisplayNameCode;
}
