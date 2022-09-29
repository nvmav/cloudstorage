package com.udacity.jwdnd.course1.cloudstorage.model;

public class UserNote {
  Integer noteId;
  String title;
  String description;

  public UserNote(Integer noteId, String title, String description) {
    this.noteId = noteId;
    this.title = title;
    this.description = description;
  }

  public Integer getNoteId() {
    return noteId;
  }

  public void setNoteId(Integer noteId) {
    this.noteId = noteId;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }
}
