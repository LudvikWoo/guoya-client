package com.guoyasoft.service;

import com.guoyasoft.bean.db.study.GyExercise;
import java.util.List;

public interface IStudySvc {
  public List<GyExercise> getExercises(GyExercise exercise);
}
