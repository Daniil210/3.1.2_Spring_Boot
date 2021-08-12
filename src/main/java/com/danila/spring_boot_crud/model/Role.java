
package com.danila.spring_boot_crud.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.security.core.GrantedAuthority;

import javax.persistence.*;

@Entity
@Table(name = "roles")
@Data//ломбок аннотация: генерирует геттеры, сеттеры, икуалс, хеш код методы
@NoArgsConstructor//ломбок аннотация: конструктор без аргуметов
public class Role implements GrantedAuthority{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String role;


    public Role(String role) {
        this.role = role;
    }

    @Override
    public String getAuthority() {
        return getRole();
    }

    @Override
    public String toString() {
        return role;
    }
}

