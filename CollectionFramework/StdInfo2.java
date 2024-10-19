package com.CollectionFramework;

import java.util.Objects;

public class StdInfo2
{
    int id;
    String name;

    public StdInfo2(int id,String name)
    {
        this.id = id;
        this.name=name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof StdInfo2 stdInfo2)) return false;
        return id == stdInfo2.id && Objects.equals(name, stdInfo2.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}
