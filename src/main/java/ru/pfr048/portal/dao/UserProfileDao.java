package ru.pfr048.portal.dao;

import ru.pfr048.portal.model.UserProfile;

import java.util.List;

/**
 * Created by 048ChubakovaEL on 08.08.2016.
 */
public interface UserProfileDao {

    List<UserProfile> findAll();

    UserProfile findByType(String type);

    UserProfile findById(int id);
}
