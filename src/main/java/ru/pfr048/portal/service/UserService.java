package ru.pfr048.portal.service;

import ru.pfr048.portal.model.User;

import java.util.List;

/**
 * Created by 048ChubakovaEL on 08.08.2016.
 */
public interface UserService {

    User findById(int id);

    User findBySSO(String sso);

    void saveUser(User user);

    void updateUser(User user);

    void deleteUserBySSO(String sso);

    List<User> findAllUsers();

    boolean isUserSSOUnique(Integer id, String sso);

}