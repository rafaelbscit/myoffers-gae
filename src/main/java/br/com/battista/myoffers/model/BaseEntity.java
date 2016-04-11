package br.com.battista.myoffers.model;

import br.com.battista.myoffers.constants.EntityConstant;
import com.googlecode.objectify.annotation.Index;
import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import java.io.Serializable;
import java.util.Date;

@JsonAutoDetect
@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class BaseEntity implements Serializable {

    @Index
    private Date createdAt;
    @Index
    private Date updatedAt;
    private Long version;

    @JsonIgnore
    public abstract Object getPk();

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public BaseEntity version(final Long version) {
        this.version = version;
        return this;
    }

    public void initEntity() {
        createdAt = new Date();
        updatedAt = createdAt;
        version = EntityConstant.DEFAULT_VERSION;
    }

}
