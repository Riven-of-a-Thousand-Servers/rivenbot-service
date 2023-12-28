package com.danielvm.destiny2bot.dto.destiny.characters;

import java.util.Map;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CharacterData {

  private Map<String, UserCharacter> characterMap;

}
