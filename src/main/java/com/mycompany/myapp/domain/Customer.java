package com.mycompany.myapp.domain;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;

import java.io.Serializable;

/**
 * A Customer.
 */
@Entity
@Table(name = "customer")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class Customer implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    private Long id;

    @Column(name = "line_user_id")
    private String lineUserId;

    @Column(name = "nickname")
    private String nickname;

    @Column(name = "use_language")
    private String useLanguage;

    // jhipster-needle-entity-add-field - JHipster will add fields here
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLineUserId() {
        return lineUserId;
    }

    public Customer lineUserId(String lineUserId) {
        this.lineUserId = lineUserId;
        return this;
    }

    public void setLineUserId(String lineUserId) {
        this.lineUserId = lineUserId;
    }

    public String getNickname() {
        return nickname;
    }

    public Customer nickname(String nickname) {
        this.nickname = nickname;
        return this;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getUseLanguage() {
        return useLanguage;
    }

    public Customer useLanguage(String useLanguage) {
        this.useLanguage = useLanguage;
        return this;
    }

    public void setUseLanguage(String useLanguage) {
        this.useLanguage = useLanguage;
    }
    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Customer)) {
            return false;
        }
        return id != null && id.equals(((Customer) o).id);
    }

    @Override
    public int hashCode() {
        return 31;
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "Customer{" +
            "id=" + getId() +
            ", lineUserId='" + getLineUserId() + "'" +
            ", nickname='" + getNickname() + "'" +
            ", useLanguage='" + getUseLanguage() + "'" +
            "}";
    }
}
