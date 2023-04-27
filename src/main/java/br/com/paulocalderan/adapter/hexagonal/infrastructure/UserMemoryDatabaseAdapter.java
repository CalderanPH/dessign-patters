package br.com.paulocalderan.adapter.hexagonal.infrastructure;

import br.com.paulocalderan.adapter.hexagonal.core.model.User;
import br.com.paulocalderan.adapter.hexagonal.core.ports.UserRepository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserMemoryDatabaseAdapter implements UserRepository {

    private Map<String, User> memoryUsers = new HashMap<String, User>();

    @Override
    public void save(User user) {
        memoryUsers.put(user.getEmail(), user);
    }

    @Override
    public List<User> getAll() {
        return new ArrayList<User>(memoryUsers.values());
    }

}
