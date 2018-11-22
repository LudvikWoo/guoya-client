package com.guoyasoft.service;

import com.guoyasoft.bean.db.study.GyExercise;
import com.guoyasoft.bean.db.study.GyExerciseExample;
import com.guoyasoft.bean.db.study.GyExerciseExample.Criteria;
import com.guoyasoft.dao.study.GyExerciseMapper;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("studySvc")
public class StudySvcImpl implements IStudySvc {

  @Autowired
  GyExerciseMapper mapper;

  @Override
  public List<GyExercise> getExercises(GyExercise exercise) {
    GyExerciseExample example=new GyExerciseExample();
    Criteria criteria = example.createCriteria();
    criteria.andClassCodeEqualTo(exercise.getClassCode());
    criteria.andEffectStatusEqualTo(exercise.getEffectStatus());
    List<GyExercise> gyExercises = mapper.selectByExample(example);
    return gyExercises;
  }
}
