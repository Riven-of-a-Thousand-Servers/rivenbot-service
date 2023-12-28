package com.danielvm.destiny2bot.dto.destiny.characters;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserCharacter {

  private String membershipId;
  private Integer membershipType;
  private String CharacterId;
  private Integer light;
  private Long raceHash;
  private Long genderHash;
  private Long classHash;

}
