package ru.pfr048.portal.service;

import ru.pfr048.portal.model.UserProfile;

import java.util.List;

/**
 * Created by 048ChubakovaEL on 08.08.2016.
 */
public interface UserProfileService {

    UserProfile findById(int id);

    UserProfile findByType(String type);

    List<UserProfile> findAll();

}