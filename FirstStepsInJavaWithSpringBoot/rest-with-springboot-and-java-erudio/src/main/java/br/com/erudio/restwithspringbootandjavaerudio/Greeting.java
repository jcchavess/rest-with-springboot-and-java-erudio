package br.com.erudio.restwithspringbootandjavaerudio;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
public class Greeting {

    private final long id;
    private final String content;


}
