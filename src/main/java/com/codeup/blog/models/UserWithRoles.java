package com.codeup.blog.models;

import java.util.Collection;

public class UserWithRoles extends User implements UserDetails {

    public UserWithRoles(User user) {
        super(user);

        @Override
        public Collection<? extends GrantAuthority> getAuthorit
    }
}
