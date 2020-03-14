package org.apache.ibatis.domain;

import java.io.Serializable;

public class Person implements Serializable {
    /**
	* 主键
	*/
    private Integer id;

    /**
	* 名字
	*/
    private String name;

    /**
	* 详情
	*/
    private String context;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", context=").append(context);
        sb.append("]");
        return sb.toString();
    }
}