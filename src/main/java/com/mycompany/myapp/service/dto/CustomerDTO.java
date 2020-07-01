package com.mycompany.myapp.service.dto;

import java.io.Serializable;

/**
 * A DTO for the {@link com.mycompany.myapp.domain.Customer} entity.
 */
public class CustomerDTO implements Serializable {
    
    private Long id;

    private String lineUserId;

    private String nickname;

    private String useLanguage;

    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLineUserId() {
        return lineUserId;
    }

    public void setLineUserId(String lineUserId) {
        this.lineUserId = lineUserId;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getUseLanguage() {
        return useLanguage;
    }

    public void setUseLanguage(String useLanguage) {
        this.useLanguage = useLanguage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CustomerDTO)) {
            return false;
        }

        return id != null && id.equals(((CustomerDTO) o).id);
    }

    @Override
    public int hashCode() {
        return 31;
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "CustomerDTO{" +
            "id=" + getId() +
            ", lineUserId='" + getLineUserId() + "'" +
            ", nickname='" + getNickname() + "'" +
            ", useLanguage='" + getUseLanguage() + "'" +
            "}";
    }
}
