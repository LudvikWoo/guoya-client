package com.guoyasoft.service;

import com.guoyasoft.bean.db.classes.TClassClass;
import com.guoyasoft.bean.db.classes.TClassClassExample;
import com.guoyasoft.bean.db.study.GyExercise;
import com.guoyasoft.bean.db.study.GyExerciseExample;
import com.guoyasoft.bean.db.study.GyExerciseExample.Criteria;
import com.guoyasoft.dao.classes.TClassClassMapper;
import com.guoyasoft.dao.study.GyExerciseMapper;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("studySvc")
public class StudySvcImpl implements IStudySvc {

  @Autowired
  GyExerciseMapper mapper;

  @Autowired
  TClassClassMapper classMapper;

  @Override
  public List<GyExercise> getExercises(GyExercise exercise) {
    GyExerciseExample example=new GyExerciseExample();
    Criteria criteria = example.createCriteria();
    criteria.andClassCodeEqualTo(exercise.getClassCode());
    criteria.andEffectStatusEqualTo(exercise.getEffectStatus());
    List<GyExercise> gyExercises = mapper.selectByExample(example);
    return gyExercises;
  }

  @Override
  public List<TClassClass> getClasses(TClassClass classClass) {
    TClassClassExample example=new TClassClassExample();

    List<TClassClass> list=classMapper.selectByExample(example);
    return list;
  }
}
