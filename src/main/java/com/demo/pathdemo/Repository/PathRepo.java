package com.demo.pathdemo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.pathdemo.Model.PathModel;

public interface PathRepo extends JpaRepository <PathModel,Integer>{

}
