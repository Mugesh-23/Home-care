package com.elderly.elderly.dto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Servicedto {
    private Long id;
    private String name;
    private String provider;
    private String description;
    private Integer charges;
    private String timing;

}
