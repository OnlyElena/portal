package ru.pfr048.portal.dao;

import ru.pfr048.portal.model.User;

import java.util.List;

/**
 * Created by 048ChubakovaEL on 08.08.2016.
 */
public interface UserDao {

    User findById(int id);

    User findBySSO(String sso);

    void save(User user);

    void deleteBySSO(String sso);

    List<User> findAllUsers();

}