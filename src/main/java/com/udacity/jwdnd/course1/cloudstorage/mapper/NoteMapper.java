package com.udacity.jwdnd.course1.cloudstorage.mapper;

import com.udacity.jwdnd.course1.cloudstorage.model.User;
import com.udacity.jwdnd.course1.cloudstorage.model.UserNote;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface NoteMapper {
  @Select("SELECT * FROM UserNotes WHERE title = #{title}")
  User getUserNote(String title);

  @Insert("INSERT INTO UserNotes (title, description) VALUES(#{title}, #{description}")
  void insert(UserNote userNote);

  @Update("UPDATE UserNotes SET title=#{title}, description =#{description} WHERE id =#{id}")
  void updateVillage(UserNote userNote);

  @Delete("Delete from UserNotes where title=#{title}")
  public void deleteUserNote(String title);
}
