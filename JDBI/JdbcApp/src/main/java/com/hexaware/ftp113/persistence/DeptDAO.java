package com.hexaware.ftp113.persistence;
import com.hexaware.ftp113.model.Dept;
import org.skife.jdbi.v2.sqlobject.Bind;
import org.skife.jdbi.v2.sqlobject.SqlQuery;
import org.skife.jdbi.v2.sqlobject.SqlUpdate;
import org.skife.jdbi.v2.sqlobject.customizers.Mapper;
import java.util.List;

public interface DeptDAO  {

  @SqlQuery("SELECT * FROM Dept")
  @Mapper(DeptMapper.class)
  List<Dept> list();
}