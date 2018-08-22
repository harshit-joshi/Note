package com.example.harshitjoshi.notes;

public class Note
{
    String title;
    String description;
    int priority;

    public Note()
    {
        //This is needed for firebase
    }

    public Note(String title, String description, int priority)
    {
        this.title = title;
        this.description = description;
        this.priority = priority;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public int getPriority() {
        return priority;
    }
}
