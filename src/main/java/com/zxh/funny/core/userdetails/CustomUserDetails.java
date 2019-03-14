package com.zxh.funny.core.userdetails;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

import java.util.Collection;
import java.util.Objects;

/**
 * @program: plugs
 *
 * @description: 定制userdetails对象
 *
 * @author: Mr.Zhang
 *
 * @create: 2019-01-27 19:03
 **/
public class CustomUserDetails extends User {
    private static final long serialVersionUID = -4461471539260584625L;

    private Long userId;

    private String nickname;

    private String language;

    public CustomUserDetails(String username, String password, Long userId, String nickname, String language,
                             Collection<? extends GrantedAuthority> authorities) {
        super(username, password, authorities);
        this.userId = userId;
        this.nickname = nickname;
        this.language = language;
    }

    public Long getUserId() {
        return userId;
    }

    public String getNickname() {
        return nickname;
    }

    public String getLanguage() {
        return language;
    }

    @Override
    public int hashCode() {
        return 31 * super.hashCode() + Objects.hash(userId, getUsername(), nickname, language);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        if (!super.equals(obj)) {
            return false;
        }
        final CustomUserDetails other = (CustomUserDetails) obj;
        return Objects.equals(this.userId, other.userId)
                && Objects.equals(this.getUsername(), other.getUsername())
                && Objects.equals(this.nickname, other.nickname)
                && Objects.equals(this.language, other.language);
    }

    @Override
    public String toString() {
        return "CustomUserDetails{" +
                "userId=" + userId +
                ", username='" + getUsername() + '\'' +
                ", nickname='" + nickname + '\'' +
                ", language='" + language + '\'' +
                '}';
    }
}

