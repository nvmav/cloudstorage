package com.udacity.jwdnd.course1.cloudstorage.model;

public class UserFile {
  String id;
  String name;

  public UserFile(String name) {
    this.name = name;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
