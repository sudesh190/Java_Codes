package com.FunctionalInterfaceWithlamdaExpression;

public class book1
{
    private int id;
    private String name;
    private String author;

    public book1(int id , String name, String author)
    {
        this.id=id;
        this.name=name;
        this.author=author;
    }

    @Override
    public String toString() {
        return "book1{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';

    }
}
